package step1;

import java.util.ArrayList; // JDK에 포함된 것 중 util 패키지에 포함된것 불러옴
import java.util.Scanner;   // JDK에 포함된 것 중 util 패키지에 포함된것 불러옴

public class ArrayListTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        al.add("aaa");   // add메서드 - 데이터 추가
        al.add("bbb");
        al.add(1,"ccc");
        al.add(2,"fff");
        al.set(2,"fff");   // set메서드 - 값 수정
        System.out.println(al);

        for (int i=0; i<al.size(); i++){
            System.out.println(i+"번째 요소: "+ al.get(i));
        }
        // 정해진 API임 (JDK에 포함된 것)

        /* 검색 기능 */
        System.out.println("검색할 값을 입력하세요: ");
        String srh = sc.next();    // 검색할 값 입력
        int idx = 0;

        if(al.contains(srh)){
            idx = al.indexOf(srh);    // indexOf - 데이터 위치 찾는 도구
            System.out.println(idx+"번째 인덱스 위치에서 "+al.get(idx)+" 검색");
            System.out.println("검색할 값이 포함되어 있습니다.");
        } else {
            System.out.println("검색할 값이 포함되어 있지 않습니다.");
        }

        System.out.println();

        /* 삭제 기능 */
        System.out.println("삭제할 값을 입력하세요: ");
        srh = sc.next();    // 삭제할 값 입력
        idx = 0;

        if(al.contains(srh)){
            idx = al.indexOf(srh);    // indexOf - 데이터 위치 찾는 도구
            System.out.println(idx+"번째 인덱스 위치에서 "+al.get(idx)+" 검색");
            System.out.println("삭제할 값이 포함되어 있습니다.");
            al.remove(idx);
            System.out.println("해당 값을 삭제하였습니다.");
        } else {
            System.out.println("삭제할 값이 포함되어 있지 않습니다.");
        }
        System.out.println(al);
        System.out.println();

        /* 전체 삭제 기능 */
        System.out.println("전체 삭제");
        al.removeAll(al);   // removeAll - 리스트 내 모든 요소 삭제

        if (al.isEmpty()){
            System.out.println("리스트 내 모든 요소가 삭제되었습니다.");
        } else {
            System.out.println("리스트 내 모든 요소가 삭제 되지 않았습니다.");
            for (int i=0; i<al.size(); i++){
                System.out.println(i+"번째 요소가 남아있습니다. 남아있는 요소: " + al.get(i));
            }
        }
    }
}