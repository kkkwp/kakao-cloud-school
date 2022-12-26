package kakao.itstudy.util;

import java.util.HashMap;
import java.util.Map;

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

        /*
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
        */

        // 배열의 배열 - 2차원 배열 = matrix - 태그가 없음
        String[] newjeans = {"민지", "하니", "다니", "해린", "혜인"};
        String[] ive = {"원영", "유진", "리즈", "가을", "이서"};
        String[] itzy = {"예지", "류진", "채령", "유나"};

        // 이차원 배열 생성
        // 팀이 추가되면 태그를 수정해야 함
        String[][] girls = {newjeans, ive};
        //String[][] girls = {newjeans, ive, itzy};

        int i = 0;
        for (String[] temp : girls) {
            if (i == 0) {
                System.out.print("뉴진스:\t");
            } else {
                System.out.print("아이브:\t");
            }
            i++;
            for (String imsi : temp) {
                System.out.print(imsi + "\t");
            }
            System.out.println();
        }

        // 이차원 배열 대신에 Map의 배열 - Table
        Map<String, Object> newjeansMap = new HashMap<>();
        newjeansMap.put("name", "뉴진스");
        newjeansMap.put("team", newjeans);

        Map<String, Object> iveMap = new HashMap<>();
        iveMap.put("name", "아이브");
        iveMap.put("team", ive);

        Map<String, Object> itzyMap = new HashMap<>();
        itzyMap.put("name", "있지");
        itzyMap.put("team", itzy);

        Map[] girlsMap = {newjeansMap, iveMap, itzyMap};

        for (Map m : girlsMap) {
            System.out.print(m.get("name") + ":\t");
            String[] temp = (String[]) m.get("team");
            for (String imsi : temp) {
                System.out.print(imsi + "\t");
            }
            System.out.println();
        }
        // 뉴진스:	민지	하니	다니	해린	혜인
        // 아이브:	원영	유진	리즈	가을	이서
        // 있지:	    예지	류진	채령	유나
    }
}
