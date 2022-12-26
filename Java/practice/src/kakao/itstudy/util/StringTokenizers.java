package kakao.itstudy.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTokenizers {

    public static void main(String[] args) {
        // 관계형 데이터베이스에서 하나의 테이블에 기본키를 설정하면 이 기본키에 배열로 매핑되는 데이터는 삽입할 수 없다.
        // 제 1 정규형(NF): 모든 속성의 값은 원자값(더 이상 분해할 수 없는 값)이어야 한다.

        // 하나의 게시글에 여러 개의 첨부파일을 삽입하는 경우 첨부파일 테이블을 별도로 만든다.
        // 이렇게 별도의 테이블로 만들면 게시글을 가져와서 첨부파일명을 출력하려면 join을 해야 한다.
        // 관계형 데이터베이스에서 가장 많은 시간을 소비하는 것이 join
        // 이럴 때 join 시간을 아끼고자 하면 첨부파일 이름들을 하나로 묶어서 저장해도 된다.

        // ArrayList: 데이터를 물리적으로 연속해서 저장
        // LinkedList보다는 조회 속도가 빠르지만 삽입 및 삭제 속도는 느리다.
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("image1.png");
        list.add("image3.png,image5.png,image7.png");

        // list 순회
        for (String temp : list) {
            if (temp == null) {
                System.out.println("첨부파일 없음");
            } else {
                String[] imsi = temp.split(",");
                System.out.println(Arrays.toString(imsi)); // [image3.png, image5.png, image7.png]
            }
        }

        String[] image0 = null;
        String[] image1 = {"image100.png"};
        String[] image2 = {"image101.png", "image102.png"};

        if (image0 == null) {
            System.out.println("default.png");
        }

        // image1과 image2를 변경해가면서 확인
        if (image2 != null && image2.length == 1) {
            System.out.println("image2[0]");
        } else {
            String x = image2[0];
            for (int i = 1; i < image2.length; i++) {
                x = x + ", " + image2[i];
            }
            System.out.println(x); // image101.png, image102.png
        }
    }
}
