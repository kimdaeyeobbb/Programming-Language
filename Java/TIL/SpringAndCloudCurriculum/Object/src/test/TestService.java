package test;

import service.AddressService;
import vo.Address;

import java.util.Scanner;

public class TestService {
    public static void main(String[] args){
        // 서비스에 대한 객체 지정을 해줘야 함
        // Address 클래스에 대한 객체를 생성해야 함
        Scanner sc = new Scanner(System.in);    // 입력받기 위함

        /* 3개 변수를 받은 이유? */
        String name = null;
        String tel = null;
        String addr = null;

        boolean flag = true;

        int i = 0;
        AddressService a = new AddressService();    // 객체 생성

        while(flag){

            System.out.println("1.등록  2.검색  3.전체출력  4.수정  5.종료");
            // 문자열임

            i = sc.nextInt();

            switch(i){
                /* 전체 입력 */
                case 1:
                    System.out.println("이름을 입력 하라: ");
                    name = sc.next();

                    System.out.println("전화를 입력 하라: ");
                    tel = sc.next();

                    System.out.println("주소를 입력하라: ");
                    addr = sc.next();

                    a.addPerson(new Address(name, tel , addr));   // 객체 불러와서 매개변수 삽입
                    break;


                /* 검색 */
                case 2:
                    System.out.println("이름을 입력 하라: ");
                    name = sc.next();
                    Address m = a.findPerson(name);
                    System.out.println(name);
                    break;

                /* 전체 출력 */
                case 3:
                    a.printAll();
                    break;

                /* 수정 및 업데이트 */
                case 4:
                    System.out.println("이름을 입력 하라: ");
                    name = sc.next();
                    a.findUpdate(name);
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }

}
