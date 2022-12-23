package kakao.itstudy.controlstatement;

public class star {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 25; i++) {
            System.out.print("*");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

}
