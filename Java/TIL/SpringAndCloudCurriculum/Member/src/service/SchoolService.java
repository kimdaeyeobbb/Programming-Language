package service;
import vo.MemberVO;

public class SchoolService {
    // 각각의 기능이 만들어진 클래스
    private int index;

    private MemberVO p[] = new MemberVO[10];

    public void addPerson(MemberVO p){
        this.p[index] = p;
        index++;
    }

    public void printAll(){
        for (int i=0; i<index; i++){
            System.out.println(p[i]);
        }
    }
}
