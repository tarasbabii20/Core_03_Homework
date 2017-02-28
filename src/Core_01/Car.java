package Core_01;

/**
 * Created by Taras on 28.02.2017.
 */
public class Car {

    private String brend;
    private int price;

    public Car(String brend, int price) {
        this.brend = brend;
        this.price = price;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
