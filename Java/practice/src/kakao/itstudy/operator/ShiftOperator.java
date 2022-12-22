package kakao.itstudy.operator;

public class ShiftOperator {

    public static void main(String[] args) {
        int x = -29;
        System.out.println(x << 2); // -116 : 1번 밀 때마다 2 곱하기
        System.out.println(x >> 3); // -4 : 1번 밀 때마다 2 나누기(-29 -> -15 -> -8 -> -4)
        System.out.println(x >>> 3); // 536870908 : 부효 변경
        System.out.println(x << 33); // -58 : 32로 나눈 나머지만큼 밀기
    }
}
