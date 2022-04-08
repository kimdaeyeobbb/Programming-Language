package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
    public static void main(String[] args){
        SchoolService service = new SchoolService();

        Student s = new Student("011","크리스탈","판교","12");
        service.addPerson(s);

        Teacher t = new Teacher("017","황정민","익산","국어");
        service.addPerson(t);

        Employee e = new Employee("019","시용태","수지","전산부");
        service.addPerson(e);

        service.printAll();

        Person per = service.findPerson("017");   // 찾고자 하는 전화번호 지정. return을 화면단어 출력하자

        if(per!=null){
            System.out.println(per);
        } else {
            System.out.println("없다.");
        }


    }

}
// super: 부모가 가지고 있는 변수를 가리킴
// student가 생성자 가짐
//