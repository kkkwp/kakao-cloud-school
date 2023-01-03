package kakao.itstudy.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

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

        // 나누어서 읽기 - 웹에서 파일 다운로드 받을 때 사용
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./buffer.txt"))) {
            while(true) {
                // 16바이트 단위로 읽어오기
                // 일반적으로 128의 배수를 많이 이용
                byte [] b = new byte[1024];
                int len = bis.read(b, 0, b.length);
                if(len <= 0)
                    break;
                // 받을 내용을 가지고 작업
                // 다운로드라면 파일에 기록하고, 문자열이라면 하나로 모아서 읽어야 함
                System.out.println((new String(b)).trim());
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
