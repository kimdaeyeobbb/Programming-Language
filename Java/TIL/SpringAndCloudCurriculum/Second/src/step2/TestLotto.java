// 아직 해결 못함

package step2;

import java.util.Random;

public class TestLotto {
    public static void main(String[] args){
        int[] lottolist = new int[6];   // 로또 번호 담을 배열
        Random random = new Random();   // 랜덤 객체 생성
        int pickednum = 0; // 로또 번호 초기화

        /* 로또 번호 생성 */
        for (int i=0; i<lottolist.length; i++){
            pickednum = random.nextInt(45)+1;   // 1~45

            /* 중복 확인 */
            for (int j=0; j<i; j++){
                /* 중복 제거 */
                if (pickednum == lottolist[i]){
                    pickednum = random.nextInt(45)+1;   // 1~45
                    break;
                }
            }
            /* 알고리즘 구성
            * 중복 여부 확인
            * 새로 뽑은 번호가 기존위치에 존재할 경우우            * */

            /* 로또 번호 저장 */
            lottolist[i] = pickednum;
        }

        /* 로또 번호 출력 */
        System.out.printf("로또 번호: ");
        for (int i=0; i<lottolist.length; i++){
            System.out.printf(lottolist[i]+" ");
        }
    }
}