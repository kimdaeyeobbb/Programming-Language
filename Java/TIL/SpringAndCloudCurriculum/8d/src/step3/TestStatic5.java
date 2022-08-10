package step3;
class Car{
    static int scount;
    int count;

    Car(){
        System.out.println("Car 생성");
        count++;
        scount++;
    }
}
public class TestStatic5 {
    public  static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1.count);

        Car c2 = new Car();
        System.out.println(c2.count);

        Car c3 = new Car();
        System.out.println(c3.count);
        // 생성할 때마다 따로 들어감


        // static은 객체 호출하더라도 살아있으므로 계속 같이감
        System.out.println(Car.scount);


    }
}