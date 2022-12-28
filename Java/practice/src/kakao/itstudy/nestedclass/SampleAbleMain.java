package kakao.itstudy.nestedclass;

public class SampleAbleMain {

    public static void main(String[] args) {
        // 인스턴스 생성
        // 인터페이스나 추상 클래스 등을 상속해서 클래스를 만들고 인스턴스를 만드는 경우
        // 변수는 대부분 인터페이스나 추상 클래스 이름으로 만들고, 생성자는 사용하고자 하는 클래스의 생성자를 이용하는 경우가 많다.
        // 상위 클래스나 인터페이스로 만들어진 변수에 하위 클래스의 인스턴스 참조를 대입할 수 있다.
        // 이렇게 만들어진 변수는 상위 클래스나 인터페이스에 존재하는 이름만 호출이 가능한다.
        // 실제 호출되는 것은 생성자를 따라 간다.
        SampleAble instance = new SampleAbleImpl();
        // 메서드 호출
        instance.method();

        // anonymous class 사용
        SampleAble anonymous = new SampleAble() {
            @Override
            public void method() {
                System.out.println("anonymous 이용");
            }
        };
        anonymous.method();

        // 메서드를 1번만 호출할 거라면 변수를 생성하지 않고 가능
        new SampleAble() {
            @Override
            public void method() {
                System.out.println("변수를 만들지 않고 anonymous 이용");
            }
        }.method();
    }
}
