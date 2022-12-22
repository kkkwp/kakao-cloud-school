package kakao.itstudy.controlstatement;

public class While {

    public static void main(String[] args) {
        whileSum();
        doWhileSum();
    }

    public static void whileSum() {
        int tot = 0;
        int i = 0;
        while (i <= 10) {
            // 반복할 내용
            tot = tot + i;
            i = i + 1;
        }
        System.out.println("합계: " + tot); // 합계: 55
    }

    public static void doWhileSum() {
        int tot = 0;
        int i = 0;
        do {
            // 반복할 내용
            tot = tot + i;
            i = i + 1;
        } while (i <= 10);
        System.out.println("합계: " + tot); // 합계: 55
    }
}
