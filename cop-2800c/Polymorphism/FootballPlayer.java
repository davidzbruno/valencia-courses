/*
* File: FootballPlayer.java
* Name: David Bruno
* Date: 3/03/19
*/

public class FootballPlayer extends Athlete {
    private Speciality speciality;

    public FootballPlayer(String name, int age, String team, String position, String speciality) {
        super(name, age, team, position);
        setSpeciality(speciality);
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = Speciality.valueOf(speciality);
    }

    public void doThis() {
        System.out.println("I tackle something.");
    }
}

enum Speciality {
    SP_OFFENSE, SP_DEFENSE, SP_SPECIALTEAMS;
};