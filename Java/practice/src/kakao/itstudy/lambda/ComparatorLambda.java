package kakao.itstudy.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {
        // 데이터 정렬을 위해서 문자열 배열 생성
        String[] newjeans = {"민지", "하니", "다니엘", "해린", "혜인"};

        /*
        Arrays.sort(newjeans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 내림차순
                return o2.compareTo(o1);
            }
        });
         */

        // 코드는 간결해졌지만 가독성이 떨어진다.
        Arrays.sort(newjeans, (o1, o2) ->
                o2.compareTo(o1)
        );
        System.out.println(Arrays.toString(newjeans)); // [혜인, 해린, 하니, 민지, 다니엘]
    }
}
