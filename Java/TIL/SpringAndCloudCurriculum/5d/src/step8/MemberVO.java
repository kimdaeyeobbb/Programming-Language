package step8;

public class MemberVO {

    private String id;
    private String password;
    private String name;
    private String address;


    /* 생성자 */
    public MemberVO(String id, String password, String name, String address) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
    }



    /* get & set */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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



    /* toString */

    @Override   // 현재 클래스에 맞게 변화되었다는 뜻
    public String toString() {   // 문자열로 바꿔서 override할때 사용
        return "MemberVO {" + "id='" + id + '\'' + ", password='" + password + '\'' + ", name='" + name + '\'' +
                ", address='" + address + '\'' + '}';
    }
    // 부모는 주소값을 호출되고, 자식은 실제 입력한 값이 호출됨

}