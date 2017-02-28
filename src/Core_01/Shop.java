package Core_01;

/**
 * Created by Taras on 28.02.2017.
 */
public class Shop {

    private Suit suit1 = new Suit("повсякденний костюм", 10000);
    private Suit suit2 = new Suit("смокінг", 30000);
    private Suit suit3 = new Suit("елітний костюм", 66000);

    private Jewelry jewelry1 = new Jewelry("cрібні сережки", 14000);
    private Jewelry jewelry2 = new Jewelry("золотий браслет", 40000);
    private Jewelry jewelry3 = new Jewelry("діамантове кольє", 110000);

    private Car car1 = new Car("Lada", 25000);
    private Car car2 = new Car("Toyota", 71000);
    private Car car3 = new Car("Mercedes", 180000);

    public String buySuit(){
        if(Life.budget > suit1.getPrice() && Life.budget < suit2.getPrice()){
            Life.budget = Life.budget - suit1.getPrice();
            return suit1.getName();
        }
        else if(Life.budget > suit2.getPrice() && Life.budget < suit3.getPrice()){
            Life.budget = Life.budget - suit2.getPrice();
            return suit2.getName();
        }
        else if(Life.budget > suit3.getPrice()){
            Life.budget = Life.budget - suit3.getPrice();
            return suit3.getName();
        }
        else{
            return "game over";
        }
    }

    public String buyJewelry(){
        if(Life.budget > jewelry1.getPrice() && Life.budget < jewelry2.getPrice()){
            Life.budget = Life.budget - jewelry1.getPrice();
            return jewelry1.getName();
        }
        else if(Life.budget > jewelry2.getPrice() && Life.budget < jewelry3.getPrice()){
            Life.budget = Life.budget - jewelry2.getPrice();
            return jewelry2.getName();
        }
        else if(Life.budget > jewelry3.getPrice()){
            Life.budget = Life.budget - jewelry3.getPrice();
            return jewelry3.getName();
        }
        else{
            return "game over";
        }
    }

    public String buyCar(){
        if(Life.budget > car1.getPrice() && Life.budget < car2.getPrice()){
            Life.budget = Life.budget - car1.getPrice();
            return car1.getBrend();
        }
        else if(Life.budget > car2.getPrice() && Life.budget < car3.getPrice()){
            Life.budget = Life.budget - car2.getPrice();
            return car2.getBrend();
        }
        else if(Life.budget > car3.getPrice()){
            Life.budget = Life.budget - car3.getPrice();
            return car3.getBrend();
        }
        else{
            return "game over";
        }
    }
}
