package step5;

public class Person {
    private String name;
    public void setName(String name) throws NameException{   // 뭐가 발생했을시 NameException이 체크하곘다는 것
        if(name.length()<2 || name.length() > 5){
            throw new NameException("이름은 2자 이상 5자 이하만 가능");
        } else {
            this.name = name;
        }
    }
}
