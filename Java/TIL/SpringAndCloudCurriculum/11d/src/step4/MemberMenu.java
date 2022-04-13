package step4;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
    // 메인에서 객체 생성

    private Scanner sc = new Scanner(System.in);
    private int menu;
    boolean flag = true;
    private String menuStr =  "1.추가  2.검색  3.수정  4.삭제  5.전체출력  6.데이터초기화  7.종료";


    public void menuProcess(ArrayList<Member> data){
        int idx= 0;
        while(flag){
            System.out.println(menuStr);
            menu = sc.nextInt();// 변수 지정해서 숫자 받음
            switch (menu){
                case 1:
                    data.add(infoInput());   // 호출하면서 할당
                    break;

                case 2:
                    idx = search(data);
                    printMember(data.get(idx));
                    break;

                case 3:
                    editMember(data);
                    break;

                case 4:
                    delMember(data);
                    break;

                case 5:
                    for (idx=0; idx<data.size(); idx++){
                        printMember(data.get(idx));
                    }
                    break;

                case 6:
                    data.removeAll(data);
                    break;

                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다");
            }
        }
    }

    /* 입력 - '수정'과의 차이점: 재할당하지 않음 */
    public Member infoInput(){
        // 여러개의 데이터를 입력받기 위해 nextline 사용
        System.out.println("이름: ");
        String name = sc.next();
        System.out.println();

        System.out.println("전화");
        String tel = sc.next();
        sc.nextLine();

        System.out.println("주소: ");
        String address = sc.nextLine();
        return new Member(name, tel, address);
    }

    /* 검색 */
    public int search(ArrayList<Member> data){   // 타입 지정해서 ArrayList 생성
        System.out.println("이름: ");
        String name = sc.next();
        for(int i=0; i<data.size(); i++){
            if(name.equals(data.get(i).getName())){   // 입력한 값과 같은 이름이 존재하는지 확인
                return i;
            }
        }
        return 0;
    }

    /* 수정 - 입력과의 차이점: 재할당을 함*/
    public void editMember(ArrayList<Member> data) {   // search와 동일한 방식으로 진행
        int idx = search(data);   // 검색된 내용을 가져옴

        /* 전화번호 수정 */
        System.out.println("전화: ");
        String tel = sc.next();   // 전화번호 입력
        sc.nextLine(); // 수정할 내용

        /* 주소 수정 */
        System.out.println("주소: ");
        String address = sc.nextLine();
        data.set(idx, new Member(data.get(idx).getName(), tel,address));
        // getname가져와서 tel,address 수정
    }

    /* 삭제 */
    public void delMember(ArrayList<Member> data) {   // 들어가는 값을 찾아야 하므로 매개변수 필요
        int idx = search(data);
        data.remove(idx);
    }

    /* 출력 */
    public void printMember(Member m) {
        System.out.println(m);
    }
}
