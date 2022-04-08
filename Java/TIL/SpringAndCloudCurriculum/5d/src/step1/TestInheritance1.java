package step1;

// 한 페이지에 작성하므로 접근 지정자 제거
class Animal{
    int age = 1;
    public void eat(){
        System.out.println("먹다");
    }
}

// 생성자는 메모리 초기화시 생성


class Person extends Animal{
    public void study(){
        System.out.println("공부하다");
    }
}
// 부모와 자식의 메모리값은 따로 생성. 값이 복사해서 들어감
// 상속 - 부모가 만든것을 자식이 허용하게끔 만들어주는 것

public class TestInheritance1 {
    public static void main(String[] args){
        Person p = new Person();   // 객체 생성
        p.study();
        p.eat();
        System.out.println(p.age);
    }
}

// super - 자식 클래스에서 부모가 만들어놓은 변수에 값을 넣어줄 수 있도록 만들어주는 키워드