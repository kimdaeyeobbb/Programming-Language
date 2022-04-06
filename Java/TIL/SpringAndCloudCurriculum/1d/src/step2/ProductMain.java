package step2;

public class ProductMain {
    public static void main(String[] args){
        Product p = new Product();   // 클래스에 대한 객체 생성
        p.name = "라면";
        p.Co = 10101;
        p.price = 10000;

        System.out.println(p.name);
        System.out.println(p.Co);
        System.out.println(p.price);
    }
}
