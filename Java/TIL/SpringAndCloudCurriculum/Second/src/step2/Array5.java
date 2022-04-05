package step2;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,max;
        int[] arr = new int[10];
        System.out.println("정수를 입력하시오 : ");

        for (i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
}
