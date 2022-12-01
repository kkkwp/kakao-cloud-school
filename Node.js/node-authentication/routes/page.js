const express = require('express');
const { isLoggedIn, isNotLoggedIn } = require('./middlewares');
const { Post, User, Hashtag } = require('../models');

const router = express.Router();

// 공통된 처리 - 무조건 수행
router.use((req, res, next) => {
    // 로그인 한 유저 정보
    // 유저정보를 res.locals.user에 저장
    res.locals.user = req.user;
    // 게시글이 follow 되는 개수
    res.locals.followerCount = req.user ? req.user.Followers.length : 0;
    // 게시글을 follow 하는 개수
    res.locals.followingCount = req.user ? req.user.Followings.length : 0;
    // 게시글을 follow하고 있는 유저들의 목록
    res.locals.followerIdList = req.user ? req.user.Followings.map(f => f.id) : [];
    next();
});

// 메인 화면
router.get('/', async (req, res, next) => {
    try {
        // post 모델의 모든 데이터를 찾아오는데
        // 이때 user 정보의 id와 nick도 같이 가져오기
        const posts = await Post.findAll({
            include: {
                model: User,
                attributes: ['id', 'nick'],
            },
            order: [
                ['createdAt', 'DESC']
            ],
        });
        res.render('main', {
            title: 'Node Authentication',
            twits: posts,
        });
    } catch (err) {
        console.error(err);
        next(err);
    }
});

router.get('/hashtag', async (req, res, next) => {
    // 파라미터 읽어오기
    const query = req.query.hashtag;
    if (!query) {
        return res.redirect('/');
    }
    try {
        const hashtag = await Hashtag.findOne({ where: { title: query } });
        let posts = [];
        if (hashtag) {
            posts = await hashtag.getPosts({ include: [{ model: User }] });
        }
        return res.render('main', {
            title: `${query} | Node Authentication`,
            twits: posts
        });
    } catch (error) {
        console.error(error);
        return next(error);
    }
});

// 회원 가입 - 로그인이 되어 있지 않은 경우에만 수행
router.get('/join', isNotLoggedIn, (req, res, next) => {
    res.render('join', {
        title: '회원가입 - Node Authentication'
    });
});

// 프로필 화면 처리 - 로그인이 되어 있는 경우에만 처리
router.get('/profile', isLoggedIn, (req, res) => {
    res.render('profile', {
        title: '나의 정보 - Node Authentication'
    });
});

module.exports = router;