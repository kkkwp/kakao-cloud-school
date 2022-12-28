package kakao.itstudy.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling3 {

    public static void main(String[] args) {
        String message = null;
        // br은 처리가 끝나면 자동으로 close()를 호출
        // jdk 1.7에서 추가된 문법
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            message = br.readLine();
            // 입출력에 사용되는 스트림은 반드시 닫아야 함
            //br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(message);
    }
}
