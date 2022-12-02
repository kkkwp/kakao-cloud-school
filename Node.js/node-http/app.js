// 웹 서버를 구축하기 위한 외부 모듈
const express = require('express');

// 현재 디렉토리에 대한 절대 경로를 알아내기 위한 내장 모듈
const path = require('path');

// 서버를 준비
const app = express();
app.set('port', 3000);

// 일단위 로그 기록을 위한 설정
const morgan = require('morgan');
const FilesStreamRotator = require('file-stream-rotator');
// 내장 모듈
const fs = require('fs');

// 로그 파일을 저장할 디렉토리 생성
const logDirectory = path.join(__dirname, 'log');
// 디렉토리 존재 여부를 확인하고, 디렉토리가 없으면 생성
fs.existsSync(logDirectory) || fs.mkdirSync(logDirectory);

// 일단위 로그 기록 설정
const accessLogStream = FilesStreamRotator.getStream({
    date_format: 'YYYYMMDD',
    filename: path.join(logDirectory, 'access-%DATE%.log'),
    frequency: 'daily',
    verbose: true
});

app.use(morgan('combined', { stream: accessLogStream }));

// 사용자의 요청 처리
// /는 포트번호까지의 요청
// https://localhost:3000/index?name=adam
app.get('/index', (req, res) => {
    console.log(req.ip);
    console.log(req.query);
    // 현재 디렉토리에 있는 main.html을 출력
    res.sendFile(path.join(__dirname, '/main.html'));
});

// 서버를 구동
app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 대기 중');
});