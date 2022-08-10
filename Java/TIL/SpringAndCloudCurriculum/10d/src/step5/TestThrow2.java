package step5;

public class TestThrow2 {
    public static void main(String[] args){
        Person p = new Person();
        try{
            p.setName("f");
        } catch(NameException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("정상수행");
    }
}
// 예외처리 이용해서 상속구조에 적용
// Name 패키지 안에 Exception 존재