package kakao.itstudy.datatype;

public class FormatDisplay {

    public static void main(String[] args) {
        int n = 37;
        double d = 23.768952;
        String name1 = "adam";
        String name2 = "아담12";

        System.out.printf("n: %d\n", n); // n: 37
        // 10자리를 확보해서 출력
        System.out.printf("n: %10d\n", n); // n:         37
        // 남는 자리는 0을 추가해서 출력
        System.out.printf("n: %010d\n", n); // n: 0000000037

        // 소수 6째 자리까지 출력
        System.out.printf("d: %f\n", d); // d: 23.768952
        // 소수 3째 자리까지 출력 - 반올림
        System.out.printf("d: %.3f\n", d); // d: 23.769

        // %s는 문자열을 출력하는 것이 아니고 시작위치부터 byte 단위로 데이터를 가져외서 문자로 변환한 후 null을 만날 때까지 출력
        System.out.printf("name1: %10s\n", name1); // name1:       adam
        System.out.printf("name2: %10s\n", name2); // name2:       아담12
    }
}
