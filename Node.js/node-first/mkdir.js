let today = new Date();
console.log(today);
console.log(today.getFullYear());
console.log(today.getMonth());
console.log(today.getDate());

// 오늘 날짜로 된 디렉토리(20221116)이 없으면 생성하기

// 합쳐서 하나의 문자열 만들기 - 하나만 문자열로 만들어서 연결
let dirname = new String(today.getFullYear()) + (today.getMonth() + 1) + today.getDate();
//console.log(dirname);

// 디렉토리 존재 여부 확인
const fs = require("fs");

fs.access(dirname, (error) => {
    if (error) {
        console.log("디렉토리 없음");
        fs.mkdir(dirname, (error) => {
            if (error) { console.log("디렉토리 만들기 실패"); }
            else { console.log("디렉토리 만들기 성공"); }
        });
    } else {
        console.log("디렉토리 존재");
    }
});