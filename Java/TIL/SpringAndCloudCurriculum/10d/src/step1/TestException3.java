package step1;

public class TestException3 {
    public static void main(String[] args){
        int i=0;
        /* try~catch */
        try{
            System.out.println(4/i);
        }catch(NullPointerException ne){
            System.out.println("Null이므로 수행불가");
        }finally {
            // 무조건 실행. 메시지 띄울때 많이 사용
            System.out.println("finally");
        }
        System.out.println("정상수행");
    }
}

// IO, JDBC, 네트워크 등 ->