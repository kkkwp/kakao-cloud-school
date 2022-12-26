package kakao.itstudy.util;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        // 저장 순서를 알 수 없는 Set 인스턴스 생성
        Set<String> set = new HashSet<>();

        // 데이터 추가
        set.add("안중근");
        set.add("김좌진");
        set.add("남자현");
        set.add("유관순");

        // 동일한 데이터를 삽입
        // equals 메서드로 비교해서 true이면 삽입하지 않음
        // set은 데이터 삽입에 성공하면 true, 실패하면 false를 리턴
        set.add("안중근");
        set.add("홍범도");
        System.out.println(set); // [홍범도, 남자현, 유관순, 안중근, 김좌진]
        set.add("지청천");
        System.out.println(set); // [홍범도, 지청천, 남자현, 유관순, 안중근, 김좌진]
    }
}
