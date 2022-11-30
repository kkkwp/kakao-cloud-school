const express = require('express');

// .env 파일을 읽어서 process.env에 대입해주는 설정
const dotenv = require('dotenv');
dotenv.config();

// 서버 설정
const app = express();
app.set('port', process.env.PORT);

// 로그 출력 설정을 위해서 파일을 읽기 위한 모듈과 경로 설정 모듈
const fs = require('fs');
const path = require('path');

// static 파일의 경로 설정
app.use(express.static(path.join(__dirname, 'public')));

// view template(template engine)
// 서버의 데이터를 html과 합쳐서 다시 html로 변환해주는 라이브러리
const nunjucks = require('nunjucks');
app.set('view engine', 'html');
nunjucks.configure('views', {
    express: app,
    watch: true,
});

// 로그 설정
const morgan = require('morgan');
const FileStreamRotator = require('file-stream-rotator');

const logDirectory = path.join(__dirname, 'log');

// 로그 디렉토리 생성
fs.existsSync(logDirectory) || fs.mkdirSync(logDirectory);

// 로그 파일 옵션 설정
const accessLogStream = FileStreamRotator.getStream({
    date_format: 'YYYYMMDD',
    filename: path.join(logDirectory, 'access-%DATE%.log'),
    frequency: 'daily',
    verbose: false
});

// 로그 설정
app.use(morgan('combined', { stream: accessLogStream }));

// 출력하는 파일 압축해서 전송
const compression = require('compression');
app.use(compression());

// post 방식에서 form이 아닌 형태로 데이터를 전송하는 경우의 파라미터 읽기
let bodyParser = require('body-parser');
app.use(bodyParser.json()); // to support JSON-encoded bodies
app.use(bodyParser.urlencoded({ // to support URL-encoded bodies
    extended: true
}));

// 쿠키 설정
const cookieParser = require('cookie-parser');
app.use(cookieParser(process.env.COOKIE_SECRET));

// 세션 설정
const session = require("express-session");
let options = {
    host: process.env.HOST,
    port: process.env.MYSQLPORT,
    user: process.env.USERID,
    password: process.env.PASSWORD,
    database: process.env.DATABASE
};

const MySQLStore = require('express-mysql-session')(session);

app.use(
    session({
        secret: process.env.COOKIE_SECRET,
        resave: false,
        saveUninitialized: true,
        store: new MySQLStore(options)
    })
);

// 라우터 설정
const pageRouter = require('./routes/page');
app.use('/', pageRouter);

// 에러가 발생한 경우 처리
app.use((req, res, next) => {
    const err = new Error(`${req.method} ${req.url} 라우터가 없습니다.`);
    err.status = 404;
    next(err);
});

// 에러가 발생한 경우 처리
app.use((err, req, res, next) => {
    res.locals.message = err.message;
    res.locals.error = process.env.NODE_ENV !== 'production' ? err : {};
    res.status(err.status || 500);
    res.render('error');
});

app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 대기 중');
});