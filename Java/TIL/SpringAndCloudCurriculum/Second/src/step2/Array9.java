//아직 해결 못함

package step2;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] namelist = new String[3];   // 3명의 이름
        String[] classlist = {"국어","영어","수학","총점"};
        int[][] scorelist = new int[3][3];   // 3명에 대한 국,영,수,총점

        /* 정보 입력 */
        System.out.println("이름 입력 : ");

        for (int i=0; i<namelist.length; i++){
            namelist[i] = sc.next();
        }

        for (int i=0; i<scorelist.length; i++){
            scorelist[i][3] = 0;   // 총점 0으로 초기화

            System.out.println(i+"번째 행의 점수를 입력 : ");
            for (int j=0; j<scorelist[i].length-1; j++){  // 총점은 앞에서 이미 입력했음
                scorelist[i][j] = sc.nextInt();
                scorelist[i][3] += scorelist[i][j];
            }
            System.out.println();
        }

        /* 정보 출력 */
        for (int i=0; i<namelist.length; i++){
            System.out.printf(namelist[i]+"\t");
        }

        for (int i=0; i<classlist.length; i++){
            System.out.printf(classlist[i]+"\t");
        }

        for (int i=0; i<scorelist.length; i++){
            for (int j=0; j<scorelist[i].length; j++){
                System.out.printf(scorelist[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
