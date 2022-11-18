const path = require('path');

// 현재 디렉토리를 확인
console.log(__dirname);
// 현재 디렉토리 내의 public 디렉토리의 경로
console.log(path.join(__dirname, "public"));