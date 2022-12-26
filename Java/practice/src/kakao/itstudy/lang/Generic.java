package kakao.itstudy.lang;

// 미지정 자료형의 이름은 한 글자로 하는 것이 관례
public class Generic<T> {

    private final T[] data;

    // ...는 데이터 개수에 상관 없이 매개변수로 받아서 배열로 만들어주는 문법 - varargs
    public Generic(T... n) {
        data = n;
    }

    // 배열의 데이터를 출력해주는 메서드
    public void disp() {
        for (T temp : data) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        // Generics가 적용된 클래스의 인스턴스를 만들 때는 실제 자료형을 결정 지어야 경고가 발생하지 않음
        Generic<String> obj1 = new Generic<>("해글러", "헌즈", "두란", "레너드");
        obj1.disp(); // 해글러 헌즈 두란 레너드

        // 기본형은 Generics에 적용할 수 없음
        Generic<Integer> obj2 = new Generic<>(100, 200, 30);
        obj2.disp(); // 100 200 30
    }
}
