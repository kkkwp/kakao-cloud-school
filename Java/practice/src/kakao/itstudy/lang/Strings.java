package kakao.itstudy.lang;

import java.io.UnsupportedEncodingException;

public class Strings {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(System.identityHashCode(str)); // 381259350

        // String은 데이터 수정이 안 되기 때문에 새로운 공간에 기존의 문자열을 복사한 후 작업을 수행하고 그 참조를 다시 리턴
        // 기존의 데이터가 저장된 공간은 메모리 낭비가 될 수 있음
        str += "Java";
        System.out.println(System.identityHashCode(str)); // 2065951873

        // 변경 가능한 문자열을 저장
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(System.identityHashCode(sb)); // 1791741888
        // 문자열을 추가하면 현재 저장된 공간에 이어붙이기를 수행
        sb.append("Java");
        // 해시코드가 이전 데이터와 동일
        System.out.println(System.identityHashCode(sb)); // 1791741888

        // 여러 데이터를 가지고 하나의 문자열을 생성
        double lat = 12.789;
        double lng = 24.2987;

        // 위의 데이터를 가지고 위도:12.789 경도:24.299 문자열로 생성
        String msg = String.format("위도:%.3f 경도:%.3f\n", lat, lng);
        System.out.println(msg); // 위도:12.789 경도:24.299

        String hi = "안녕하세요";
        try {
            // 바이트 배열로 문자열을 변환 - MS949 이용
            // 동일한 프로그램이 아닌 시스템과 채팅을 할 때는 문자열을 직접 전송하지 않고 바이트 배열을 만들어서 전송
            byte[] bytes = hi.getBytes("UTF-8");
            // byte 배열을 문자열로 변환
            // 문자열이 깨지면 인코딩 방식을 확인하고 변경
            String result = new String(bytes, "MS949");
            System.out.println(result);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
