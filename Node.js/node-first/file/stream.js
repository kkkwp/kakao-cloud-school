const fs = require("fs");

// 읽기 전용 스트림 생성
const stream = fs.createReadStream(
    './test.txt', { highWaterMark: 16 }
);

// 데이터를 저장하기 위한 객체를 생성
const streamData = [];

// 읽는 동안 발생하는 이벤트를 처리
stream.on('data', (chunk) => {
    // 읽는 동안에는 읽어온 데이터를 추가
    streamData.push(chunk);
});

// 읽기가 끝나면 발생하는 이벤트를 처리
stream.on('end', () => {
    // 지금까지 앍은 내용을 하나로 만들기
    let result = Buffer.concat(streamData);
    //console.log(result);
});

// 에러 발생했을 때의 이벤트를 처리
stream.on('error', (error) => {
    console.log(error.message);
});