package step2;

public class ss {
    private String name;
    private String tel;
    public String getName(){
        return  name;
    }

    // 외부에서 값(String name)을 받아와서
    public void setName(String name){
        this.name = name;
        // 메인에 값을 할당함

    }

    public String getTel(){
        return tel;
    }

}
