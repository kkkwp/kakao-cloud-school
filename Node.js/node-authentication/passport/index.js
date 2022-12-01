const passport = require('passport');
// 로컬 로그인 구현
const local = require('./localStrategy'); // 현재 디렉토리의 localStrategy 파일을 가져오기
// 카카오 로그인
const kakao = require('./kakaoStrategy');
// 유저 정보 관련 model
const User = require('../models/user'); // 상위 디렉토리 model 디렉토리의 user 가져오기

module.exports = () => {
    // 로그인 성공했을 때 정보를 deserializeUser 함수에게 넘기는 함수
    passport.serializeUser((user, done) => {
        done(null, user.id);
    });

    // 넘어온 id에 해당하는 데이터가 있으면 데이터베이스에서 찾아서 세션에 저장
    passport.deserializeUser((id, done) => {
        User.findOne({ where: { id } })
            .then(user => done(null, user))
            .catch(err => done(err));
    });
    local();
    kakao();
};