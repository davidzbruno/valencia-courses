/*
* File: HockeyPlayer.java
* Name: David Bruno
* Date: 3/03/19
*/

public class HockeyPlayer extends Athlete {

    private String stickBrand;

    public HockeyPlayer(String name, int age, String team, String position, String stickBrand) {
        super(name, age, team, position);
        setStickBrand(stickBrand);
    }

    public String getStickBrand() {
        return stickBrand;
    }

    public void setStickBrand(String stickBrand) {
        this.stickBrand = stickBrand;
    }

    public void doThis() {
        System.out.println("I sit in a penalty box.");
    }

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof HockeyPlayer)) {
            return false;
        }

        HockeyPlayer hObj = (HockeyPlayer) obj;

        return super.equals(obj) && this.getStickBrand().equals(hObj.getStickBrand());
    }
}
