package kakao.itstudy.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class BufferedStreamMain {

    public static void main(String[] args) {
        // 버퍼 단위로 기록
        try (PrintStream ps = new PrintStream(new FileOutputStream("./buffer.txt", true))) {
            String msg = "안녕하세요. 반가워요.";
            // write는 byte 단위 기록
            ps.write(msg.getBytes());
            // print는 문자열을 스스로 바이트로 변환해서 기록
            ps.print(msg);
            ps.flush();
        } catch (Exception e) {
            java.lang.System.out.println(e.getLocalizedMessage());
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./buffer.txt"))) {
            while (true) {
                // 파일에서 읽을 수 있는 크기로 바이트 배열을 생성
                byte[] b = new byte[bis.available()];
                // 읽기
                int len = bis.read(b);
                // 읽은 게 없으면 종료
                if (len <= 0) 
                    break;
                System.out.println(Arrays.toString(b));
                // 문자열로 변환
                System.out.println(new String(b));
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
