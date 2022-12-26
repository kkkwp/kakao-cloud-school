package kakao.itstudy.lang;

// 이런 형태로 만들면 Gender Type의 변수에는 MAN 아니면 WOMAN만 가능
enum Gender {
    MAN, WOMAN;
}

public class Enum {

    public static void main(String[] args) {
        // 옵션 사용을 위해서 예전에는 final 상수를 이용
        final int MAN = 0;
        final int WOMAN = 1;

        // int로 만들면 이렇게 정의하지 않은 값을 대입하는 게 가능
        int gender = MAN;
        gender = 3;

        // Gender가 enum이므로 Gender.MAN이나 Gender.WOMAN만 가능
        Gender t = Gender.MAN;
    }
}