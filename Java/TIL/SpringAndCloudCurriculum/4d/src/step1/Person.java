package step1;

public class Person {
    private String name;
    // 전역변수 또는 인스턴스 변수 (객체가 있을 때 사용가능)

    private int money;
    // private이 붙은 변수는 블럭내에서 못벗어나지만
    // public 메서드를 통해 값을 할당할 수 있다

    /* set 메서드 -  값을 세팅 */
    public void setName(String name) {
        // 매개변수는 간접할당이원칙 (간접적으로 값을 가져옴)
        this.name = name;   // this가 붙은 것은 전역변수
    }

   public void setMoney(int money) {
        this.money = money;
        // this.money: 전역변수
       // money: 지역변수
    }

    /* get 메서드 - 값을 반환 */
    /* get 메서드를 통해 값을 출력 */
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }

}