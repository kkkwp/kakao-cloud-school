package kakao.itstudy.basic;

public class ConsoleDisplay {

    public static void main(String[] args) {
        // console에 메시지 출력
        System.out.println("Message"); // Message

        // 메시지와 데이터를 결합해서 출력
        System.out.println("Data: " + 99); // Data: 99

        Integer i = 120;
        System.out.println(i); // 120 : i.toString()의 결과를 출력
        System.out.println(i.toString()); // 120

        int[] ar = { 10, 20, 30 };
        System.out.println(ar); // [I@6e8dacdf : toString이 재정의 되지 않아서 해시코드가 출력됨
    }
}