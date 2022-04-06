package step3;

import java.util.Scanner;

public class GradeInputMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GradeInput gi = new GradeInput();   // 객체 생성
        gi.input(sc);   // 입력

        gi.tot();   // 합계함수 호출
        gi.avg();   // 평균함수 호출
        gi.print();   // 출력함수 호출
    }
}
