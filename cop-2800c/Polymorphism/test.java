/*
* File: test.java
* Name: David Bruno
* Date: 3/03/19
*/
public class test {
    public static void main(String args[]) {

        Athlete team[] = new Athlete[8];

        team[0] = new BaseballPlayer("Henry \"Hammerin\' Hank\" Louis Aaron", 44, "Atlanta Braves", "Right Fielder", 1,
                "BH_RIGHT");
        team[1] = new FootballPlayer("Terry Paxton Bradshaw", 12, "Pittsburgh Steelers", "Quarterback", "SP_OFFENSE");
        team[2] = new HockeyPlayer("Mario Lemieux", 10, "Pittsburgh Penguins", "Centre", "Warrior Covert QRL");
        team[3] = new GolfPlayer("Eldrick Tont Woods", 1, "PGA Tour", "N/A", "Nike");
        team[4] = new BaseballPlayer("Barry Lamar Bonds", 25, "San Francisco Giants", "Left Fielder", 1, "BH_LEFT");
        team[5] = new FootballPlayer("Walter \"Sweetness\" Jerry Payton", 34, "Chicago Bears", "RB", "SP_OFFENSE");
        team[6] = new HockeyPlayer("Wayne Douglas Gretzky", 99, "Wayne Douglas Gretzky", "Centre", "N/A");
        team[7] = new GolfPlayer("Phil Mickelson", 2, "PGA Tour", "N/A", "Callaway Golf");

        for (Athlete a : team) {
            a.doThis();
            System.out.println(a);
        }

    }
}