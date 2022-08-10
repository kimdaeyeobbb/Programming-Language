package step3;

import java.util.ArrayList;

public class TestArrayList3 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new ProductVO("IPhone","Apple" , 200));   // list 객체에 데이터 추가
        list.add(new ProductVO("Galaxy", "SAMSUNG", 300));
        list.add(new ProductVO("Xiaomi","Xiaomi", 100));

        /* 지정한 제품명 출력 */
        System.out.println("********** 리스트 중 삼성에서 생산한 제품명 출력 **********");

        for (int i=0; i<list.size(); i++){
            ProductVO pro = (ProductVO)list.get(i);
            if(pro.getMaker().equals("SAMSUNG")){
                System.out.println(pro.getName());
            }
        }

        System.out.println();

        /* 평균 가격 산출 */
        System.out.println("********** 리스트 전체 상품의 평균가격 **********");
        int sum = 0;
        for (int i=0; i<list.size(); i++){
            ProductVO vo = (ProductVO) list.get(i);    // Downcasting
            sum = vo.getPrice();
        }

        System.out.println(sum/list.size()+"만원");

        System.out.println();

        /* 지정한 인덱스에 새로운 객체 생성 */
        System.out.println("********** 지정한 인덱스에 새로운 객체 재할당 **********");
        list.set(0,new ProductVO("Optimus","LG",150));    // 위치값, 새로운 객체 지정
        System.out.println(list);

        /* 특정 조건 만족시키는 임의의 요소 찾기 */
        System.out.println();
        System.out.println("********** 리스트 상품명 중 I로 시작하는 상품정보 **********");

        for (int i=0; i<list.size(); i++){
            ProductVO vo = (ProductVO)list.get(i);
            if(vo.getName().startsWith("I")){
                System.out.println(vo);
            }
        }
    }
}