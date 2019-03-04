/*
* File: Athlete.java
* Name: David Bruno
* Date: 3/03/19
*/

public class Athlete extends Person {

    private String team;
    private String position;

    public Athlete(String name, int age, String team, String position) {
        super(name, age);
        setTeam(team);
        setPosition(position);
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void doThis() {
        System.out.println("...something...");
    }

    public String toString() {
        return super.toString() + ", " + team + ", " + position;
    }
}
