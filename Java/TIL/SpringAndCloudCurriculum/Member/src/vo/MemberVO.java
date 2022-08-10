package vo;

// 공통사항 지정 - 상속 사용

// 다마고치 : 피카츄, 꼬부기, 파이리

public class MemberVO {
    private String id;
    private String name;
    private String tel;
    private String add;

    public MemberVO(String id, String name, String tel, String add) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.add = add;
    }


    /* get&set */
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }


    @Override
    public String toString() {
        // 객체가 가지고 있는 무조건 문자열로 리턴
        // 객체가 가지고 있는 정보나 값들을 문자열로 만들어서 리턴
        return "MemberVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
