package step2;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args){
        Random random = new Random();   // 랜덤 객체 생성
        int i = random.nextInt(3);   // 0~2
        //System.out.println(i);

        for (int j=0; j<10; j++){
            i = random.nextInt(3);  // 0~2 사이의 숫자 랜덤 생성
            System.out.println(i);
        }
    }
}
