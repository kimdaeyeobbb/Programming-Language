package service;

import vo.Address;
import java.util.Scanner;

public class AddressService {
    private int index;
    private Address a[] = new Address[10];   // 숫자 안넣어주면 에러 발생

    public void addPerson(Address a){   // 자바는 객체배열 사용 -> 클래스 자체를 매개변수로 넘겨줌
        this.a[index] = a;
        index++;
    }  // 선언시킨 배열을 여기에 넣어줘야 함


    public void printAll() {
        for(int i=0; i<index; i++){
            System.out.println(a[i]);
        }


    }

 // 클래스타입 vs 특정한 자료형 중 뭘로 선택?
    public Address findPerson(String name) {
        // 클래스 리턴 타입과 일치해야함(Address) -> Address 타입의 변수를 만들고 비교해줘야 함
        Address per = null;

        for(int i=0; i<index; i++){
            // getName은 Address 클래스 가지고 있는 ~
            // get으로 가져온것과 매개변수를 비교할때 equals 사용
            if(a[i].getName().equals(name)){
                per = a[i];
            }
        }
        return null;
    }   // Address 클래스 -> string -> 0으로 표시하면 에러 발생

    public Address findUpdate(String name){
        // 입력 - 없는 값을 새로 가져옴 VS 수정 - 기존값을 재할당
        // 생성자 - 초기화 역할 VS set- 기존값을 재할당

        Address up = findPerson(name);     // findPerson 호출 , up에다가 할당
        System.out.println("전화번호 입력: ");
        Scanner sc = new Scanner(System.in);
        up.setTel(sc.next()); // Address 클래스가 만든 변수: up

        System.out.println("주소 입력: ");
        up.setAddr(sc.next());
        //findPerson();   // 수정전에 값을 찾아와야 함

        return up;
    }
}
