package MODEL;

import VIEW.View;

import java.util.ArrayList;
import java.util.Date;

public class AnimalStorage implements DatabaseOperations{

    public ArrayList<Animal> database = new ArrayList<>();

    @Override
    public void addComands(Animal animal, String comands) {
        animal.setComands(comands);
    }

    @Override
    public void addAnimal(Counter id, View view) {
        int type = view.animalTypeMenu();
        Animal animal = null;
        if (type == 1){
            animal = new Dog(view.enterDate(), view.enterComands(), view.enterName(), id.id) ;
        }
        else if (type == 2){
            animal = new Cat(view.enterDate(), view.enterComands(), view.enterName(), id.id) ;
        }
        else if (type == 3){
            animal = new Mouse(view.enterDate(), view.enterComands(), view.enterName(), id.id) ;
        }
        else if (type == 4){
            animal = new Horse(view.enterDate(), view.enterComands(), view.enterName(), id.id) ;
        }
        else if (type == 5){
            animal = new Camel(view.enterDate(), view.enterComands(), view.enterName(), id.id) ;
        }
        else if (type == 6){
            animal = new Donkey(view.enterDate(), view.enterComands(), view.enterName(), id.id) ;
        }
        database.add(animal);
    }

    @Override
    public String showComands(Animal animal) {
        return animal.getComands();
    }
}
