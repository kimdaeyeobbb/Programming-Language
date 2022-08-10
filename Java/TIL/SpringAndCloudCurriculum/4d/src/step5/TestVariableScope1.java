package step5;

public class TestVariableScope1 {
    private int i;
    // 전역변수(인스턴스 변수). 자동으로 0으로 초기화
    // 생성자에서 this가 보임 -> 전역변수 지칭

    public void test1(){
        System.out.println("test1"+i);
    }

    public void test2(){
        int i=1;   // 메서드 내 지역변수
        System.out.println(i);
        System.out.println(this.i);   // this-> 전역변수 지칭
    }
}
