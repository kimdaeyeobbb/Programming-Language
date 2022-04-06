package step1;

public class PersonMain {
    public static void main(String[] args){
    // 메인이 없으면 실행되지 않음

        Person p = new Person();
        // Person p : 스택에 보관
        // () : 호출을 한다는 의미
        // heap : 언제 프로그램이 실행시

        p.a = 1;  // p. -> 변수에 접근할 수 있게 됨
        p.b = 2;

        System.out.println(p.a);   //
        System.out.println(p.b);   //
    }
}