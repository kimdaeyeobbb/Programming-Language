package step7;

public class TestHasA {
    public static void main(String[] args){
        Person p = new Person();   // 생성자가 없음
        p.setName("아이유");   // 데이터 할당
        p.setCar(new Car("k5","red"));   // Car 클래스에 대한 객체를 생성해서 setCar 호출
        // 클래스는 스택에 위치함
        // setCar 호출시 Car가 위치한 주소값을 Person에 던져줌
        // 변수를 여러개 사용할 수 있는 장점이 생김

        // 매개변수를 클래스 타입으로 접근시 객체 할당하고 값ㅡ을 넣어주면 코드가 짧아질 수 있음

        System.out.println(p.getName());
        System.out.println(p.getCar());   // 객체는 주소값만 던져줌 -> 결과는 주소값

        /* getCar에서 getModel과 getColor를 지정해주어야 함 */
        System.out.println(p.getCar().getModel());
        System.out.println(p.getCar().getColor());


        p.getCar().setModel("sm5");
        //car에 접근해서 수정을 하고 싶은 케이스
        p.getCar().setColor("black");
        // car에 접근해서 수정하는 방법

        System.out.println(p.getCar().getModel());
        System.out.println(p.getCar().getColor());
    }
}
