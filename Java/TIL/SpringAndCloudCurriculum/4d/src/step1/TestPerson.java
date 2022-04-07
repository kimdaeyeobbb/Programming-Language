package step1;

public class TestPerson {
    public static void main(String[] args){
        // 매개변수 존재시 호출과 동시에 값을 할당해야 함
        // private 변수는 접근 불가 -> 패키지로 가져오는 것도 불가능
        // set이 작성된 메서드는 setting 목적

        Person p = new Person();
        p.setName("아이유 ");   // 값 할당
        System.out.println(p.getName());   // 할당한 값이 출력됨
        p.setMoney(1000);
        System.out.println(p.getMoney());

    }
}
