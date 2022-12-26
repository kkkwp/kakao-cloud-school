package kakao.itstudy.lang;

import java.math.BigDecimal;

public class Wrapper {

    public static void main(String[] args) {
        int a = 10;
        // 기본형의 데이터를 Wrapper Class 인스턴스로 변환
        Integer i = new Integer(a);
        // Auto Boxing - a 부분을 JDK가 new Integer(a)로 변환해서 수행
        Integer k = a;

        Integer x = new Integer(10);
        int y = x.intValue();
        // Auto Unboxing - 메서드를 호출하지 않고 직접 대입이 가능
        int z = x;

        // Wrapper 클래스 사용
        Double d = new Double(13.67);
        d = 17.23; // 기본형을 대입하면 new Double(17.23)으로 변환
        // toString이 재정의되어 있으므로 출력은 참조로 가능
        System.out.println(d);
        // 기본형 데이터로 변환
        double t = d;
        System.out.println(x);
        double d1 = 1.60000000000000000;
        double d2 = 0.10000000000000000;
        System.out.println(d1 + d2); // 1.7이 아님

        // 정확한 산술 연산
        // BigDecimal로 데이터를 만들고 연산을 수행하는 메서드를 호출하면 정확한 결과를 만들 수 있음
        BigDecimal b1 = new BigDecimal("1.60000000000000000");
        BigDecimal b2 = new BigDecimal("0.10000000000000000");
        System.out.println(b1.add(b2));
    }
}
