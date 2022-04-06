// 아직 이해 못함 -> 어느정도 이해했으나 복습하여 내것으로 만들것

package step4;

import java.util.Scanner;

public class GradeInputMain {
    public static void main(String[] args){
        GradeInput[] r = new GradeInput[3];
        // 배열에 대한 객체만 생성 (객체배열) -> 객체를 담기위한 것
        // 비어있는 3개의 공간 생성
        // new 등장 -> 힙으로 간주
        // 객체배열(참조변수 배열)은 참조변수들을 하나로 묶은 참조변수 배열임

        Scanner sc = new Scanner(System.in);
        // new 등장

        int kor, eng, math, total = 0, sum;
        float avg;

        System.out.println("정보를 입력받습니다.");
        for (int i=0; i<r.length; i++){
            System.out.println("이름과 국어,영어,수학 점수를 입력하세요 : ");
            r[i] = new GradeInput();
            // 객체를 생성해서 배열의 각 요소에 저장장
           // 배열에 주소값 던져줌

            r[i].name = sc.next();  // 이름 입력
            r[i].kor = sc.nextInt();
            r[i].eng = sc.nextInt();
            r[i].math = sc.nextInt();
            r[i].total = r[i].kor+r[i].eng+r[i].math;
            r[i].avg = (float)total/3;
        }

        for(int i=0; i<r.length; i++){
            System.out.println("이름: " + r[i].name);
            System.out.println("국어: " + r[i].kor);
            System.out.println("영어: " + r[i].eng);
            System.out.println("수학: " + r[i].math);
            System.out.println("총점: " + r[i].total);
            System.out.println("평균: " + r[i].avg);
        }
    }
}
