package Core_01;

import java.util.Random;

/**
 * Created by Taras on 28.02.2017.
 */
public class Life {
    private Random random = new Random(System.currentTimeMillis());
    private int month1 = random.nextInt(13 - 1) + 1;
    private int month2 = random.nextInt(13 - 1) + 1;
    private int month3 = random.nextInt(13 - 1) + 1;
    private int randomWoman = random.nextInt(3);
    static int budget;
    private String suitName;
    private String jewelryName;
    private String carBrend;
    private Woman womanList[] = {new Woman("Катя", "Антонів"), new Woman("Руслана","Козак"), new Woman("Олеся", "Бондар")};
    private Woman woman = getWoman();
    private Man man = new Man();
    private Shop shop = new Shop();

    public void play(){
        System.out.println("Вашого персонажа звати " + man.getName() + " " + man.getSurname());
        System.out.println("Його посада " + man.getJob().getName());
        System.out.println("Він отримує зарплату " + man.getJob().getSalary() + " грн за місяць");
        System.out.println(man.getName() + " йде на роботу на " + month1 + " місяців");
        budget = man.getJob().getSalary() * month1;
        System.out.println("За цей час отримує зарплату " + budget + " грн");
        suitName = shop.buySuit();
        if(suitName.equals("game over")){
            System.out.println("У вас недостатньо коштів для покупки костюму");
            System.out.println("Ви програли");
            System.exit(0);
        }
        System.out.println(man.getName() + " купує " + suitName);
        System.out.println("У його бюджеті залишається " + budget + " грн");
        System.out.println(man.getName() + " йде на перше побачення з " + woman.getName() + " " + woman.getSurname());
        firstDate();
        System.out.println(man.getName() + " йде на роботу на " + month2 + " місяців");
        budget = budget + man.getJob().getSalary() * month2;
        System.out.println("Тепер його бюджет дорівнює " + budget + " грн");
        jewelryName = shop.buyJewelry();
        if(jewelryName.equals("game over")){
            System.out.println("У вас недостатньо коштів для покупки прикраси");
            System.out.println("Ви програли");
            System.exit(0);
        }
        System.out.println(man.getName() + " купує " + jewelryName);
        System.out.println("У його бюджеті залишається " + budget + " грн");
        System.out.println(man.getName() + " йде на друге побачення з " + woman.getName() + " та дарує їй " + jewelryName);
        secondDate();
        System.out.println(man.getName() + " йде на роботу на " + month3 + " місяців");
        budget = budget + man.getJob().getSalary() * month3;
        System.out.println("Тепер його бюджет дорівнює " + budget + " грн");
        carBrend = shop.buyCar();
        if(carBrend.equals("game over")){
            System.out.println("У вас недостатньо коштів для покупки машини");
            System.out.println("Ви програли");
            System.exit(0);
        }
        System.out.println(man.getName() + " купує машину марки " + carBrend);
        System.out.println("У його бюджеті залишається " + budget + " грн");
        System.out.println(man.getName() + " їде на третє побачення на " + carBrend + " з " + woman.getName());
        thirdDate();
        System.out.println("Вітаю! Ви успішно завоювали серце " + woman.getName());
    }

    public Woman getWoman() {
        for(int i = 0; i < womanList.length; i++){
            if(randomWoman == i){
                woman = womanList[i];
            }
        }
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public void firstDate(){
        if((woman.getName().equals("Катя") && suitName.equals("повсякденний костюм")) || (woman.getName().equals("Катя") && suitName.equals("смокінг")) || (woman.getName().equals("Катя") && suitName.equals("елітний костюм"))){
            System.out.println("Ваше перше побачення пройшло успіхно!");
        }
        else if((woman.getName().equals("Руслана") && suitName.equals("смокінг")) || (woman.getName().equals("Руслана") && suitName.equals("елітний костюм"))){
            System.out.println("Ваше перше побачення пройшло успіхно!");
        }
        else if(woman.getName().equals("Олеся") && suitName.equals("елітний костюм")){
            System.out.println("Ваше перше побачення пройшло успіхно!");
        }
        else{
            System.out.println("Ваш костюм не сподобався " + woman.getName());
            System.out.println("Ви програли");
            System.exit(0);
        }
    }

    public void secondDate(){
        if((woman.getName().equals("Катя") && jewelryName.equals("cрібні сережки")) || (woman.getName().equals("Катя") && jewelryName.equals("золотий браслет")) || (woman.getName().equals("Катя") && jewelryName.equals("діамантове кольє"))){
            System.out.println("Ваше друге побачення пройшло успіхно!");
        }
        else if((woman.getName().equals("Руслана") && jewelryName.equals("золотий браслет")) || (woman.getName().equals("Руслана") && jewelryName.equals("діамантове кольє"))){
            System.out.println("Ваше друге побачення пройшло успіхно!");
        }
        else if(woman.getName().equals("Олеся") && jewelryName.equals("діамантове кольє")){
            System.out.println("Ваше друге побачення пройшло успіхно!");
        }
        else{
            System.out.println("Ваша прикраса не сподобалась " + woman.getName());
            System.out.println("Ви програли");
            System.exit(0);
        }
    }

    public void thirdDate(){
        if((woman.getName().equals("Катя") && carBrend.equals("Lada")) || (woman.getName().equals("Катя") && carBrend.equals("Toyota")) || (woman.getName().equals("Катя") && carBrend.equals("Mercedes"))){
            System.out.println("Ваше третє побачення пройшло успіхно!");
        }
        else if((woman.getName().equals("Руслана") && carBrend.equals("Toyota")) || (woman.getName().equals("Руслана") && carBrend.equals("Mercedes"))){
            System.out.println("Ваше третє побачення пройшло успіхно!");
        }
        else if(woman.getName().equals("Олеся") && carBrend.equals("Mercedes")){
            System.out.println("Ваше третє побачення пройшло успіхно!");
        }
        else{
            System.out.println("Ваша машина не сподобалась " + woman.getName());
            System.out.println("Ви програли");
            System.exit(0);
        }
    }
}
