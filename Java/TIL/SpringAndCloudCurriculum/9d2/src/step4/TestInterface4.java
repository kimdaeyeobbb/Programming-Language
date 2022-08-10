package step4;


interface A{
    public void a();
}


interface B extends A{
    public void b();

}  // 인터페이스들끼리 상속 가능


class C implements B{

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }
}

interface D{
    public void d();

}

class E implements B,D{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void d() {

    }
}


public class TestInterface4 {
    public static void main(String[] args){

    }
}
