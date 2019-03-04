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

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof FootballPlayer)) {
            return false;
        }

        FootballPlayer fbObj = (FootballPlayer) obj;

        return super.equals(obj) && this.getSpeciality() == fbObj.getSpeciality();
    }
}

enum Speciality {
    SP_OFFENSE, SP_DEFENSE, SP_SPECIALTEAMS;
};