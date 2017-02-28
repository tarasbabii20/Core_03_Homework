package Core_01;

/**
 * Created by Taras on 28.02.2017.
 */
public class Suit {

    private String name;
    private int price;

    public Suit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
