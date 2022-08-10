// 서비스 구현할 때 다음과 같은 코드형식을 이용
package step9;

public class Professor extends Person{
// Person에서 protected 설정했으므로 생성자가 불필요
// step7의 person을 인식할 수 있으므로 유의

    private String[] subject;

    public void print_subj(){   // 보통 언더바는 띄워쓰기, 단어가 합쳐질 때 사용
        System.out.println(name+"교수의 개설과목: ");

        for (int i=0; i<subject.length; i++){
            System.out.println("subject: "+subject[i]);
        }
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }
}