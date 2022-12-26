package kakao.itstudy.util;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// 로또 번호 생성기처럼 1-45까지의 숫자 6개를 입력 받아서 저장한 후 출력
// 입력을 받을 때 1-45 사이의 숫자가 아니거나 중복되는 숫자를 입력하면 다시 입력하도록 한다.
// 데이터를 출력할 때는 정렬을 해서 출력

public class Lotto {

    public static void main(String[] args) {
        //array();
        treeset();
    }

    // 중복 검사가 수월하고 정렬을 수행하면서 삽입하는 TreeSet을 이용
    public static void treeset() {
        // 입력받기 위한 인스턴스 생성
        Scanner sc = new Scanner(System.in);

        // 중복된 데이터를 저장하지 않고 데이터를 정렬해서 저장하는 자료구조 클래스
        Set<Integer> set = new TreeSet<>();

        while (set.size() < 6) {
            try {
                System.out.print("로또 번호 입력: ");
                int temp = sc.nextInt();
                if (temp < 1 || temp > 45) {
                    System.out.println("1-45 사이의 숫자만 입력하세요!");
                    continue;
                }
                // 중복 검사
                boolean result = set.add(temp);
                // 삽입에 실패하면 - 중복된 데이터라면
                if (!result) {
                    System.out.println("중복된 숫자입니다!");
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("숫자를 넣으세요!");
            }
        }

        System.out.println(set);

        // 배열로 사용 - error
        //Integer[] lotto = (Integer[])set.toArray();
        //System.out.println(Arrays.toString(lotto));

        // 스캐너 정리
        sc.close();
    }

    // 배열 이용
    public static void array() {
        // 입력받기 위한 인스턴스 생성
        Scanner sc = new Scanner(System.in);

        // 6개의 정수를 저장할 배열을 생성
        int[] lotto = new int[6];

        int len = lotto.length;
        for (int i = 0; i < len; i++) {
            try {
                System.out.print("로또 번호 입력: ");
                lotto[i] = sc.nextInt();

                // 1부터 45 사이의 숫자만 입력 받도록 하기
                if (lotto[i] < 1 || lotto[i] > 45) {
                    System.out.println("1-45 사이의 숫자만 입력하세요!");
                    i--;
                    // 중복 검사를 하지 않고 패스
                    continue;
                }

                // 데이터 중복 검사
                // 첫번째부터 현재 데이터 앞까지 비교

                // 중복이 발생했는지 체크하기 위한 변수
                boolean flag = false;
                for (int j = 0; j < i; j++) {
                    // 2개의 데이터가 같으면 중복되었다고 표시
                    if (lotto[i] == lotto[j]) {
                        flag = true;
                        break;
                    }
                }
                // 중복된 경우
                if (flag) {
                    System.out.println("중복된 숫자입니다!");
                    i--;
                }
            } catch (Exception e) {
                // 이번은 무효 - 인덱스를 뒤로
                i--;
                sc.nextLine();
                System.out.println("숫자를 넣으세요!");
            }
        }
        // 배열의 데이터 정렬
        Arrays.sort(lotto);
        // 배열의 데이터를 출력
        System.out.println(Arrays.toString(lotto));

        // 스캐너 정리
        sc.close();
    }
}
