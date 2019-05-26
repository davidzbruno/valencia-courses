import java.util.*;

/*
* File: test.java
* Name: David Bruno
* Date: 3/04/19
*/
public class test {

    public static void display() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--- [1] Compare athletes [2] Command athletes [3] Print athletes [exit] Exit ---");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Option: ");

    }

    public static <T extends Athlete> void compare(T[] arr) {
        int matches;
        for (T a : arr) {
            if (a != null) {
                matches = -1;
                System.out.print(a.getName() + ": ");
                for (T b : arr) {
                    if (b != null) {
                        if (a.equals(b))
                            matches++;
                    }
                }
                String res = (matches > 0 ? "Matches found." : "No matches");
                System.out.println(res);
            }
        }
    }

    // public static <T extends Comparable<T>> void compare(T[] arr) {
    // List<T> temp = new List<T>(Arrays.asList(arr));
    // Collections.sort(temp);
    // arr = temp.toArray(new T[temp.size()]);
    // for (T a : arr) {
    // if (a != null)
    // System.out.println(a);
    // }
    // }

    public static <T extends Athlete> void command(T[] arr) {
        for (T a : arr) {
            if (a != null) {
                System.out.print(a.getName() + ": ");
                a.doThis();
            }
        }
    }

    public static <T> void print(T[] arr) {
        for (T obj : arr) {
            if (obj != null)
                System.out.println(obj);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String option = "exit";

        Athlete people[] = new Athlete[100];
        people[0] = new BaseballPlayer("Hank H. Aaron", 44, "Atlanta Braves", "Right Fielder", 1, "BH_RIGHT");
        people[1] = new FootballPlayer("Terry Paxton Bradshaw", 12, "Pittsburgh Steelers", "Quarterback", "SP_OFFENSE");
        people[2] = new HockeyPlayer("Mario Lemieux", 10, "Pittsburgh Penguins", "Centre", "Warrior Covert QRL");
        people[3] = new GolfPlayer("Eldrick Tont Woods", 1, "PGA Tour", "N/A", "Nike");

        people[4] = new BaseballPlayer("Barry Lamar Bonds", 25, "San Francisco Giants", "Left Fielder", 1, "BH_LEFT");
        people[5] = new FootballPlayer("Walter \"Sweetness\" Jerry Payton", 34, "Chicago Bears", "Runningback",
                "SP_OFFENSE");
        people[6] = new HockeyPlayer("Wayne Douglas Gretzky", 99, "Edmonton Oilers", "Centre", "N/A");
        people[7] = new GolfPlayer("Phil Mickelson", 2, "PGA Tour", "N/A", "Callaway Golf");

        people[8] = new BaseballPlayer("Aaron Rodriguez", 25, "New York Yankees", "Left Fielder", 1, "BH_LEFT");
        people[9] = new FootballPlayer("Jim Brown", 34, "Cleveland Browns", "Runningback", "SP_OFFENSE");
        people[10] = new HockeyPlayer("Sidney Crosby", 99, "Pittsburgh Penguins", "Centre", "N/A");
        people[11] = new GolfPlayer("Arnold Palmer", 2, "PGA Tour", "N/A", "Callaway Golf");

        people[12] = new KabaddiPlayer("David Bruno", 18, "Orlando-Bangladesh", "Raider", "US", "012345678", true);

        do {
            display();
            option = sc.next();
            switch (option) {
            case "1":
                compare(people);
                break;
            case "2":
                command(people);
                break;
            case "3":
                print(people);
                break;
            case "exit":
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Invalid entry. Please try again.");
                break;
            }
        } while (!option.equals("exit"));
    }
}