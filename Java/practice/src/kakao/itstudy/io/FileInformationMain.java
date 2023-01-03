package kakao.itstudy.io;

import java.io.File;
import java.util.Date;

public class FileInformationMain {

    public static void main(String[] args) {
        // file 객체 생성
        File f = new File("C:\\Users\\user\\Pictures\\newjeans.jpeg");

        //파일의 존재여부
        if (f.exists()) {
            System.out.println("파일의 크기: " + f.length() + " byte"); // 파일의 크기: 121095 byte
            Date date = new Date(f.lastModified());
            System.out.println("마지막 수정 날짜: " + date); // 마지막 수정 날짜: Fri Nov 25 15:10:34 KST 2022
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
