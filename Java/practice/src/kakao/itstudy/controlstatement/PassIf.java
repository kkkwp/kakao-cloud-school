package kakao.itstudy.controlstatement;

import java.util.Scanner;

public class PassIf {

    public static void main(String[] args) {
        //scoreIf();
        login();
    }

    public static void scoreIf() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("점수 입력: ");
            int score = sc.nextInt();
            if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80 && score < 90) {
                System.out.println("B");
            } else if (score >= 70 && score < 80) {
                System.out.println("C");
            } else if (score >= 60 && score < 70) {
                System.out.println("D");
            } else if (score >= 0 && score < 60) {
                System.out.println("F");
            } else {
                System.out.println("잘못된 점수 입력입니다.");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void login() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("아이디를 입력하세요: ");
            String id = sc.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String pw = sc.nextLine();

            // 문자열은 생성 방법에 따라 다른 인스턴스가 될 수 있어서,
            // 값이 동일한지 비교할 때 ==가 아니라 equals 메서드를 이용해서 동일성 여부를 비교
            if (id.equals("root") && pw.equals("1234")) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
