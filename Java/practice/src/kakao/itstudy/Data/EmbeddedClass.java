package kakao.itstudy.Data;

// 포함되는 클래스
public class EmbeddedClass {
    public int score;
    // 포함하는 클래스의 인스턴스 참조를 기억하기 위한 속성
    private Embed embed;

    // 1. 생성자를 이용한 주입
    // 인스턴스를 만들 때 호출 - 속도에서 이득을 보지만 메모리 효율은 떨어질 수 있음 - server
    public EmbeddedClass(Embed embed) {
        this.embed = embed;
    }

    // 2. 주입을 위한 setter
    // 필요할 때 호출 - client
    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

    public void set() {
        // 여기서 포함하는 클래스의 멤버를 수정
        embed.name = "독수리다방";
        System.out.println(embed.name);
    }
}
