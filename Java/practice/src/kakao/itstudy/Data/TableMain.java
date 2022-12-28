package kakao.itstudy.Data;

public class TableMain {

    public static void main(String[] args) {
        Table row1 = new Table();
        System.out.println(row1.getNum()); // 1
        Table row2 = new Table();
        System.out.println(row2.getNum()); // 2
        Table.setStep(10);
        Table row3 = new Table();
        System.out.println(row3.getNum()); // 12
    }
}
