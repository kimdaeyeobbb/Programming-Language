package vo;

public class Address {
    private String name;
    private String tel;
    private String addr;   // 변수 3개 지정

    /* 생성자 */
    public Address(String name, String tel, String addr) {
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }


    /* getter & setter */
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


    /* toString */
    @Override
    public String toString() {
        return "Address [" + "name='" + name + '\'' + ", tel='" + tel + '\'' + ", addr='" + addr + '\'' + ']';
    }
}
