package step4;

public class OperEx {
    private int count;
    // 전역변수이자 인스턴스변수 -> 정수이므로 기본값이 0임
    // 지역변수는 초기화 작업을 진행해주어야 함

    public boolean test1(){
        ++count;

        return true;
    }

    public boolean test2(){
        ++count;
        return false;
    }

    public int getCount(){
        return count;
    }
}
