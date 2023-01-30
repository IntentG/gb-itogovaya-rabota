package MODEL;

import java.util.Date;

public class Donkey extends RidingAnimal{
    public Donkey(String name, String comands, Date date) {
        setName(name);
        setComands(comands);
        setBirthDate(date);
    }
}
