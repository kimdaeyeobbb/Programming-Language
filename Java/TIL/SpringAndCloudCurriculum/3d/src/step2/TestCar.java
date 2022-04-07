package step2;

public class TestCar {
    public static void main(String[] args){
        // Car 객체 생성 후 go를 호출하세요
        // 클래스명 변수명 = new 클래스명();
        // 클래스는 '틀'이므로 데이터가 들어가있으면 안된다.

        Car c1 = new Car();
        // 객체 생성 = 객체의 주소값에 접근
        c1.go();  // 함수 호출

        c1.model = "k5";
        System.out.println(c1.model);
        System.out.println(new Car());   // 해쉬코드 == 주소값

        Car c2 = new Car();
        // 객체 생성 -> 앞의 객체와 주소 위치값이 달라짐
        // 자바는 참조값을 가지고 컨트롤만 해주면 됨
        c2.model = "sm5";
        System.out.println(c2.model);
        System.out.println(new Car());
    }
}
