package step3;

public class Process {   // 상속을 받는다기보다는 다음과 같은 형식으로 지정해주자

    private DbInterface db;     // DbInterface라는 클래스가 db라는 변수 db 생성

    /* 생성자 */
    public Process(DbInterface db){
        super();
        this.db= db;
    }

    void connect() {
        db.connect();
    }

    // 캐스팅 개념이 중요
    // 2가지 클래스가 존재하지만,~
    // 웹에서는 캐스팅 개념이 상당히 많이 쓰인다

    void select(){
        db.select();
    }

    void insert(){
        db.insert();
    }

    void update(){
        db.update();
    }

    void delete(){
        db.delete();
    }

    // 이러한 방식이 많이 활용되므로 기억해둘것!!!
    // 메인은 똑같이 프로세스만 불러서 해주면 됨 (?????)
}