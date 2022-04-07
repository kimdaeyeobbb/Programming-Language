package step4;

public class Person {

    public void eat(String food){  // 매개변수 -> 값 직접할당X & 값을 복사해서 들어감
        System.out.println(food+"을(를) 먹다");  // 메인에서 함수 호출시 출력될 문장
    }
}