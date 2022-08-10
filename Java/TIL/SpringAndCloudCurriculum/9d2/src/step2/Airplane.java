package step2;

import step1.Flyer;

public class Airplane implements Flyer{

    @Override
    public void fly(){
        System.out.println("비행기가 날다");
    }
}
