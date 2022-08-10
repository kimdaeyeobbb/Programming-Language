package step9;

public class Student extends Person{
// Person에서 protected 설정했으므로 생성자가 불필요
// step7의 person을 인식할 수 있으므로 유의

        private String[] subjects;

        public void print_subj(){
            System.out.println(name+"교수의 개설과목: ");

            for (int i=0; i<subjects.length; i++){
                System.out.println("subject: "+subjects[i]);
            }
        }

        public String[] getSubjects() {
            return subjects;
        }

        public void setSubject(String[] subjects) {
            this.subjects = subjects;
        }
}