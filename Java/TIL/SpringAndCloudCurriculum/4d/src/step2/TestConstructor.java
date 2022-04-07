package step2;

public class TestConstructor {
    public static void main(String[] args){
        Person p = new Person("아이유");   // 생성자 또한 만들자 말자 값을 할당해줘야 오류발생 x

        //생성자는 메모리에 놓이면 자동으로 호출
        // 메서드 - 마음대로 호출 가능. 생성자 - 메모리에 놓였을때 딱 1번만 호출 가능
        // 수정시에는 set메서드 사용해야함

        // 생성자의 목적 - 초기화. 메모리에 놓였을 때 딱 1번 호출되고 작업이 끝남.
        // 수정시에는 set메서드를 반복호출 하여야 함
        System.out.println(p.getName());

        p.setName("보아");
        System.out.println(p.getName());
    }
}
