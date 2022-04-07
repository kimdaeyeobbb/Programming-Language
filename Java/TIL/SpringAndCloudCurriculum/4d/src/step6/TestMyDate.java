package step6;

public class TestMyDate {
    public static void main(String[] args){
        MyDate d1 = new MyDate();  // 디폴트 생성자. 아무 값도 없음.
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());

        MyDate d2 = new MyDate(1,2,2000);   // 매개변수 넣어줘야 함
        System.out.println(d2.getDay());
        System.out.println(d2.getMonth());
        System.out.println(d2.getYear());
    }
}
