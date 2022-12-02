const express = require('express');
const { verifyToken, apiLimiter } = require('./middlewares');

const jwt = require('jsonwebtoken');
const { Domain, User, Post, Hashtag } = require('../models');

const router = express.Router();

// 데이터를 리턴하는 요청 처리
router.get('/posts/my', apiLimiter, verifyToken, (req, res) => {
    Post.findAll({ where: { userId: req.decoded.id } })
        .then((posts) => {
            console.log(posts);
            res.json({
                code: 200,
                payload: posts
            });
        })
        .catch((error) => {
            console.error(error);
            return res.status(500).json({
                code: 500,
                message: '서버 에러'
            });
        });
});

// 토큼 발급
router.post('/token', apiLimiter, async (req, res) => {
    const { clientSecret } = req.body;
    try {
        // 도메인 찾아오기
        const domain = await Domain.findOne({
            where: { clientSecret },
            include: {
                model: User,
                attribute: ['nick', 'id']
            }
        });
        if (!domain) {
            return res.status(401).json({
                code: 401,
                message: '등록되지 않은 도메인입니다.'
            });
        }
        // 토큰 생성
        const token = jwt.sign({
            id: domain.User.id,
            nick: domain.User.nick,
        }, process.env.JWT_SECRET, {
            expiresIn: '1m',    // 유효기간
            issuer: 'nodebird'  // 발급자
        });

        return res.json({
            code: 200,
            message: '토큰이 발급되었습니다',
            token
        });
    } catch (error) {
        console.error(error);
        return res.status(500).json({
            code: 500,
            message: '서버 에러',
        });
    }
});

// 토큰을 확인하기 위한 처리
router.get('/test', verifyToken, apiLimiter, (req, res) => {
    res.json(req.decoded);
});

module.exports = router;