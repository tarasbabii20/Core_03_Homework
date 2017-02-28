package Core_01;


/**
 * Created by Taras on 28.02.2017.
 */
public class Woman {

    private String name;
    private String surname;

    public Woman(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
