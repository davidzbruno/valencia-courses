/*
* File: Athlete.java
* Name: David Bruno
* Date: 3/03/19
*/

public class Athlete extends Person /* implements Comparable */ {

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

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Athlete)) {
            return false;
        }

        Athlete aObj = (Athlete) obj;

        return super.equals(obj) && this.getTeam().equals(aObj.getTeam())
                && this.getPosition().equals(aObj.getPosition());
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getTeam() + ", " + getPosition();
    }

    // @Override
    // public boolean compareTo(Object obj){
    // int res = 0;

    // if (obj == this) {
    // return true;
    // }

    // if (!(obj instanceof Athlete)) {
    // return false;
    // }

    // res += this.getTeam().compareTo(obj.getTeam());

    // }
}
