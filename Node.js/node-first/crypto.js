// 암호화 모듈 가져오기
const crypto = require("crypto");

let password = "1234";
// 단방향 암호화
let p1 = crypto.createHash("sha256")
    .update(password)
    .digest('base64');
console.log(p1);

password = "12345";
p1 = crypto.createHash("sha256")
    .update(password)
    .digest('base64');
console.log(p1);

// 동일한 문자열로 암호화를 하면 동일한 결과를 생성한다.
// true
let str = "12345";
let p2 = crypto.createHash("sha256")
    .update(str)
    .digest('base64');
console.log(p1 === p2);

// false
str = "123456";
p1 = crypto.createHash("sha256")
    .update(str)
    .digest('base64');
console.log(p1 === p2);


// 암호화 모듈 가져오기
//const crypto = require("crypto");

// 양방향 암호화
// 알고리즘은 정해진 알고리즘 이용
// Node.js의 crypto 모듈에서 key는 32자리, iv는 16자리
const algorithm = "aes-256-cbc";
const key = "12345678901234567890123456789012";
const iv = "1234567890123456";

// 암호화 객체 생성
const cipher = crypto.createCipheriv(algorithm, key, iv);
let result = cipher.update("01037901997", "utf8", "base64");
result += cipher.final("base64");
console.log(result);

// 복호화
const decipher = crypto.createDecipheriv(algorithm, key, iv);
let result2 = decipher.update(result, "base64", "utf8");
result2 += decipher.final("utf8");
console.log(result2);