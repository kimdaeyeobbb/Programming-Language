package service;

import vo.MemberVO;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class MemberService {
    /* 상품 관리 비즈니스 로직을 담당하는 클래스 */
    private ArrayList<MemberVO>list = new ArrayList<MemberVO>();
    public void addMemberVO(MemberVO memberVO){
    boolean flag = false;
    for (int i=0; i<list.size(); i++){
        MemberVO Mem = list.get(i);
        if(memberVO.getId().equals(Mem.getId())){
            flag = true;
            break;
        }
        if (flag == false){
            list.add(memberVO);
        } else{
            System.out.println();
        }
    }
}


    public void printAll(){
        System.out.println(list);
    }

    public MemberVO findMemberVO(String id){
        MemberVO pro = null;
        for(int i=0; i<list.size(); i++){
            MemberVO pro1 = list.get(i);
            if(id.equals(pro1.getId())){
                pro = pro1;
            }
        }
        return pro;
    }


    public void deleteMemberVO(String id){
        for (int i=0; i<list.size(); i++){
            MemberVO pro1 = list.get(i);
            if(id.equals(pro1.getId())){
                list.remove(i);    // i 삭제
            }
        }
    }

    /* 수정 - 입력과 엮어서 떠올릴것*/
    public boolean updateMemberVO(MemberVO memberVO){
        boolean flag = false;
        for (int i=0; i<list.size(); i++){
            MemberVO Mem = list.get(i);
            if (Mem.getId().equals(memberVO.getId())){
                list.set(i, memberVO);
                flag = true;
            }
            break;
        }
        return flag;
    }
}