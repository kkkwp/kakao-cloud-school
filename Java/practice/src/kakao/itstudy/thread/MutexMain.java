package kakao.itstudy.thread;

// 스레드 작업을 위한 클래스
class ShareData implements Runnable {
    private int result; // 합계를 저장할 속성
    private int idx; // 합계를 구할 때 사용할 인덱스

    public int getResult() {
        return result;
    }

    // idx의 값을 1씩 증가시키면서 result에 더해줄 메서드
    private void sum() {
        for (int i = 0; i < 1000; i++) {
            idx = idx + 1;
            try {
                Thread.sleep(1);
            } catch (Exception e) {}
            result += idx;
        }
    }

    @Override
    public void run() {
        sum();
    }
}

public class MutexMain {

    public static void main(String[] args) {
        ShareData data = new ShareData();
        Thread th1 = new Thread(data);
        th1.start();
        Thread th2 = new Thread(data);
        th2.start();
        try {
            Thread.sleep(5000);
            System.out.println(data.getResult()); // 2001879
        } catch (Exception e) {}
    }
}
