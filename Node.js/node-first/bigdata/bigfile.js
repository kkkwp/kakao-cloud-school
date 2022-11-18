/* 
// 용량이 큰 파일을 생성
const fs = require("fs");

const file = fs.createWriteStream('./bigdata.txt');
for (let i =0; i<10000000; i++) {
    file.write("용량이 큰 파일 만들기\n");
}
file.end();
*/

/* stream을 사용하지 않고 읽어서 쓰기 */
const fs = require("fs");
console.log('stream 사용하지 않고 복사하기 전 메모리 사용량: ' + process.memoryUsage().rss);
const data1 = fs.readFileSync('./bigdata.txt');
fs.writeFileSync('./no_stream_data.txt', data1);
console.log('stream 사용하지 않고 복사한 후 메모리 사용량: ' + process.memoryUsage().rss);

/* stream을 사용한 객체 */
//const fs = require("fs");
console.log('stream 사용하고 복사하기 전 메모리 사용량: ' + process.memoryUsage().rss);
// 읽기와 쓰기 스트림 생성
const readStream = fs.createReadStream('./bigdata.txt');
const writeStream = fs.createWriteStream("./stream_data.txt");
// 읽고 쓰기
readStream.pipe(writeStream);
readStream.on('end', () => {
    console.log('stream 사용하고 복사한 후 메모리 사용량: ' + process.memoryUsage().rss);
});