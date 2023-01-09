package kakao.itstudy.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        // Student 클래스의 List 생성
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "김좌진", "남자", "컴공", 93));
        list.add(new Student(2, "안중근", "남자", "기계", 100));
        list.add(new Student(3, "윤봉길", "남자", "사체", 83));
        list.add(new Student(4, "유관순", "여자", "컴공", 99));
        list.add(new Student(5, "남자현", "여자", "컴공", 87));

        // score의 합계
        // Student를 Student.getScore 메서드의 결과를 이용해서 정수로 변환하여 합계를 구함
        int sum = list.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("점수의 합계: " + sum); // 점수의 합계: 462

        // 평균 구하기
        OptionalDouble avg = list.stream()
                .mapToInt(Student::getScore)
                .average();
        // optional이 붙는 자료형은 null 여부를 확인 후 사용
        if (avg.isPresent()) {
            System.out.println("점수의 평균: " + avg.getAsDouble()); // 점수의 평균: 92.4
        } else {
            System.out.println("평균을 구할 수 없음");
        }

        // reduce - 집계
        // 매개변수가 2개이고 리턴이 있는 메서드를 제공
        // 처음 2개의 데이터를 가지고 메서드를 호출해서 결과를 만들고, 그 다음부터는 결과 다음 데이터를 가지고 메서드를 호출
        sum = list.stream()
                .mapToInt(Student::getScore)
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum); // 462

        // 남자만 추출해서 List로 변환
        List<Student> manList = list.stream()
                .filter(student -> student.getGender().equals("남자"))
                .collect(Collectors.toList());
        System.out.println(manList); // [Student{num=1, name='김좌진', gender='남자', subject='컴공', score=93}, Student{num=2, name='안중근', gender='남자', subject='기계', score=100}, Student{num=3, name='윤봉길', gender='남자', subject='사체', score=83}]

        // gender 별로 그룹화해서 score의 평균 구하기
        Map<String, Double> genderMap = list.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingDouble(Student::getScore)));
        System.out.println(genderMap); // {여자=93.0, 남자=92.0}
        System.out.println(genderMap.get("남자")); // 92.0
    }
}
