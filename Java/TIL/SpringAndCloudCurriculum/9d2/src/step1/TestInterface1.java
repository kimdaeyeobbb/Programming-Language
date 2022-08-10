package step1;

public class TestInterface1 {
    public static void main(String[] args){
        // 인터페이스 -> 계층구조 형성 -> 다형성 적용가능 -> 표준화
        // 상위 인터페이스 타입 변수로 하위 객체 참조 가능
        // 인터페이스는 구현의 형태가 없어서 상속하기가 편하다
        Flyer f1 = new SuperMan();
        f1.fly();

        Flyer f2 = new Bird();
        f2.fly();

        Flyer fa[] = {f1,f2)};

        for (int i=0; i<fa.length; i++){
            fa[i].fly();
            System.out.println(f1 instatnceof Flyer);
        }

        // 웹에서는 자바가 하는일이 DB에 접근하는것만 존재
    }
}
