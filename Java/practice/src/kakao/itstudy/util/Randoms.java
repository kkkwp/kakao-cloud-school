package kakao.itstudy.util;

import java.util.Random;

public class Randoms {

    public static void main(String[] args) {
        // 1-45 사이의 랜덤한 정수를 가져오기
        Random r = new Random();
        int lotto = r.nextInt(45) + 1;
        System.out.println(lotto); // 16

        // 배열에서 랜덤한 아이템 추출
        String[] card = {"스페이드", "다이아몬드", "하트", "클로버"};
        String myCard = card[r.nextInt(card.length)];
        System.out.println(myCard); // 클로버
    }
}
