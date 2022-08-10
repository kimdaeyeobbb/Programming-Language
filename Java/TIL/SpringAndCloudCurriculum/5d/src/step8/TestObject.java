package step8;

class Company{
    private String name;
    private String address;

    public Company(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {   // toString 사용시 문자열로 바뀌어서 출력됨
        return "회사명 [" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}



public class TestObject {
    public static void main(String[] args){
        Company c1 = new Company("안렙","판교");
        System.out.println(c1.toString());
        System.out.println(c1);
    }
}
