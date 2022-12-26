package kakao.itstudy.util;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        // 데이터를 sort 된 것처럼 저장
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("요한 크루이트");
        queue.offer("마르코 반바스텐");
        queue.offer("루드 굴리트");
        queue.offer("데니스 베르캄프");
        queue.offer("패트릭 클라이베르트");
        System.out.println(queue);

        // 데니스 베르캄프를 지우면서 리턴
        System.out.println(queue.poll());
    }
}
