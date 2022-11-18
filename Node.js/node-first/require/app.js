// {}로 묶어서 내보낸 것은 이름을 맞추어서 받아야 한다.
const {odd, even} = require('./var');

// 하나를 내보냈을 때는 이름을 바꿔서 받을 수 있다.
// func의 내용을 가져와서 checkNumber라는 이름을 붙인 것.
const checkNumber = require('./func');
console.log(checkNumber(5));

const os = require('os');
console.log(os.freemem());