package kakao.itstudy.Data;

public class SingletonMain {

    public static void main(String[] args) {
        // 디자인 패턴이 적용되지 않은 경우의 인스턴스 생성
        //Singleton singleton1 = new Singleton();
        //Singleton singleton2 = new Singleton();

        // 싱글톤 턴으로 디자인 된 클래스의 인스턴스 생성
        Singleton singleton1 = Singleton.sharedInstance();
        Singleton singleton2 = Singleton.sharedInstance();

        // 해시코드 확인
        System.out.println(System.identityHashCode(singleton1)); // 2129789493
        System.out.println(System.identityHashCode(singleton2)); // 2129789493
    }
}
