package step3;

public interface DbInterface {

    void connect();   // 커넥션 객체. DB에 접근근
    void select();
    void insert();
    void update();
    void delete();
}
