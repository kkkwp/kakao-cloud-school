package kakao.itstudy.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        // 정수를 저장하기 위한 ArrayList
        List<Integer> al = new ArrayList<>();
        // 정수를 저장하기 위한 LinkedList
        List<Integer> li = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            al.add(i);
            li.add(i);
        }

        search((ArrayList<Integer>) al, (LinkedList<Integer>) li);
    }

    // 조회
    public static void search(ArrayList<Integer> al, LinkedList<Integer> li) {
        long start;
        long end;

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer integer = al.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 조회 시간: " + (end - start)); // 7

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer integer = li.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 조회 시간: " + (end - start)); // 3612
    }
}
