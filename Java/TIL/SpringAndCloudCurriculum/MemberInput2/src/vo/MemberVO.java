package vo;

public class MemberVO {
    private String id;
    private String name;
    private String tel;
    private String addr;

    /* 생성자 */

    public MemberVO() {
        super();
    }

    public MemberVO(String id, String name, String tel, String add) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.addr = add;
    }


    /* Getter & Setter */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public void setAdd(String addr) {
        this.addr = addr;
    }


    /* toString */

    @Override
    public String toString() {
        return "MemberVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
