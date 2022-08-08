/*
 * Coding assessment (ceiling fan)
 */
package ceilingfan;

import java.util.Scanner;

/**
 *
 * @author Mohamed Elsheimy
 */
public class CeilingFan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice = -1;
        boolean endProgram = false;
        
        // initializing fan speed to 0 and dirction to Forward
        Fan fan = new Fan(0, "Forward");

        do {
            System.out.print("\u001B[34m" + "Current Fan status:- " + '\t' + fan.toString() + '\n'
                    + "\t***\t Please select an option from the menu to continue \t***");
            displayMenu();
            // verify that input is integer
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            }
            scanner.nextLine(); // clear buffer

            switch (menuChoice) {
                case 1:
                    fan.increaseSpeed();
                    menuChoice = -1; // reset menu choice
                    break;
                case 2:
                    fan.reverseDirection();
                    menuChoice = -1; // reset menu choice
                    break;
                case 3:
                    endProgram = true;
                    System.out.println("*** End of the program ***");
                    // close the scanner
                    scanner.close();
                    break;
                default:
                    System.out.println("\u001B[31m" + "Please enter a valid choice!");
            }
        } while (!endProgram);
    }//main

    /**
     * Displaying main menu
     */
    private static void displayMenu() {
        System.out.print("\n=========================" + '\n'
                + "          MENU" + '\n'
                + "=========================" + '\n'
                + "1- Increase Fan speed" + '\n'
                + "2- Reverse Fan direction" + '\n'
                + "3- Exit program" + '\n'
                + "Your choice: ");
    }//displayMenu
}
