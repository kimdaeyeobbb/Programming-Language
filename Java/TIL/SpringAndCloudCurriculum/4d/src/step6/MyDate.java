package step6;

public class MyDate {

    private int day = 3;
    private int month = 3;
    private int year = 1999;

    /* 오버로딩 */
    // 같은 이름의 메서드(생성자)를 여러개 만드는 것
    // 매개변수의 개수 또는 데이터 타입에 따라서 구분시켜줌
    // 생성자는 return type이 없다. (데이터 타입이 없다.)
    // 따라서 생성자에서 오버로딩을 가장 많이 사용한다.


    /* 생성자1 (생성자2와 동일) */
    // 생성자는 초기화해주는 작업임
    public MyDate(){
        super();
        // 자식클래스의 this가 자기안에 포함된 부모클래스의 객체 this를 호출
        // 이를 통해 부모 클래스의 생성자를 작동시킴
        System.out.println("디폴트 생성자입니다.");
    }

    /* 생성자2 (생성자1과 동일) */
    public MyDate(int day, int month, int year) {
        super();
        System.out.println("매개변수를 포함한 생성자입니다.");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
