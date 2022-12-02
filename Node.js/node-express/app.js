// 웹 서버 모듈 가져오기
const express = require('express');

// .env 파일의 내용을 읽어서 process.env에 저장
const dotenv = require('dotenv');
// .env 읽어오기
dotenv.config()

// 웹 서버 객체 생성, 포트 설정
const app = express();
//app.set('port', 3000);
app.set('port', process.env.PORT);

// 로그 출력
const morgan = require('morgan');
app.use(morgan('dev'));

// post 방식의 파라미터를 읽을 수 있도록 설정
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

// 쿠키 사용이 가능하도록 설정
const cookieParser = require('cookie-parser');
app.use(cookieParser(process.env.COOKIE_SECRET));

// 파일을 업로드하기 위한 디렉토리 생성
const fs = require('fs');
try {
    // 디렉토리를 읽는데, 디렉토리가 없으면 예외 발생
    fs.readdirSync('uploads');
} catch (error) {
    // 디렉토리 생성
    fs.mkdirSync('uploads');
}

// 파일 업로드 설정
const multer = require('multer');
const upload = multer({
    storage: multer.diskStorage({
        destination(req, file, done) {
            done(null, 'uploads');
        },
        filename(req, file, done) {
            // 파일 업로드 설정을 수정(한글 인코딩)
            file.originalname = Buffer.from(file.originalname,'latin1').toString('utf8');

            const ext = path.extname(file.originalname);
            done(null, path.basename(file.originalname, ext) + Date.now() + ext);
        }
    }),
    limits: { fileSize: 1024 * 1024 * 10 }
});

// 사용자의 요청 처리
// 요청 처리 메서드는 get, post, put(patch), delete, options
/*
app.요청처리메서드('url', (req, res) => {
    // 처리

    // 응답
    // send(직접 출력 내용 작성) - 정적인 텍스트나 HTML 출력
    // sendFile(html 파일 경로) - 정적인 텍스트나 HTML 출력
    // json(JSON 데이터) - 서버에서 클라이언트에게 데이터를 전송, 서버 랜더링을 하지 않음
});
*/

// 절대 경로 생성을 위해서 사용
const path = require('path');
// 세션 사용을 위한 모듈을 가져오기
const session = require('express-session');
const { urlencoded } = require('express');
// 세션을 파일에 저장하기 위한 모듈 가져오기
const FileStore = require('session-file-store')(session);

// 세션 사용을 위한 미들웨어 장착
// req.session으로 세션 객체 사용 가능
app.use(session({
    secret: "keyboard cat",
    resave: false,
    saveUninitialized: true,
    store: new FileStore()
}));

/*
// 포트번호(localhost:3000 -> ContextPath)까지 요청 처리
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, './index.html'));
});
*/

// 라우팅 관련 파일 가져오기
const indexRouter = require('./routes/index');
const userRouter = require('./routes/user');
const boardRouter = require('./routes/board');

// url과 매핑
app.use("/", indexRouter); // / 요청은 indexRouter에서 처리
app.use("/user", userRouter);
app.use("/board", boardRouter); // user가 앞에 있는 것은 userRouter에서 처리

// 하나의 파일 업로드 처리
app.get('/single', (req, res) => {
    res.sendFile(path.join(__dirname, './single.html'));
});

app.post('/single', upload.single('image'), (req, res) => {
    // title 파라미터 읽기
    // post 방식에서의 파라미터는 req.body.파라미터이름
    console.log(req.body.title);
    console.log(req.file.originalname);
    res.send('성공');
});

// 하나의 파라미터로 여러 개의 파일 업로드
app.get('/multi', (req, res) => {
    res.sendFile(path.join(__dirname, './multi.html'));
});

app.post('/multi', upload.array('image'), (req, res) => {
    //res.send('성공');

    // node.js에서 json 전송
    let result = {"result": "success"};
    res.json(result);
});

// 웹 서버 실행
app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 서버 대기 중');
});