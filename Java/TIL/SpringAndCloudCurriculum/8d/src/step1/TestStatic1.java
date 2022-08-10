package step1;

import javax.naming.CompositeName;

class Company{
    public static int i=1;   //
    public static void test(){   //static은 객체 생성할 필요가 없음
        System.out.println("static test");
    }
}


public class TestStatic1 {
    public static void main(String[] args){
    //static : 객체 생성 필요없이 클래스명 멤버(변수, 메서드)로 접근
        Company.test();
        System.out.println(Company.i);
    }
}
