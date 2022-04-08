package step7;

public class TestOverriding3 {
    public static void main(String[] args){

        Student s = new Student("아이유","011","판교","12");
        System.out.println(s.getDetails());
        // 이름: 아이유, 전화번호: 011, 주소: 판교, 학번:12

        Teacher t = new Teacher("김연아","016","군포","체육");
        System.out.println(t.getDetails());
        // 이름: 김연아, 폰: 016, 주소: 군포, 과목: 체육

    }
}

// 학교에 대한 구성
// 학생 교직원 교사 == 사람 (공통적인 것)
// 공통 : 이름, 전화, 주소 (Person 클래스에 작성)
// 학생 : 구분해 줄 수 있는 변수가 필요 - 학생의 id : stuId

// 교직원: 사번
// 교수: 사번 - subject