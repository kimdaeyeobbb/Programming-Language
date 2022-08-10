package step8;

public class TestHasA2 {
    public static void main(String[] args){
        Engineer e = new Engineer("고슬링", new Notebook("델","100"));
        // Engineer가 매개변수를 하나 가지고 있으므로 매개변수를 하나 할당해야 함
        // 생성자에 할당을 시켜주는 과정

        System.out.println(e.getName());   // 고슬링
        System.out.println(e.getNotebook().getModel());  // 델
        System.out.println(e.getNotebook().getPrice());  // 100
        // e.getNotebook()만 찍으면 주소값만 나옴


        /* get&set */
        e.getNotebook().setPrice("200");

    }
}
