package kakao.itstudy.util;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int [] ar = {30, 20, 50, 10,40};

        // 정렬을 수행하지 않고 하면 논리적인 오류가 발생
        System.out.println(Arrays.binarySearch(ar, 20)); // -1

        Arrays.sort(ar);
        System.out.println(Arrays.binarySearch(ar, 20)); // 1

        // sort가 된 상태이므로 0이 아니고 2
        System.out.println(Arrays.binarySearch(ar, 30)); // 2
    }
}
