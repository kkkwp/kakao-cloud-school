const express = require('express');

const router = express.Router();

// 공통된 처리 - 무조건 수행
router.use((req, res, next) => {
    res.locals.user = null;
    res.locals.followerCount = 0;
    res.locals.followingCount = 0;
    res.locals.followerIdList = [];

    next();
});

// 메인 화면
router.get('/', (req, res, next) => {
    const twits = [];
    // 템플릿 엔진을 이용한 출력
    // views 디렉토리의 main.html로 출력
    res.render('main', {
        title: 'Node Authentication',
        twits
    });
});

// 회원 가입
router.get('/join', (req, res, next) => {
    res.render('join', {
        title: '회원가입 - Node Authentication'
    });
});

// 프로필 화면 처리
router.get('/profile', (req, res) => {
    res.render('profile', {
        title: '나의 정보 - Node Authentication'
    });
});

module.exports = router;