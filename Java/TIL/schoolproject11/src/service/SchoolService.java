package service;

import vo.Person;

public class SchoolService {
    private int index;
    private Person p[] = new Person[10];

    public void addPerson(Person p){
        this.p[index] = p;
        index++;
    }

    public void printAll(){
        for(int i=0; i<index; i++){
            System.out.println(p[i]);
        }

    }


    public Person findPerson(String tel){
        // 메서드 - 스택에 포함
        Person per = null;   // 지역변수 ->

        /* 일치하는 값이 있는지 확인 */
        for (int i=0; i<index; i++){
            if(p[i].getTel().equals(tel)){
                per = p[i];
            }
        }

        return per;   // 받아온값을 per로 return
    }
    // 검색했을 때 통합적인 검색은 person하나만 불러오면 됨

    // equals : 문자값,객체값,주소값 등 비교
}
