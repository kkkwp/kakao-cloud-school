package kakao.itstudy.Data;

public class Table {
    private static int sequence; // 일련번호
    private static int step = 1;

    // get은 현재 데이터를 확인
    public static int getSequence() {
        return sequence;
    }
    public static int getStep() {
        return step;
    }

    // set은 현재 데이터를 수정하기 위한 메서드
    public static void setSequence(int sequence) {
        Table.sequence = sequence;
    }
    public static void setStep(int step) {
        Table.step = step;
    }

    // 인스턴스가 별도로 소유
    private int num;

    public Table() {
        sequence += step;
        num = sequence;
    }

    public int getNum() {
        return num;
    }
}
