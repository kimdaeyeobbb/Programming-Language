// 아직 이해 못함
package step3;

import java.util.Scanner;

public class GradeInputMain2 {
    public static void main(String[] args){
        GradeInput[] giarr = new GradeInput[3];   // 배열 객체 생성
        Scanner sc = new Scanner(System.in);   // Scanner 객체 생성

        int i=0;

        for (i=0; i<giarr.length; i++){
            giarr[i] = new GradeInput();
            // 배열에 객체값 집어 넣음. 주소값 넣음
            /*
            힙에 위치한 배열 객체의 위치랑 매개변수의 위치는 다름.
            따라서 새로이 참조하기를 워하는 객체가 생길때마다
            계속해서 'new 클래스명'꼴로 새로 참조하게끔 만들어 주어야 함.
            */
            giarr[i].input(sc);   // 배열에 값 할당하기 위해 input 메서드 호출
            giarr[i].tot();   // 총점
            giarr[i].avg();
            // 배열이라는 공간은 힙에 생성되어 있음
        }

        for (i=0; i< giarr.length; i++){
            giarr[i].print();
        }
    }
}