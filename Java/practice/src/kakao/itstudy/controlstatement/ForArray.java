package kakao.itstudy.controlstatement;

public class ForArray {

    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j < 5; i++, j = j + 2) {
            System.out.println(i); // 0 1 2
            System.out.println(j); // 0 2 4
        }

        // 배열의 순회
        String[] names = { "aespa", "redvelvet", "f(x)" };
        for (String name : names) {
            System.out.println(name); // aespa redvelvet f(x)
        }

        // break와 continue
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // 0 1 2

            // break나 continue가 반복문 안에서 조건 없이 사용되면 경고 발생 - dead code가 만들어질 수 있다.
            //break;

            // 조건만 있으면 경고는 없어진다.
            if (i == 3)
                break;

            // 뒤의 코드를 실행할 일이 없다면 return으로 대체 가능
            //return; 
        }
    }
}
