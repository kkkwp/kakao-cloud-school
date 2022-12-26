package kakao.itstudy.util;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // 스택에 데이터 추가
        stack.push("마리오 캠페스");
        stack.push("디에고 아르만도 마라도나");
        stack.push("가브리엘 바티스투타");
        stack.push("리오넬 메시");

        // 데이터는 List처럼 순차적으로 삽입
        System.out.println(stack);

        // pop을 하면 가장 마지막에 삽입된 데이터를 삭제하면서 리턴
        System.out.println(stack.pop()); // 리오넬 메시
        System.out.println(stack.pop()); // 가브리엘 바티스투타
    }
}
