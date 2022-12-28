package kakao.itstudy.Data;

import kakao.itstudy.Data.EmbeddedClass;

public class Embed {
    public String name;

    public void createEmbedded() {
        // 다른 클래스의 인스턴스를 생성
        // 생성자를 이용한 주입 - 생성자를 호출할 때 현재 인스턴스의 침조를 넘겨주는 것
        EmbeddedClass obj = new EmbeddedClass(this);
        obj.setEmbed(this); // setter 이용

        // 포함하는 인스턴스가 포함된 인스턴스의 멤버 호출
        obj.score = 100;
        System.out.println(obj.score);
    }
}
