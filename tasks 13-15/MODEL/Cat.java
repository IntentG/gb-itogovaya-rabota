package MODEL;

import java.util.Date;

public class Cat extends HomeAnimal {
    public Cat(String name, String comands, Date date) {
        setName(name);
        setComands(comands);
        setBirthDate(date);
    }
}
