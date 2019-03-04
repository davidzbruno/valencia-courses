public abstract class InternationalPlayer extends Athlete {
    private String passport;
    private String country;

    public abstract void immigrate(String country);

    public abstract void emigrate();

    public InternationalPlayer(String name, int age, String team, String position, String counrty, String passport) {
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
        this.country = country;
    }

    public String toString() {
        return super.toString() + getPassport();
    }
}