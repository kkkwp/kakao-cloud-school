package kakao.itstudy.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        // Map의 활용
        // 데이터의 종류가 한 가지라면 Object 대신에 그 자료형을 기재해도 된다.
        Map<String, Object> map = new HashMap<>();

        // 데이터 추가
        map.put("name", "민지");

        // 데이터 가져오기
        System.out.println(map.get("name")); // 민지

        // 중복된 키를 이용한 데이터 삽입 = 수정
        map.put("name", "해린");
        System.out.println(map.get("name")); // 해린

        // 없는 키를 이용해서 가져왔을 때 - 자바는 null
        System.out.println(map.get("num")); // null

        // value를 Object로 설정했을 때 사용
        // value를 삽입할 때 String이지만 Map을 만들 때 value type을 Object로 설정했기 때문에
        // get을 해서 데이터를 원상복구하고자 하면 강제 형 변환을 해야 한다.
        String value = (String) map.get("name");

        // 모든 키를 가져오는 것
        Set<String> keys = map.keySet();
        System.out.println(keys); // [name]
    }
}
