package step5;

public class TestPerson {
    public static void main(String[] args){
        Person p = new Person();   // 객체 생성
        p.study("자바");
        p.study("JSP");
        p.wake(7);
        p.eat("차돌박이", 4);
        p.plus(2,4);

        String str = p.play();
        System.out.println(str);

        String result = p.order(50000);
        System.out.println(result);

        int r = p.minus(4,2);
        System.out.println(r);
    }
}
