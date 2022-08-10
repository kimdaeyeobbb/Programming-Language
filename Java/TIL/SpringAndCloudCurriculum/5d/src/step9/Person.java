// 서비스 구현할 때 다음과 같은 형식을 이용
package step9;

public class Person {
    // 접근 지정자 protected 사용 - 상속에서 public 처럼 접근하기를 원하는 것
    protected int num;
    protected String name;
    protected String dept;
    protected String address;

    public void print(){
        System.out.println(num);
        System.out.println(name);
        System.out.println(dept);
        System.out.println(address);
    }

    /* get & set */

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
// 3개의 클래스를 만들기 - Professor    Staff    Student