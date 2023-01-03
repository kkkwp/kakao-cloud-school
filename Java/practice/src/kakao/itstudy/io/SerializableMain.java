package kakao.itstudy.io;

import java.io.*;

public class SerializableMain {

    public static void main(String[] args) {
        // 인스턴스 단위로 기록할 수 있는 스트림
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sample.dat"))){
            // 기록할 인스턴스 생성
            SerializableData serializableData = new SerializableData(1, "카리나", "SM");
            oos.writeObject(serializableData);
            oos.flush();
        }catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.dat"))){
            // 기록된 인스턴스 읽어오기
            // return type이 Object이르모 기록할 때 사용한 데이터 타입으로 강제 형 변환
            SerializableData serializableData = (SerializableData)ois.readObject();
            System.out.println(serializableData);
        }catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
