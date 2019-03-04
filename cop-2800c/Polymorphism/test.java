/*
* File: test.java
* Name: David Bruno
* Date: 3/03/19
*/
public class test {
    public static void main(String args[]) {

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

        people[4] = new BaseballPlayer("Aaron Rodriguez", 25, "New York Yankees", "Left Fielder", 1, "BH_LEFT");
        people[5] = new FootballPlayer("Jim Brown", 34, "Cleveland Browns", "Runningback", "SP_OFFENSE");
        people[6] = new HockeyPlayer("Sidney Crosby", 99, "Pittsburgh Penguins", "Centre", "N/A");
        people[7] = new GolfPlayer("Arnold Palmer", 2, "PGA Tour", "N/A", "Callaway Golf");

        for (Athlete a : people) {
            a.doThis();
            System.out.println(a);
        }

    }
}