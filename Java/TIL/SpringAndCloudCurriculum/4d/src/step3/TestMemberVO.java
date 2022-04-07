package step3;

public class TestMemberVO {
    public static void main(String[] args){
        // 영역 지정후 ctrl+shift+/ 하면 주석처리
        // 영역 지정후 ctrl+shift+\ 하면 주석해제

        MemberVO vo = new MemberVO("java","abcd");  // 생성자 2개 만든것 떠올리기
        vo.setJob("aaa");   // 값 할당
        System.out.println(vo.getId()+" "+vo.getPassword()+" "+vo.getJob());

    }
}
