package kakao.itstudy.util;

import java.util.Arrays;

public class VOMain {

    public static void main(String[] args) {
        // 정수 배열
        int [] ar = {60, 30, 20, 87, 56};

        // 문자열 배열
        String [] br = {"해글러", "헌즈", "듀란", "레너드", "박종팔"};

        // 배열의 데이터 확인
        System.out.println(Arrays.toString(ar)); // [60, 30, 20, 87, 56]

        // 정수 배열 정렬
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar)); // [20, 30, 56, 60, 87]

        // 문자열 배열 정렬
        Arrays.sort(br);
        System.out.println(Arrays.toString(br)); // [듀란, 레너드, 박종팔, 해글러, 헌즈]

        // VO 클래스이 인스턴스 5개를 소유하는 배열
        VO [] data = new VO[5];
        data[0] = new VO(1, "배수지", 28);
        data[1] = new VO(2, "이지은", 29);
        data[2] = new VO(3, "배주현", 31);
        data[3] = new VO(4, "박수영", 26);
        data[4] = new VO(5, "유지민", 22);
        System.out.println(Arrays.toString(data)); // [VO{num=1, name='배수지', age=28}, VO{num=2, name='이지은', age=29}, VO{num=3, name='배주현', age=31}, VO{num=4, name='박수영', age=26}, VO{num=5, name='유지민', age=22}]

        Arrays.sort(data);
        System.out.println(Arrays.toString(data)); // [VO{num=4, name='박수영', age=26}, VO{num=1, name='배수지', age=28}, VO{num=3, name='배주현', age=31}, VO{num=5, name='유지민', age=22}, VO{num=2, name='이지은', age=29}]
    }
}
