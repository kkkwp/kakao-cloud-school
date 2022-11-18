const url = require('url');

const addr = "https://www.naver.com/login?id=ggangpae1";

// url 분해
const p = url.parse(addr);

// pathname에는 서버 URL을 제외한 경로를 저장하고 있고
// query에는 query string을 저장하고 있다.
console.log(p);