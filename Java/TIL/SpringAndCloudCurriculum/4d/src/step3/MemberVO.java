// VO(Value Object) (=DTO)
package step3;

public class MemberVO {  // VO (Value Object) -> DTO라고 불림
    private String id;  // 전역변수 또는 인스턴스 변수 (객체의 다른표현 = 인스턴스)
    private String password;
    private String job;   // 선택사항으로 돌릴 예정

    public MemberVO(String id, String password) {
        // 매개변수는 지역변수에 포함됨

        this.id = id;   //
        this.password = password;
    }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
