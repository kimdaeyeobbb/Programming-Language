package step4;

class Animal {
    int age=1;   // 값 할당
    private String card = "카드";

    /* get & set */
    public int getAge() {
        return age;
    }  // getter: 은닉된 멤버변수의 값을 읽는 방법

    public void setAge(int age) {
        this.age = age;
    }   // setter: 은닉된 멤버 변수에 값을 넣음

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}

class Person extends Animal{
    public void info() {
        System.out.println("부모 변수에 접근 테스트: " +super.age);
        System.out.println(super.getCard());
        // private 는 자식에게 접근 불가. get 메서드를 통해 간접접근 가능
    }
}

public class TestSuper3 {
    public static void main(String[] args){
        Person p = new Person();
        p.info();
    }
}
// 상속의 목적 - 내것에 맞게 변경시키기 위함. 기존에 만들어놓은 이름을 그대로 써도 되므로 값을 가져다가 쓰면 된다는 장점이 존재
// 오버라이딩 - 상속 받은 메서드를 재정의