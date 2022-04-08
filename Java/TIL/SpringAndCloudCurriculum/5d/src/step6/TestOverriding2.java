package step6;

class Employee{
    private String empNo; // 접근 불가 -> super로 접근
    private String eName;

    public Employee(String empNo, String eName) {
        // 생성자
        // 클래스 변수에 메모리를 할당 (인스턴스를 만드는 과정에서 호출되는 함수)
        // 생성자에 인자 추가시 실행할 때 인자값을 넣어서 호출할 수 있다.
        this.empNo = empNo;
        this.eName = eName;
    }

    /* get, set */
    public String getEmpNo() {
        return empNo;
    }  // getter: 은닉된 멤버변수의 값을 읽어옴

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }  // setter: 은닉된 멤버 변수에 값을 넣음

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDetails(){
        return "empNo: "+empNo+" eName: "+eName;
    }
}

class Manager extends Employee{
    private String dept;

    public Manager(String empNo, String eName, String dept) {
        super(empNo, eName);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }  // getter: 은닉된 멤머변수의 값을 읽어옴

    public void setDept(String dept) {
        this.dept = dept;
    }  // setter: 은닉된 멤버변수에 값을 넣음

    public String getDetails(){
        return super.getDetails()+" dept: "+dept;
    }
}

public class TestOverriding2 {
    public static void main(String[] args){

        Employee e = new Employee("a1","아이유");
        System.out.println(e.getDetails());

        Manager m = new Manager("a2", "정대세", "영업부");
        System.out.println(m.getDetails());

    }
}