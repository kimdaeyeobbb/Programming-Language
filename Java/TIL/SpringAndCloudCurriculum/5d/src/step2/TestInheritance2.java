package step2;
// 메모리에 놓이면 생성자 호출
// 아래 3개는 각자의 공간에 놓임
// 상속은 부모에 대한 주소값을 복사하는 방식으로 접근

class GrandParant{
    GrandParant(){
        // super(); -> 조상의 멤버를 자신과 구별할 때 사용
        // 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용하는 참조변수
        // 멤버변수와 지역변수명이 동일할 경우 this를 붙여서 구분한 것처럼
        // 상속받은 멤버와 자신의 멤버와 이름이 같을 떄는 super를 붙여서 구별할 수 있다
        // 객체 자신을 가리키는 참조변수, 인스턴스 메서드, 생성자 내에서만 존재
        System.out.println("grandparent 객체 생성");
    }
}

class Parent extends GrandParant{
    Parent(){   // super();
        System.out.println("parent 객체 생성");
    }
}

class Child extends Parent{
    Child(){// super()
        System.out.println("Child 객체 생성");
    }
}

public class TestInheritance2 {
    public static void main(String[] args) {
        new Child();    // 자식 생성자 내부이 첫줄에 super();를 써주어야 컴파일 에러가 발생하지 않음
    }
}