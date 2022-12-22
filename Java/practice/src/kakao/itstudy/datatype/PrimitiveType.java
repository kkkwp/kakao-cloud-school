package kakao.itstudy.datatype;

public class PrimitiveType {

    public static void main(String[] args) {
        // 정수 저장하고 출력
        int x = 100;
        System.out.println("x: " + x); // x: 100

        // 동일한 공간에서 동일한 이름의 변수를 2번 생성하면 에러
        //int x = 100;
        int y = 100;
        // 실제 데이터의 참조 위치를 확인(같음)
        System.out.println("x: " + System.identityHashCode(x)); // x: 440434003
        System.out.println("y: " + System.identityHashCode(y)); // y: 440434003

        // 정수는 자신의 자료형보다 큰 범위 데이터를 참조할 수 없음
        //x = 20000000000;

        // 21억보다 크거나 -21억보다 작은 정수는 long을 생성
        // 천단위 구분 기호는 _
        long l = 200_000_000_000L;
        System.out.println("l: " + l); // l: 200000000000

        // 16진수 저장 - 참조나 색상을 나타낼 때 많이 이용
        x = 0x789;
        System.out.println("x: " + x); // x: 1929
        // 8진수 저장 - 권한 설정할 때 많이 이용
        // rwx로 권한 표현하는 경우가 많음
        x = 0777;
        System.out.println("x: " + x); // x: 511

        // 정밀도가 7번째 자리까지이므로 8번째 자리 아래에서 반올림
        float f = 0.1234567890123456789f;
        System.out.println("f: " + f); // f: 0.12345679

        char ch = 'A';
        System.out.println("ch: " + ch); // ch: A
        System.out.println(ch + 1); // 66

        ch = '\uAC00';
        System.out.println("ch: " + ch); // ch: 가

        // int는 21억 정도까지 저장 가능한데 연산의 결과가 21억이 넘어섬 - overflow
        // 이 경우는 결과가 음수가 된다.
        x = 2000000000 + 1000000000;
        System.out.println(x); // -1294967296
    }
}
