package step7;

public class Car {
    // 주소는 2개이지만 클래스는 1개만 참조하고 싶을 경우
    private String model;
    private String color;

    /* 생성자 */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    // 생성자: 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화하는 메서드
    // 클래스명과 동일. 반환값이 없으나 리턴타입을 void형으로 선언하지 않음
    // 객체 초기화 방법이 여러개 일 경우, 하나의 클래스가 여러 개의 생성자를 가질 수 있음
    // (생성자도 하나의 메서드이므로 메서드 오버로딩이 가능하다는 뜻)



    /* getter & setter */
    public String getModel() {
        return model;
    }   // get함수 getter: 은닉된 멤버변수의 값을 읽는 방법

    public void setModel(String model) {
        this.model = model;
    }  // set함수 setter: 은닉된 멤버변수에 값을 넣는 방법

    public String getColor() {
        return color;
    }   // get함수 getter: 은닉된 멤버변수의 값을 읽는 방법

    public void setColor(String color) {
        this.color = color;
    }  // set함수 setter: 은닉된 멤버변수에 값을 넣는 방법
}