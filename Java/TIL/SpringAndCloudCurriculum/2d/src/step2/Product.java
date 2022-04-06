// 클래스 연습7 - next VS nextLine 차이점 파악 완료
package step2;

import java.util.Scanner;

public class Product {
    // 보안상 접근지정자를 활용해야한다. (외부접근 차단)
    // main에서는 변수를 공개하지 않는다.
    String name;
    int Co,price;

    /* 메서드 생성 - 기능 담당 */
    void input(Scanner sc){
        // 입력
        // 접근지정자 - public
        // Scanner를 통해 매개변수 할당. call by value. 매개변수를 이용한 간접접근
        // 메서드를 통해 값을 할당받게끔 만듦
        System.out.println("제품명을 입력하세요: ");
        name = sc.nextLine();

        System.out.println("제품번호를 입력하세요: ");
        Co = sc.nextInt();

        System.out.println("제품가격을 입력하세요: ");
        price = sc.nextInt();
    }

    void print(){
        System.out.println(name);
        System.out.println(Co);
        System.out.println(price);
    }
}
