// 클래스 연습7 - next VS nextLine 차이점 파악 완료
package step2;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args){
        // main에서 객체 생성 및 실행을 담당
        Scanner sc = new Scanner(System.in);  // main에서 스캐너 지정을 해줘야 함
        Product p = new Product();
        p.input(sc);   // 이해완료 -> Product클래스의 input메서드내 매개변수 넣어주기 위한 것
        p.print();
    }
}
