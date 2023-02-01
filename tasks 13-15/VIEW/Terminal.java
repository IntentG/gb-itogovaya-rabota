package VIEW;

import MODEL.Animal;
import MODEL.AnimalStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal implements IView {

    @Override
    public int mainMenu() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Choose menu number: ");
                System.out.println("1 Add animal");
                System.out.println("2 View commands list");
                System.out.println("3 Teach new commands");
                int num = in.nextInt();
                in.close();
                if (num > 0 && num < 4) return num;
                else System.out.println("Try one more time");
            } catch (InputMismatchException e) {
                System.out.println("Try one more time");
            }
        }

    }

    @Override
    public int animalTypeMenu() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Choose animal type: ");
                System.out.println("1 Dog");
                System.out.println("2 Cat");
                System.out.println("3 Mouse");
                System.out.println("4 Horse");
                System.out.println("5 Camel");
                System.out.println("6 Donkey");
                int num = in.nextInt();
                in.close();
                if (num > 0 && num < 7) return num;
                else System.out.println("Try one more time");
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Try one more time");
            }
        }
    }

    @Override
    public void showComands(String comands) {
        System.out.println(comands);
    }

    @Override
    public int whichAnimal() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Insert ID: ");
                int num = in.nextInt();
                in.close();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Try one more time");
            }
        }
    }

    @Override
    public String enterName() {
        String s = "Enter Name";
        return enter(s);
    }

    @Override
    public String enterComands() {
        String s = "Enter Commands";
        return enter(s);
    }

    @Override
    public Date enterDate() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter date dd.mm.yyyy");
                String result = in.toString();
                in.close();
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date date = format.parse(result);
                return date;
            } catch (InputMismatchException | ParseException e) {
                System.out.println("Try one more time");
            }
        }
    }

    public String enter(String s){
        Scanner in = new Scanner(System.in);
        System.out.println(s);
        String result = in.toString();
        in.close();
        return result;
    }

}
