package kakao.itstudy.util;

import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Property {

    public static void main(String[] args) {
        // 인스턴스를 1개만 만들 때 참조하는 이름은 클래스 이름을 그대로 작성하고 첫글자만 소문자로 변경
        // Spring이 bean을 만들 때 사용하는 방법
        Properties properties = new Properties();

        // 데이터 저장
        properties.setProperty("num", "1");
        properties.setProperty("name", "winter");

        // 읽어오기
        System.out.println(properties.getProperty("num")); // 1
        // 존재하지 않는 key를 사용하는 경우 - null
        System.out.println(properties.getProperty("number")); // null

        // 반복자 사용
        Enumeration <Object> keys = properties.keys();

        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement()); // num name
        }

        // 파일로 저장
        try{
            properties.store(new FileOutputStream("./pro.properties"), "텍스트로 저장");
            properties.storeToXML(new FileOutputStream("./pro.xml"), "xml로 저장");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
