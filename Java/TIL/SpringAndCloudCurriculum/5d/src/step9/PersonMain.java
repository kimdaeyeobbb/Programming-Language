package step9;

public class PersonMain {
    public static void main(String[] args){
        Person p = new Person();   // 객체 생성
        p.setNum(1);   // 값 지정
        p.setName("person");
        p.setAddress("address");
        p.print();
        System.out.println("===================");


        Professor f = new Professor(); // 객체 생성
        f.setNum(2);    //값 지정
        f.setName("컴퓨터 공학");
        f.setAddress("서울시");

        f.setSubject(new String[] {"전산학개론", "C프로그래밍", "RTOS"});   // 데이터 여러개 삽입
        f.print();
        f.print_subj();


        Student s = new Student();   // 객체 생성
        s.setNum(3);   // 값 지정
        s.setName("학생");
        s.setAddress("경기도 ");

        s.setSubject(new String[] {"자바", "운영체제", "컴파일러"});
        s.print();
        s.print_subj();
        System.out.println("====================");


        Staff stf = new Staff();    // 객체 생성
        stf.setNum(4);   // 값 지정
        stf.setName("교원1");
        stf.setDept("HR");
        stf.setAddress("강원도");
        stf.setJob("교육부");
        stf.print();
        stf.print_job();


        // 상속 - 부모의 주소값을 복사해서 사용하는 것

        // super- 통합적인 검색기능 제공, 간단함, 세부접근 할 필요없게 만듦
    }
}