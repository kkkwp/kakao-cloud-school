package kakao.itstudy.lang;

public class Main {

    public static void main(String[] args) {
        String[] members = {"지수", "제니", "로제", "리사"};
        // 인스턴스 생성
        Data original = new Data(1, "blackpink", members);

        // 인스턴스의 참조 복사
        // 참조 대상이나 원본이 내부 데이터를 변경하면 영향을 준다.
        Data data = original;
        System.out.println(original); // Data{num=1, name='blackpink', members=[지수, 제니, 로제, 리사]}
        data.setNum(2);
        System.out.println(original); // Data{num=2, name='blackpink', members=[지수, 제니, 로제, 리사]}

        // 자바는 복제를 이용하고자 하는 경우 clone 메서드를 재정의 해야 한다.
        // 재정의할 때 Cloneable 인터페이스를 implements 하기를 권장
        Data copy = original.clone();
        System.out.println(original); // Data{num=2, name='blackpink', members=[지수, 제니, 로제, 리사]}
        copy.setNum(3);
        System.out.println(original); // Data{num=2, name='blackpink', members=[지수, 제니, 로제, 리사]}
        String[] names = copy.getMembers();
        members[0] = "아담";
        System.out.println(original); // Data{num=2, name='blackpink', members=[아담, 제니, 로제, 리사]}

        Data data1 = new Data(1, "구름", null);
        Data data2 = new Data(1, "구름", null);
        // ==는 참조를 비교하는 연산자
        // 2개의 인스턴스는 각각 생성자를 호출해서 만들어서 참조가 다름
        // 내용이 같은지 확인하고자 할 때는 equals 메서드를 재정의해서 사용
        System.out.println(data1 == data2); // false
        System.out.println(data1.equals(data2)); // true
    }
}
