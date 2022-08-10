// 미완성 - 완성 후 다시 커밋 요망
package step2;

import java.util.ArrayList;

public class TestList2 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new FriendVO("츄",22));
        list.add(new FriendVO("효정", 23));
        list.add(new FriendVO("윈터", 21));
        list.add(new FriendVO("우정잉",29));
        list.add(new FriendVO("진자림", 20));
        list.add(new FriendVO("카리나", 23));
        list.add(new FriendVO("권나라", 31));
        list.add(new FriendVO("유인영", 38));

        System.out.println(list.size());
        /* list의 toString()은 오버라이딩 되어있지만 FriendVO의 실제 내용을 보기 위해서는
        * FriendVO의 toString() 또한 오버라이딩 되어야 함*/

        System.out.println(list);   // 직접 FriendVO값에 접근하기 위해서는 따로 casting 해주어야 함

        /* 각각 객체의 주소값이므로 FriendVO에 toString()을 오버라이딩 해준다.
        * 0번째 인덱스의 이름만 출력
        * list.get()은 Object형으로 반환하므로 FriendVO의 getName()을 호출하기 위해서는
        * Object casting이 필요하다.
        * Object o1 = list.get(0); */
        FriendVO vo1 = (FriendVO)list.get(0);
        System.out.println(vo1.getName());

        /* 5번째 인덱스 요소의 나이이 출력 */
        FriendVO vo2 = (FriendVO)list.get(5);
        System.out.println(vo2.getAge());

        System.out.println();

        /* 전체 내용 출력 */
        System.out.println("전체 출력");
        System.out.println("=======================================");

        for (int i=0; i<list.size(); i++){
            FriendVO vo3 = (FriendVO)list.get(i);   // casting도 같이 수행
        }

        System.out.println("리스트 요소 중 24세 이상인 사람의 이름만 출력");

        for (int i=0; i<list.size(); i++){
            FriendVO vo3 = (FriendVO)list.get(i);
            if (24 <= vo3.getAge()){
                System.out.println(vo3.getName());
            }
        }
    }
}
// ArrayList는 서비스에 집어넣음
//