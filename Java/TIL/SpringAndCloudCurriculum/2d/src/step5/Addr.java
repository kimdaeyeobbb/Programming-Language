package step5;

public class Addr {
    String name,tel,addr;

    boolean search(String name){ // 이름으로 검색하므로 매개변수가 String name임.
        if (this.name.equals(name)){
            // equals 정말 많이 사용함
            // this -> 전역변수&매개변수 구분 / 객체가 생성되자마자 주소를 가져올 때 사용. 의무사항 아님
            return true;
        } else {
            return false;
        }
    }

    void print(){
        System.out.println(name);
        System.out.println(tel);
        System.out.println(addr);
    }

    boolean edit(String name, String tel, String addr){
        boolean f;
        f=search(name);

        if(f==true){
            this.tel = tel;
            this.addr = addr;
        }

        return f;
    }


}