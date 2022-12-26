package kakao.itstudy.lang;

public class Systems {

    public static void main(String[] args) {
        // 운영체제 이름 가져오기
        String os = System.getProperty("os.name");

        // 자바 버전 확인
        String version = System.getProperty("java.version");
        System.out.println(os); // Windows 10
        System.out.println(version); // 15.0.9

        // 코드의 수행시간 측정
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i = i + 1) {
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "밀리초"); // 4밀리초
    }
}
