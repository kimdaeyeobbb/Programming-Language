package step7;

public class Person {
    private String name;
    private Car car;
    // Car 객체의 주소값을 담기 위해 car를 선언하고 참조형 데이터 타입은 클래스명이됨
    // 객체 생성시 힙에 메모리 영역 생김
    // 자료구조에 값을 할당시키기 위해서는 객체값만 들어가야 함

    // 참조형 -> 참조형 변수 안에는 값들을 저장하고 있는 객체를 가르키는 주소를 가지고 있음 + 힙에 저장

    /* Getter & Setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}