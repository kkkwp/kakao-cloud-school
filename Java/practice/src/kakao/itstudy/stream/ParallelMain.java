package kakao.itstudy.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelMain {

    public static void main(String[] args) {
        // 정수 리스트 생성
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 일반 스트림으로 1초씩 쉬면서 출력
        long start = System.currentTimeMillis();
        list.stream().forEach(imsi -> {
            try{
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        });
        long end = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (end - start)); // 걸린 시간: 10076

        // 병렬 스트림으로 1초씩 쉬기
        start = System.currentTimeMillis();
        list.stream().parallel().forEach(imsi -> {
            try{
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        });
        end = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (end - start)); // 걸린 시간: 2047
        // 코어 개수 확인
        System.out.println(Runtime.getRuntime().availableProcessors()); // 8
    }
}
