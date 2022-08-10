package step4;

public class TestStatic6 {
    public static void main(String[] args){
        System.out.println("main 수행");
    }

    // 프로그램 실행 전 사전 작업이 필요할 때
    static {  // static - 공유 목적으로 사용
        System.out.println("static 초기화 블럭");
    }   // 대표적인 드라이버 같은 것에 설치
}
