package step2;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args){
        int i,sum = 0;
        float avg;
        int[] jumsu = new int[5];   // 방의 길이=5

        Scanner sc = new Scanner(System.in);   // 키보드로부터 입력 받음

        /* 점수 입력 */
        System.out.println("5명의 수학 점수를 입력하세요 : ");

        for (i=0; i<jumsu.length; i++){
            jumsu[i] = sc.nextInt();
        }

        /* 총점 계산 */
        for (i=0; i< jumsu.length; i++){
            sum += jumsu[i];
        }

        /* 평균구하기 */
        avg = sum/ jumsu.length;

        /* 출력 */
        System.out.print("수학 점수는 ");
        for (i=0; i< jumsu.length; i++){
            System.out.print(jumsu[i]+"\t");
        }
        System.out.println("점 입니다.");

        System.out.println("총점은 "+sum+"점 입니다." );
        System.out.println("평균은 "+avg+"점 입니다.");
    }
}
