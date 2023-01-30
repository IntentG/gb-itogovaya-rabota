package MODEL;

import java.util.Date;

public class Horse extends RidingAnimal{
    public Horse(String name, String comands, Date date) {
        setName(name);
        setComands(comands);
        setBirthDate(date);
    }
}
