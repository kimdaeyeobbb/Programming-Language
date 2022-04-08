package step5;

class Animal{
    public void eat() {
        System.out.println("먹다");
    }
}

class Person extends Animal{
    public void eat(){  // 오버라이딩 - 조상 클래스로부터 상속받은 내용을 변경하는 것
        System.out.println("사람이 수저로 먹다");
    }
}

class Dog extends Animal{
    public void eat(){  // 오버라이딩 - 조상 클래스로부터 상속받은 내용을 변경하는 것
        System.out.println("개가 혀로 먹다");
    }
}

public class TestOverriding1 {
    public static void main(String[] args){
        Person p = new Person();
        p.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}