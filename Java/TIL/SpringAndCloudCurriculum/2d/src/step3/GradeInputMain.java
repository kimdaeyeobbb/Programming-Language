package step3;

import java.util.Scanner;

public class GradeInputMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // new : 클래스로부터 객체 생성하는 연산자
        // new 연산자로 생성된 객체는 메모리 힙 영역에 생성됨
        // heap 영역에 객체를 생성한 다음, 객체의 주소를 리턴함
        // 이 주소를 참조 타입인 클래스 변수에 저장해두면, 변수를 통해 객체를 사용할 수 있다

        GradeInput gi = new GradeInput();
        // 객체 생성
        // GradeInputMain2에서 새로이 객체를 생성
        // 그래서 이때 또 'new 클래스명'꼴로 새로이 객체를 생성해주어야 함
        gi.input(sc);   // 입력

        gi.tot();   // 합계함수 호출
        gi.avg();   // 평균함수 호출
        gi.print();   // 출력함수 호출
    }
}
