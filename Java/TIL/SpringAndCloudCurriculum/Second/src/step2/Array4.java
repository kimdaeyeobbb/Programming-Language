package step2;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   // 입력
        int[] intArr = new int[] {1,2,3,4,5};   // 배열 선언&초기화

        System.out.println("초기화된 값 출력");

        for (int i=0; i<intArr.length; i++){
            System.out.print(intArr[i]+"\t");
        }

        System.out.println();

        // 사용자로부터 입력 받은 데이터 배열에 저장
        /* 배열에 값 할당 */
        System.out.printf("숫자 5개 입력 : ");
        for(int i=0; i<intArr.length; i++){
            intArr[i] = sc.nextInt();
        }

        // 배열에 저장된 값을 출력
        System.out.println("배열에 저장된 값 출력");

        for (int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]);
        }
    }
}
