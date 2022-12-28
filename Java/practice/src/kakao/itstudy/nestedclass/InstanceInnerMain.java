package kakao.itstudy.nestedclass;

public class InstanceInnerMain {

    public static void main(String[] args) {
        // 외부 클래스의 인스턴스를 생성
        InstanceInner instanceInner = new InstanceInner();
        // 내부 클래스의 인스턴스 생성
        InstanceInner.Inner inner = instanceInner.new Inner();
    }
}
