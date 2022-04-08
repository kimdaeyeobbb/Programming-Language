package step3;

class Employee{
    private String no;

    public Employee(String no) {
        super();
        // 조상의 생성자를 뜻함
        // 상속했을 때 (자식입장에서는 자식 타입으로 상속하는데) super를 쓰면 부모가 가진것까지 합쳐서 상속할 수 있다.
        // 따라서 부모는 부모대로, 자식은 자식대로 가진것을 출력할 수 있다.
        // 참조변수 super와 무관하고, this와 같은 생성자이다.
        // 자손 클래스의 생성자에서 조상클래스의 생성자를 호출할 때 사용
        // 생성자&초기화블럭은 상속하지 않는다.
        // 조상의 멤버는 조상의 생성자를 호출해서 초기화한다.

        this.no = no;
    }
}

class Manager extends Employee{
    private String dept;   // 상속불가. 접근불가

    public Manager(String no, String dept) {    // 생성자 통해 값 2개 얻어옴
        super(no);   // super는 부모것을 가져옴. 초상클래스의 생성자 Employee(String no)를 호출
        this.dept = dept;
        // this.no까지 적을 필요는 없음. -> 이해완료 (자손의 생성자가 조상의 멤버를 초기화하는것보다
        // 조상의 멤버는 조상의 생성자를 통해 초기화 되도록 작성하는 것이 바람직하므로 super(no)로 적은것임)
    }
}

// 생성자 - 부모와 자식이 각각의 공간을 차지함

public class TestSuper2 {
    public static void main(String[] args){
        Manager m = new Manager("kosta","영업부");   // 값 할당
    }
}
