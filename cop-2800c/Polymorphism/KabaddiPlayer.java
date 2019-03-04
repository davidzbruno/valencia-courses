public class KabaddiPlayer extends InternationalAthlete implements Bangladesh {
    private boolean isRaider;

    public KabaddiPlayer(String name, int age, String team, String position, String country, String passport,
            boolean isRaider) {
        super(name, age, team, position, country, passport);
        setIsRaider(isRaider);
    }

    public void immigrate(String country) {
        if (country.equals("US") || country.equals("UK") || country.equals("BD"))
            super.setCountry(country);
        else
            System.out.println("This country does not play this sport and will not allow immigration.");
    }

    public void nationalAnthem() {
        System.out.println("...Bangladesh National Anthem...");
    }

    public boolean getIsRaider() {
        return isRaider;
    }

    public void setIsRaider(boolean isRaider) {
        this.isRaider = isRaider;
    }

    @Override
    public void doThis() {
        System.out.println("I do whatever Kabiddi players do...");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof KabaddiPlayer)) {
            return false;
        }

        KabaddiPlayer kObj = (KabaddiPlayer) obj;

        return super.equals(obj) && this.getIsRaider() == kObj.getIsRaider();
    }

}