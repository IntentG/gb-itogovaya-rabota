import MODEL.AnimalStorage;
import MODEL.Counter;
import VIEW.View;

public class Presenter {
    public static void main(String[] args) {
        View view = new View();
        AnimalStorage db = new AnimalStorage();
        Counter counter = new Counter();
        while (true) {
            menu(db, view, counter);
        }

    }

    public static void menu(AnimalStorage db, View view, Counter counter) {
        int p = view.mainMenu();
        if (p == 1) db.addAnimal(counter, view);
        else if (p == 2) view.whichAnimal();
        else;
    }
}
