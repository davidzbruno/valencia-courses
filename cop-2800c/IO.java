import java.util.*;
import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String option = "clear";
        String name = null, age = null;

        do { // Menu Program
            System.out.println("-------------------------------XX----MENU----XX-------------------------------");
            System.out.println("Please select of of the following options: ");
            System.out.println("(1) Enter your name? (2) Enter your age? (3) Are you a teenager? (4) Make a triangle?");
            System.out.println("Type clear to exit this menu.");
            System.out.println("------------------------------------------------------------------------------");

            System.out.print("Option: ");
            option = sc.next();

            switch (option) {
            case "1": // Get name then echo back 20 times
                System.out.println("Enter your name: ");
                name = sc.next();
                for (int i = 0; i < 20; ++i) {
                    System.out.println(name);
                }
                break;
            case "2": // Get age then display it and doubled age
                System.out.println("Enter your age: ");
                age = sc.next();
                try {
                    System.out.println("Age: " + Integer.parseInt(age) + " Doubled Age: " + Integer.parseInt(age) * 2);
                } catch (NumberFormatException ex) {
                    System.out.println("Age entered is invalid");
                }
                break;
            case "3": // Print out teenage status
                if (age == null) {
                    System.out.println("Please enter age: ");
                    age = sc.next();
                }

                if (Integer.parseInt(age) < 20 && Integer.parseInt(age) > 12) { // If you are older than 12 but younger
                                                                                // than 20 you are a teenager
                    System.out.println("Since you are " + age + " years old, you are a teenager.");
                } else {
                    System.out.println("Since you are " + age + " years old, you are NOT a teenager.");
                }
                break;
            case "4": // Output a triangle to triangle.txt
                String outputFile = "triangle.txt";
                File file = new File(outputFile);
                PrintWriter out = new PrintWriter(file);

                System.out.println("Enter an integer between 3 and 50 (inclusively) to make a triangle: ");
                int rows = sc.nextInt();

                for (int i = 0; i < rows; ++i) {
                    for (int j = 0; j < i; ++j) {
                        System.out.print("X");
                        out.print("X");
                    }
                    System.out.println();
                    out.println();
                }
                out.close();
                break;
            case "clear": //Exit case;
                break;
            default:
                System.out.println("Please enter a valid option above.");
                break;
            }
        } while (!option.equals("clear"));

        System.out.println("Thank you for using this menu.");
        sc.close();
    }

}