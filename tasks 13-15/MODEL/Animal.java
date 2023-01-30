package MODEL;

import java.util.Date;

public abstract class Animal {

    private Date birthDate;
    private String comands;
    private String name;

    public void doSomeCommand() {

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getComands() {
        return comands;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setComands(String comands) {
        this.comands = comands;
    }

    public void setName(String name) {
        this.name = name;
    }
}
