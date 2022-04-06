package step3;

import java.util.Scanner;

public class GradeInput {
    String name;
    int kor, eng, math, total;
    float avg;

    void input(Scanner sc){
        System.out.println("이름: ");
        name = sc.next();

        System.out.println("국어: ");
        kor = sc.nextInt();

        System.out.println("영어: ");
        eng = sc.nextInt();

        System.out.println("수학: ");
        math = sc.nextInt();
    }

    void tot(){
        total = kor+eng+math;
    }   // 총점 -> 메인에서 호출만 해주면 됨

    void avg(){
        avg = total/3;
    }   // 평균

    void print(){
        System.out.println("이름: "+ name);
        System.out.println("국어: "+ kor);
        System.out.println("영어: "+ eng);
        System.out.println("수학: "+ math);
        System.out.println("총점: "+ total);
        System.out.println("평균: "+ avg);
    }
}
