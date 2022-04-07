package step1;

public class TestHouse {
    public static void main(String[] args){
        House h = new House();    // 객체 생성 (객체는 주소값 던져줌)
        System.out.println(new House());
        System.out.println(h.address);   // 점(.)을 찍으면 접근가능한지 확인 가능하다
        h.info();   // 메서드 호출

        House h1 = new House();   // 객체 생성 (클래스의 재사용성 활용)
        h1.info();   // 메서드 호출
    }
}