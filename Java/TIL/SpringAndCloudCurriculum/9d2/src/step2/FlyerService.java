package step2;

import step1.Flyer;

public class FlyerService {
    public void enter(Flyer f){   // 매개변수를 부모형태로 받음
        f.fly();   // 넘어오는 모든 객체를 다 fly() 시킴
    }

    // 메서드 오버로딩에 이해서 매개변수로 메
    public void enter(Flyer[] f){
        for(int i=0; i< f.length; i++){
            f[i].fly();
        }
    }
}

