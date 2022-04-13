package step1;

import java.util.ArrayList;   // jdk에 포함된 패키지 중 하나를 불러옴 -> 데이터가 포함되어 나오게 만듦

public class TestList1 {
    public static void main(String[] args){
        /* ArrayList */
        // 컬렉션 프레임워크 - 표준으로 정의되어 있음
        ArrayList list = new ArrayList(); // 객체 생성. 상위 클래스를 집어넣는 개념
        list.add("아이유");   // add메서드 - 데이터 추가
        list.add("보아");
        list.add("에스파");

        System.out.println(list.size());   // 데이터 개수
        System.out.println(list);   // toString 오버라이딩. 주소값이 안나오고 문자열로 리턴
        System.out.println(list.get(0));   // 0번째 인덱스

        list.add(new Integer(1));
        // wrapper 클래스 -> 주방의 랩떠올리기. 자료를 보호하기 위한 작업
        // add: 데이터 추가.
        // 공간이 큰곳 -> 작은곳으로 이동시 데이터 손실 발생
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
