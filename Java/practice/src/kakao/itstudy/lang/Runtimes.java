package kakao.itstudy.lang;

import java.io.IOException;

public class Runtimes {

    public static void main(String[] args) {
        // Runtime 클래스의 인스턴스 생성
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        // Singleton 패턴으로 디자인되서 해시코드가 동일
        System.out.println(System.identityHashCode(r1));
        System.out.println(System.identityHashCode(r2));

        // 프로세스 실행
        // Mac은 open 파일경로 형태로 입력해야 함
        // Windows는 프로세스 이름만 사용하면 됨
        try {
            r1.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
