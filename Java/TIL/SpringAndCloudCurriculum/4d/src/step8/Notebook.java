package step8;

public class Notebook {
    private String model;
    private String price;

    /* 생성자 - 객체를 새로 생성시에 사용 */
    public Notebook(String model, String price) {
        this.model = model;
        this.price = price;
    }


    /* get & set - 메서드. 객체의 멤버필드를 호출하거나 세팅시 사용 */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
