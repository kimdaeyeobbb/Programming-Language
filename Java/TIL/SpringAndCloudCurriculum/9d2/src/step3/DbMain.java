package step3;

public class DbMain {
    public static void main(String[] args){
        Process p1 = new Process(new OracleImpl());    // 객체 생성
        p1.connect();
        p1.select();
        p1.insert();
        p1.update();
        p1.delete();   // 메서드 호출


        Process p2 = new Process(new MsImpl());    // 객체 생성
        p2.connect();
        p2.select();
        p2.insert();
        p2.update();
        p2.delete();   // 메서드 호출
    }
}

