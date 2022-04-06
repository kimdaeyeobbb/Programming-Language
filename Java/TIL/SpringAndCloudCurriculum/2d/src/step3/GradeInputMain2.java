// 아직 이해 못함
package step3;

import java.util.Scanner;

public class GradeInputMain2 {
    public static void main(String[] args){
        GradeInput[] giarr = new GradeInput[3];   // 배열 객체 생성
        Scanner sc = new Scanner(System.in);   // Scanner 객체 생성

        int i=0;

        for (i=0; i<giarr.length; i++){
            giarr[i] = new GradeInput(); // 배열에 객체값 집어 넣음. 주소값 넣음
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
