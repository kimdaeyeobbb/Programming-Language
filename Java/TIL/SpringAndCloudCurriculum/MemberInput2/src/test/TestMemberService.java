package test;

import service.MemberService;
import vo.MemberVO;

import java.util.Scanner;

public class TestMemberService {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id,name,tel,addr;
        boolean flag = true;
        int i=0;
        MemberService service = new MemberService();

        while(flag){
            System.out.println("1.등록   2.검색   3.수정   4. 삭제   5.전체출력   6.종료");
            i = sc.nextInt();
            switch(i){
                case 1:
                    System.out.println("아이디를 입력: ");
                    id = sc.next();
                    System.out.println("이름을 입력: ");
                    name = sc.next();
                    System.out.println("전화번호 입력: ");
                    tel = sc.next();
                    System.out.println("주소 입력");
                    addr = sc.next();
                    service.addMemberVO(new MemberVO(id,name,tel,addr));
                    break;

                case 2:
                    System.out.println("아이디 입력: ");
                    id = sc.next();
                    MemberVO m = service.findMemberVO(id);
                    System.out.println(m);
                    break;

                case 3:
                    System.out.println("수정할 ID 입력: ");
                    id = sc.next();
                    System.out.println("수정할 이믈 입력: ");
                    name = sc.next();
                    System.out.println("수정할 전화번호 입력: ");
                    tel = sc.next();
                    System.out.println("수정할 주소 입력");
                    addr = sc.next();
                    MemberVO m2 = new MemberVO(id,name,tel,addr);

                    break;

                case 4:
                    System.out.println("삭제할 ID 입력: ");
                    id = sc.next();
                    service.deleteMemberVO(id);
                    break;

                case 5:
                    service.printAll();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("올바른 값을 제대로 다시 입력 해주시기 바랍니다.");
            }
        }
    }
}
