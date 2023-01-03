package kakao.itstudy.io;

import java.io.FileInputStream;
import java.util.Arrays;

public class ByteStreamMain {

    public static void main(String[] args) {
        // 파일을 바이트 단위로 읽어오기
        try (FileInputStream fis = new FileInputStream("./sample.txt")) {
            while (true) {
                /*
                int x = fis.read();
                if (x == -1) {
                    break;
                }
                System.out.println((char) x);
                */

                // 읽을 수 있는 크기로 바이트 배열 생성
                byte[] b = new byte[fis.available()];
                int len = fis.read(b);
                if (len <= 0) {
                    System.out.println("읽은 데이터 없음");
                    break;
                } else {
                    // 숫자 배열 출력 - 텍스트가 아닌 경우
                    System.out.println(Arrays.toString(b)); // [115, 97, 109, 112, 108, 101]
                    // 문자열로 변환해서 출력 - 텍스트인 경우
                    System.out.println(new String(b)); // sample
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
