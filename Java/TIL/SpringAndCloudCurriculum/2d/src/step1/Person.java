package step1;

public class Person {  // 클래스는 값 대입가능, 기능구현 가능
    int a,b;

    /* 기능 실행 */
    void print(){
        System.out.println(a);
        System.out.println(b);
    }

    /* 접근 지정자 */
    /*
    private int a,b;
    public void print(){
        System.out.println(a);
        System.out.println(b);
    }
    이렇게 설정시 PersonMain에서 에러 발생
     */
}
