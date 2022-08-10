package step3;

import jdk.swing.interop.SwingInterOpUtils;

public class MsImpl implements DbInterface{

    @Override
    public void connect() {
        System.out.println("Ms-SQL 데이터 베이스 시스템에 연결합니다.");
    }

    @Override
    public void select() {
        System.out.println(("Ms-SQL 데이터 베이스 시스템에 데이터 검색 연결합니다."));
    }

    @Override
    public void insert() {
        System.out.println("Ms-SQL 데이터 베이스 시스템에 ~");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {


}
