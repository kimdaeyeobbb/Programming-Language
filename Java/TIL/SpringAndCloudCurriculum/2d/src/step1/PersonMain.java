package step1;

public class PersonMain {
    public static void main(String[] args){
        // 메인은 나중에 사라지므로 클래스에 최대한 기능을 구현해놓는 것이 중요하다

        Person p = new Person();   // 클래스에 대한 객체 생성
        p.a = 1; p.b = 2;   // 값 할당
        p.print();
        // 메서드 호출
        // 메서드는 기능만 수행 (해당 메서드는 출력 기능 수행)

    }
}
