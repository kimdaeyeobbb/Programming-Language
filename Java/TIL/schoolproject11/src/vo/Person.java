package vo;

public class Person {

    // 변수 : 전화번호(tel), (문자열) 이름(name) 주소(addr)
    //→ 문자열로 지정하는게 좋음

    // 생성자
    //set/get
    //toString()

    private String tel;
    private String name;
    private String address;

    public Person(String tel, String name, String address){
        super();
        this.tel = tel;
        this.name = name;
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //super -> 자식이 부모것을 가리킴
}
