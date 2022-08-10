package step1;

public class TestException1 {
    public static void main(String[] args){
        String s = null;
        try {
            System.out.println(s.length());   // NullPointerException
            System.out.println("수행");
        } catch(NullPointerException ne){
            // Exception 클래스 -> 예외처리만 담당. NullPointerException 대신 써도 됨
            ne.printStackTrace();    // ne: 에러처리한 내용을 담음.  printStackTrace: 에러 원인등 알려줌
            System.out.println("null 이야");
        }
        System.out.println("프로그램 종료 ");
    }
}
