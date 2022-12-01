const passport = require('passport');
const KakaoStrategy = require('passport-kakao').Strategy;

// 유저 정보
const User = require('../models/user');

// 카카오 로그인
module.exports = () => {
    passport.use(new KakaoStrategy({
        clientID: process.env.KAKAO_ID,
        callbackURL: '/auth/kakao/callback',
    }, async (accessToken, refreshToken, profile, done) => {
        // 로그인 성공했을 때 정보를 출력
        console.log('kakao profile', profile);
        try {
            // 이전에 로그인 한 적이 있는지 찾기 위해
            // 카카오 ID와 provider가 kakao로 되어 있는 데이터가 있는지 조회
            const exUser = await User.findOne({
                where: { snsId: profile.id, provider: 'kakao' },
            });
            // 이전에 로그인 한 적이 있으면
            if (exUser) {
                done(null, exUser);
            } else {
                // 이전에 로그인 한 적이 없으면 데이터를 저장
                const newUser = await User.create({
                    email: profile._json && profile._json.kaccount_email,
                    nick: profile.displayName,
                    snsId: profile.id,
                    provider: 'kakao',
                });
                done(null, newUser);
            }
        }
        catch (error) {
            console.error(error);
            done(error);
        }
    }));
};