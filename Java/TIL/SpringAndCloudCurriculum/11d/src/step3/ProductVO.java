package step3;

public class ProductVO {
    private String name;
    private String maker;
    private int price;

    /* 생성자 */

    public ProductVO(String name, String maker, int price) {
        this.name = name;
        this.maker = maker;
        this.price = price;
    }



    /* Getter & Setter*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    /* toString */
    @Override
    public String toString() {
        return "ProductVO [" +
                "name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", price=" + price +
                ']';
    }
}
