package test;

import service.SchoolService;
import vo.MemberVO;

import java.lang.reflect.Member;

public class TestMemberService {
    public static void main(String[] args){
        SchoolService service = new SchoolService();
        service.addPerson(new MemberVO("java","dd","dd","dd"));
        service.addPerson(new MemberVO("bbb","bbb","bbb","bbbb"));
        service.addPerson(new MemberVO("cccc","cccc","ccc","ccc"));
        service.addPerson(new MemberVO("ddd","dddd","dddd","dddd"));

        service.printAll();
    }
}
