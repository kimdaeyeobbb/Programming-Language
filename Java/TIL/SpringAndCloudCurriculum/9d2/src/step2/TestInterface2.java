package step2;

import step1.Bird;
import step1.Flyer;
import step1.SuperMan;

public class TestInterface2 {
    public static void main(String[] args) {
        FlyerService service = new FlyerService();

        service.enter(new Airplane());
        service.enter(new Bird());
        service.enter(new SuperMan());

        Flyer f[] = {new Airplane(), new Bird(), new SuperMan() };
        service.enter(f);

            @Override
            public void fly() {

            }
        }}
    }
}
