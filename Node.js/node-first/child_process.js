// 다른 프로세스를 실행할 수 있는 모듈을 가져오기
const exec = require('child_process').exec;

// 프로세스 준비
// Windows에서는 dir이 디렉토리의 목록을 확인하는 것이고, 나머지는 ls
let process = exec('dir');

// 프로세스가 정상적으로 수행되면
process.stdout.on('data', function (data) {
    console.log(data.toString());
});

// 수행되지 않으면
process.stderr.on('data', function (data) {
    console.log(data.toString());
});

// Windows 확인 코드
const os = require('os');

/*
console.log(os.type());
console.log(os.platform());
*/

let position = os.type().toLocaleLowerCase().indexOf("WindowX");

if (position >= 0) {
    console.log("windows");
} else {
    console.log("windows 아님");
}