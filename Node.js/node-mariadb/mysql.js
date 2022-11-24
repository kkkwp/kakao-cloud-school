// 모듈 가져오기
const mysql = require('mysql');

// 접속 정보 생성
let connection = mysql.createConnection({
    host: '127.0.0.1',
    port: 3306,
    user: '',
    password: '',
    database: ''
});

// 연결
connection.connect((error) => {
    if (error) {
        console.log(error);
    } else {
        //console.log(connection);

        // 테이블 생성 구문
        connection.query('create table family(id int auto_increment primary key, name varchar(20))');
        
        // 데이터 삽입 구문
        connection.query('insert into family(name) values(?)', '을지문덕');
        connection.query('insert into family(name) values(?)', '강감찬');
        connection.query('insert into family(name) values(?)', '조헌');
        
        // select 구문
        connection.query('select * from family', (err, resuts, fields) => {
            if (err) {
                console.log(err);
                console.log("{result: false}");
            } else {
                let result = JSON.stringify(resuts);
                console.log(result);
            }
        });
    }
});
