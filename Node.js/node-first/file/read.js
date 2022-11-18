// 파일을 읽고 쓸 수 있는 모듈 가져오기
const fs = require("fs");

/* 동기식 파일 읽기 */
let data = fs.readFileSync("./test.txt");
//console.log(data.toString());

// Enter 단위로 분할해서 읽기
let ar = data.toString().split("\n");
console.log(ar[0]);

/* 비동기식 파일 읽기 - error는 에러의 내용이고 data가 buffer */
//const fs = require("fs");
fs.readFile('./test.txt', (error, data) => {
    if (error) {
        //에러가 발생했을 때
        console.log(error.message);
    } else {
        //에러가 발생하지 않았을 때
        console.log("async: " + data.toString());
    }
});
console.log("async: 파일 읽기 종료?");

// 콜백 대신에 Promise 사용 가능
const fs2 = require("fs").promises;
fs2.readFile('./test.txt')
    .then((data) => { console.log("promise: " + data.toString()); })
    .catch((error) => { console.log(error.message); })