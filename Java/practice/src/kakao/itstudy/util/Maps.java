package kakao.itstudy.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 데이터 클래스 - VO
class VO1 {
    private int number;
    private String name;

    public VO1() {
        super();
    }

    public VO1(int number, String name) {
        super();
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "VO1 [number=" + number + ", name=" + name + "]";
    }
}

public class Maps {

    public static void main(String[] args) {
        //데이터 생성 - 모델
        VO1 vo = new VO1(1, "main");

        // 데이터 출력 - View
        System.out.println("번호:" + vo.getNumber()); // 번호:1
        System.out.println("이름:" + vo.getName()); // 이름:main
        // 모델의 근원이 되는 VO 클래스 안에 속성 이름을 변경하면 View도 수정이 되어야 함
        // 관계형 데이터베이스는 VO 클래스를 활용
        //System.out.println("번호:" + vo.getNum());

        // VO 클래스의 인스턴스 역할을 수행하는 Map을 생성
		Map <String, Object> map = new HashMap<>();
		// 데이터 저장
		map.put("번호", 1);
		map.put("이름", "main");

		// map의 모든 키를 가져와서 출력
		Set <String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key)); // 번호:1 이름:main
		}
    }
}
