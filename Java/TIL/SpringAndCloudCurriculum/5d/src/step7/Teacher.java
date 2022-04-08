package step7;

public class Teacher extends Person{
    private String subject;

    /* 생성자 */
    public Teacher(String name, String tel, String address, String subject) {
        super(name, tel, address);
        this.subject = subject;
    }

    /* getter&setter */
    public String getSubject(){
        return subject;
    } // getter: 은닉된 멤버변수의 값을 읽어오는 방법

    public void setSubject(String subject){
        this.subject = subject;
    } // setter: 은닉된 멤버변수에 값을 넣는 방법


    public String getDetails(){
        return super.getDetails()+" 과목: "+subject;
    }
}
