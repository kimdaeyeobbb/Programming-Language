package step7;

public class Person {
    /* 학생,교수,교직원의 공통사항 기입 - 이름, 전화, 주소 */
    private String name;
    private String tel;
    private String address;

    /* 생성자 */
    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    /* get & set */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /* getDetails */
    public String getDetails(){
        return  "이름: " +name+  " 전화번호: " +tel+ " 주소: "+address;
    }
}