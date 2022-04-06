// 이해완료 -> 단 객체배열에 대해서 익숙해질 필요가 있음

package step5;
import java.util.Scanner;

public class AddrMain {
    public static void main(String[] args){
        Addr[] addr = new Addr[10];
        // 클래스/배열에 대한 객체 생성
        // 비어있는 10개의 공간 생성
        // new 등장 -> 힙으로 간주
        // 객체배열(참조변수 배열) 생성 -> 객체를 담기 위한 것
        // Addr[]: 클래스명, addr: 변수명, new: , Addr[10]: Addr타입 참조변수 10개

        //String name,tel,address;
        int num, cnt = 0;   // 반복횟수 체크용
        int i = 0;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("메뉴");
        System.out.println("번호를 선택하세요");
        while(flag){
            System.out.println("1. 등록");
            System.out.println("2. 전체출력");
            System.out.println("3. 종료");

            num = sc.nextInt();

            switch(num){
                case 1:
                    addr[cnt] = new Addr();
                    // Addr 클래스의 주소값을 배열에 할당
                    // new Addr()를 통해 객체를 만든다음 -> 해당 주소값을 addr[cnt]에 넣는 것
                    System.out.println("등록할 정보를 입력하세요.");

                    System.out.println("이름: ");
                    addr[cnt].name = sc.next();

                    System.out.println("전화: ");
                    addr[cnt].tel = sc.next();

                    System.out.println("주소: ");
                    addr[cnt].address = sc.next();
                    cnt++;
                    break;
                case 2:
                    System.out.println("등록된 정보 전체를 출력합니다.");
                    for(i=0; i<cnt; i++) {
                        System.out.println(addr[i].name);
                        System.out.println(addr[i].tel);
                        System.out.println(addr[i].address);
                    }
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    flag = false;
                    break;
            }
        }
    }
}