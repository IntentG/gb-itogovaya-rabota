package MODEL;

import java.util.Date;

public class Mouse extends HomeAnimal{
    public Mouse(String name, String comands, Date date) {
        setName(name);
        setComands(comands);
        setBirthDate(date);
    }
}
