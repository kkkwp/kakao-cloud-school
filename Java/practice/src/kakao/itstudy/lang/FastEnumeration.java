package kakao.itstudy.lang;

public class FastEnumeration {

    public static void main(String[] args) {
        // 기본값인 0을 가지고 1000000개의 데이터를 가진 배열 생성
        int[] ar = new int[1000000];

        long start = System.currentTimeMillis();
        // 인덱스를 이용한 순회 - 1557 밀리초
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        // 빠른 열거를 이용한 순회 - 1308 밀리초
        for (int temp : ar) {
            System.out.println(temp);
        }
        long end = System.currentTimeMillis();

        System.out.println((end - start) + " 밀리초");
    }
}
