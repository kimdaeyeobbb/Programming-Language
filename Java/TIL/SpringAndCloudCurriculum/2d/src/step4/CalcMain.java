package step4;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x; int y; int i=0;
        boolean flag = true;   // 반복문 진행 판단 변수

        Calc calc = new Calc();   // 객체 생성

        while(flag){
            System.out.println("1. 더하기 ");
            System.out.println("2. 빼기 ");
            System.out.println("3. 곱하기 ");
            System.out.println("4. 나누기 ");
            System.out.println("5. 종료");

            i = sc.nextInt();

            switch(i){
                case 1:
                    System.out.println("더하기 할 숫자 두개 입력: ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(x+"+"+y+"="+calc.add(x,y));
                    break;

                case 2:
                    System.out.println("빼기 할 숫자 두개 입력: ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(x+"-"+y+"="+calc.sub(x,y));
                    break;

                case 3:
                    System.out.println("곱하기 할 숫자 두개 입력: ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(x+"*"+y+"="+calc.mul(x,y));
                    break;

                case 4:
                    System.out.println("나누기 할 숫자 두개 입력: ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(x+"/"+y+"="+calc.div(x,y));
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
