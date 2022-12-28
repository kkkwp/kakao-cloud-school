package kakao.itstudy.exceptionhandling;

import java.util.Arrays;

public class DebuggingMain {
    public static void test() {
        int x = 10;
        int[] ar = {30, 20, 30, 50};
        x = 30;
        System.out.println(x); // 30
        ar[2] = 90;
        System.out.println(Arrays.toString(ar)); // [30, 20, 90, 50]
    }

    public static void main(String[] args) {
        test();
    }
}
