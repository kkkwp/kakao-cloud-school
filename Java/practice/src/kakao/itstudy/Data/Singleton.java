package kakao.itstudy.Data;

public class Singleton {
    // 외부에서 직접 인스턴스 생성을 못하도록 생성자의 접근 지정자 변경
    private Singleton () {
    }

    private static Singleton singleton;

    // 인스턴스의 참조를 리턴하는 메서드
    public static Singleton sharedInstance() {
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
