package com.bridgelabz.addressbook;
import java.util.Scanner;

public class OptionMenu {
    public void operation() {

        Scanner scanner = new Scanner(System.in);
        AddOrRemove addOrRemove = new AddOrRemove();

        while (true) {

            System.out.println("\nWhat would u like to do with contacts? \n" + "1. ADD     \n" + "2. DISPLAY \n"
                    + "0. EXIT    \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addOrRemove.addPerson();
                    break;

                case 2:
                    addOrRemove.displayPerson();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
