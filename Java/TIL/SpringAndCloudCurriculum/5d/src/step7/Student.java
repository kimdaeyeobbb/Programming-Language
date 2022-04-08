package step7;

public class Student extends Person{
    private String stuId;

    /* 생성자 */
    public Student(String name, String tel, String address, String stuId) {
        super(name, tel, address);
        this.stuId = stuId;
    }

    /* get & set */

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getDetails(){
        return super.getDetails()+" 학번: "+stuId;
    }
}
