package kakao.itstudy.operator;

public class TypeCasting {

    public static void main(String[] args) {
        double d = 37.4;
        // 실수를 정수에 직접 대입하면 에러 발생
        // 실수가 정수보다 크기 때문
        // 강제 형 변환을 이용하면 대입 가능
        int n = (int) d;
        // 실수를 정수로 강제 형 변환하면 소수가 버려짐
        System.out.println("n: " + n); // n: 37

        short s1 = 30000;
        short s2 = 30000;
        // 산술 연산은 int로 변환 되어서 수행되므로 결과가 최소 int
        short result = (short) (s1 + s2);
        System.out.println(result); // -5536

        // 정수 2개의 평균을 실수로 구하고자 하는 경우
        int score1 = 91;
        int score2 = 90;
        // 정수를 가지고 산술 연산을 하면 결과는 정수
        // 데이터 중 1개를 실수로 만들면 결과도 실수
        double avg = ((double) score1 + score2) / 2;
        System.out.println(avg); // 90.5
    }
}
