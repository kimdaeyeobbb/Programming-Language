package step8;

class A{

}

public class TestObject3 {
    public static void main(String[] args){
        // 배열 - 바뀌지 않음
        // String의 단점 - 고정형

        A a = new A(); // 객체 생성
        A a1 = new A();   // 객체 생성

        System.out.println(a==a1);  // false - 보통 숫자 비교시 사용
        System.out.println(a!=a1);  // true - 보통 숫자 비교시 사용

        System.out.println(a.equals(a1));   // 보통 자바상 객체값이 일치하는지 확인
        System.out.println(!a.equals(a1));   // 보통 자바상 객체값이 다른지 확인 (앞에 느낌표 찍어서 부정형으로 바뀜)


        String s1 = "아이유";
        String s2 = new String("아이유");

        System.out.println(s1==s2);

        // String class에서 java.lang.Object 클래스의 equals()를
        // 주소값이 아닌 실제 문자열을 비교하도록 자체적으로 메서드 오버라이딩 했다.
        System.out.println(s1.equals(s2));


        /* StringBuffer */
        StringBuffer sb1 = new StringBuffer("보아");   // 배열과 달리, 공간이 가변적
        StringBuffer sb2 = new StringBuffer("보아");

        // StringBuffer에서 String class와 달리 equals()를 메서드 오버라이딩 하지 않았음
        // 여기서 equals는 실제데이터가 아닌 주소값만 비교하는 것임 - StringBuffer로 값을 비교하기 어려움
        System.out.println(sb1.equals(sb2));
    }
}