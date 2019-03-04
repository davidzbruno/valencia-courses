/*
* File: InternationalAthlete.java
* Name: David Bruno
* Date: 3/04/19
*/

public abstract class InternationalAthlete extends Athlete {
    private String passport;
    private String country;

    public abstract void immigrate(String country);

    public InternationalAthlete(String name, int age, String team, String position, String country, String passport) {
        super(name, age, team, position);
        setCountry(country);
        setPassport(passport);
    }

    public String getPassport() {
        return country.substring(0, 2) + passport;
    }

    public String getCountry() {
        return country;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setCountry(String country) {
        this.country = country.toUpperCase();
    }

    public String toString() {
        return getPassport() + ", " + super.toString();
    }
}