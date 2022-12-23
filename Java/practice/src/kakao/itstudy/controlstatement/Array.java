package kakao.itstudy.controlstatement;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // 데이터를 가지고 배열 생성
        String[] soccers = { "반바스텐", "굴리트", "리카르도", "차범근" };
        // 배열의 데이터 순회
        int len = soccers.length;
        for (int j = 0; j < len; j = j + 1) {
            String imsi = soccers[j];
            System.out.println(imsi); // 반바스텐 굴리트 리카르도 차범근
        }

        // 생성하고 데이터를 대입
        int[] arr = new int[3]; // 숫자는 0으로 초기화
        arr[0] = 20;
        arr[1] = 30;
        // 배열의 순회
        for (int temp : arr) {
            System.out.printf("%5d", temp); //    20   30    0
        }

        // 예외 처리
        try {
            int[] br = null;
            // NullPointerException
            System.out.println(br[0]);
            // ArrayIndexOutOfBoundsException
            System.out.println(soccers[20]);
        } catch (Exception e) { }
        System.out.println("종료");

        // 2차원 배열
        String[][] programmers = {
                { "데니스 리치히", "비야네 스트롭스트롭", "아네르스 하일스베르" },
                { "귀도 반 로섬", "제임스 고슬링", "켄 톰슨" }
        };
        System.out.println(programmers.length); // 2 : 행의 개수
        System.out.println(programmers[0].length); // 3 : 열의 개수
        for (String[] p : programmers) {
            for (String designer : p) {
                System.out.print(designer + "\t");
            }
            System.out.println();
        }

        String[] langugeDesigner = {
                "데니스 리치히", "비야네 스트로스트롭", "아네르스 하일스베르",
                "귀도 반 로섬", "제임스 고슬링", "켄 톰슨"
        };
        for (int i = 0; i < langugeDesigner.length; i++) {
            System.out.print(langugeDesigner[i] + "\t");
            if (i % 3 == 2) {
                System.out.println();
            }
        }

        String[] ar = { "지수", "제니", "로제" };
        // 위의 배열의 내용을 가지고 데이터를 1개 추가한 배열을 생성
        // 1. 직접 복제
        String[] br = new String[ar.length + 1];
        // 배열의 요소 복제
        for (int i = 0; i < ar.length; i++) {
            br[i] = ar[i];
        }
        // 2. 배열을 복제
        String[] cr = Arrays.copyOf(ar, ar.length + 1);
        cr[3] = "리사";
        // 배열을 요소들을 하나의 문자열로 생성
        System.out.println(Arrays.toString(cr)); // [지수, 제니, 로제, 리사]
    
        // sorting
        // 문자열을 오름차순 정렬
        Arrays.sort(cr);
        System.out.println(Arrays.toString(cr));

        // 선택 정렬
        int[] arr2 = {1, 5, 3, 2, 4};
		// 첫번째 부터 마지막 앞 자리까지
		for (int i = 0; i < arr2.length - 1; i++) {
			// 기준의 뒤부터 마지막 자리까지
			for (int j = i + 1; j < arr2.length; j++) {
				// 자리의 데이터를 비교해서 기준 자리의 데이터가 크면 2개의 데이터를 swap
				if (arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
			// 하나의 pass가 완료되면 출력
			System.out.println(Arrays.toString(arr2));
		}
    }
}
