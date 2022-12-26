package kakao.itstudy.util;

import java.util.ArrayList;
import java.util.Comparator;
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
        //search((ArrayList<Integer>) al, (LinkedList<Integer>) li);
        insert((ArrayList<Integer>) al, (LinkedList<Integer>) li);

        List <String> list = new ArrayList<>();
        list.add("김민지");
        list.add("팜하니");
        list.add("다니엘");
        list.add("강해린");
        list.add("이혜인");

        // 순회
        for (String temp : list) {
            System.out.println(temp);
        }

        // 데이터 정렬
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
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

    // 삽입
    public static void insert(ArrayList<Integer> al, LinkedList<Integer> li) {
        long start;
        long end;

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            al.add(1, 2);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList 중간 삽입 시간: " + (end - start)); // 360

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            li.add(1, 2);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList 중간 삽입 시간: " + (end - start)); // 3
    }
}
