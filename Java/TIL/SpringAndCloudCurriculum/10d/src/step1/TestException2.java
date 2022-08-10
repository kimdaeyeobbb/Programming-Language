package step1;

public class TestException2 {
    public static void main(String[] args){
        String names[] = {"크리스탈", "소지섭","황정민"};

        try{
            System.out.println(names[0]);   // 첫번째 값 출력
            System.out.println(names[1]);
            System.out.println(names[2]);

            String s = null;
            System.out.println(s.length());
        } catch (Exception a){
            System.out.println("인덱스 범위 초과");
        }
    }
}
