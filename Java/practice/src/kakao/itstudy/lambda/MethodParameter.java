package kakao.itstudy.lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodParameter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("수지");
        list.add("아이린");
        list.add("카리나");

        /*
        list.forEach((temp) -> {
            System.out.println(temp);
        });
         */
        
        // 람다로 구현해야 하는 메서드와 동일한 원형의 메서드 이름 대입
        list.forEach(System.out::println); // 수지 아이린 카리나
    }
}
