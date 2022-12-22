package kakao.itstudy.operator;

public class Unary {

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = -20;
        // 정수 데이터가 2진수로 저장된 구조를 출력
        System.out.println("n1: " + Integer.toBinaryString(n1)); // n1: 10100
        System.out.println("n2: " + Integer.toBinaryString(n2)); // n2: 11111111111111111111111111101100
        // 1의 보수 구하기 + 21
        System.out.println("~n2: " + Integer.toBinaryString(~n2)); // ~n2: 10011

        int n = 20;
        System.out.println(n++); // 20 : 명령에 먼저 사용
        System.out.println(++n); // 22 : 증감하고 명령에 사용
    }
}
