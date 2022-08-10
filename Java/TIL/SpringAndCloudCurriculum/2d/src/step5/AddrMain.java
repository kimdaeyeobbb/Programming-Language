package step5;

import java.util.Scanner;

public class AddrMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = null, tel = null, addr=null;
        int i=0,j,c;
        boolean flag = true, flag1= true;
        Addr[] a = new Addr[10];


        while(flag){
            System.out.println("1.등록");
            System.out.println("2.검색");
            System.out.println("3.전체출력");
            System.out.println("4.수정");
            System.out.println("5.삭제");
            System.out.println("6.종료");

            c = sc.nextInt();

            switch(c){
                /* 등록 */
                case 1:
                    a[i] = new Addr();
                    System.out.println("이름 : ");
                    a[i].name = sc.next();

                    System.out.println("전화: ");
                    a[i].tel = sc.next();

                    System.out.println("주소: ");
                    a[i].addr = sc.next();
                    i++;
                    break;

                    /* 검색*/
                case 2:
                    System.out.println("검색할 이름 입력 : ");
                    name = sc.next();
                    flag1 = false;
                    for (j=0; j<i; j++){
                        flag1 = a[j].search(name);
                        if(flag1){
                            a[j].print();
                            break;
                        }
                    }
                    if (!flag1){
                        System.out.println("없다.");
                    }
                    break;

                    /* 전체출력 */
                case 3:
                    for(j=0; j<i; j++){
                        a[j].print();
                    }
                    break;

                    /* 수정 */
                case 4:
                    break;

                    /* 삭제 */
                case 5:
                    break;

                    /* 종료 */
                case 6:
                    break;
            }
        }
    }
}