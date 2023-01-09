package kakao.itstudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReductionOperator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍범도", "유관순", "안중근", "안창호", "이순신", "남자현", "윤봉길", "홍범도");

        // 스트림 생성
        Stream<String> stream = list.stream();

        // 전체 출력
        // 홍범도 유관순 안중근 안창호 이순신 남자현 윤봉길 홍범도
        //stream.forEach((temp) -> System.out.print(temp + "\t"));

        // 2개 빼고 출력
        // 안중근 안창호 이순신 남자현 윤봉길 홍범도
        //stream.skip(2).forEach((temp) -> System.out.print(temp + "\t"));

        // 2개 빼고 3개 사용
        // 안중근 안창호 이순신
        //stream.skip(2).limit(3).forEach((temp) -> System.out.print(temp + "\t"));

        // 중복 제거
        // 홍범도 유관순 안중근 안창호 이순신 남자현 윤봉길
        //stream.distinct().forEach((temp) -> System.out.print(temp + "\t"));

        // 필터링
        // 매개변수가 1개이고 Boolean을 리턴하는 함수를 대입
        // 안중근 안창호
        //stream.filter(name -> name.charAt(0) == '안').forEach((temp) -> System.out.print(temp + "\t"));

        // ㅇ으로 시작하는
        // 유관순 안중근 안창호 이순신 윤봉길
        stream.filter(name -> name.charAt(0) >= '아' && name.charAt(0) < '자').forEach((temp) -> System.out.print(temp + "\t"));
    }
}
