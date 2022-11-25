// 웹 서버를 구축하기 위한 외부 모듈
const express = require('express');

// 서버를 준비
const app = express();
app.set('port', 3000);

// pug 설정
const path = require('path');
// res.render로 출력할 때 사용할 디렉토리를 설정
app.set('views', path.join(__dirname, 'views'));
// 템플릿 엔진은 pug를 사용하겠다고 설정
app.set('view engine', 'pug');

app.use('/', (req, res) => {
    // 템플릿 엔진으로 출력
    // views/index.html로 출력
    res.render('index', {
        'title': 'Pug',
        'aespa': ['카리나', '지젤', '윈터', '닝닝']
    });
})

// 사용자의 요청 처리
// /는 포트번호까지의 요청
// https://localhost:3000/index?name=adam
app.get('/index', (req, res) => {
    console.log(req.ip);
    console.log(req.query);
});

// 서버를 구동
app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 대기 중');
});