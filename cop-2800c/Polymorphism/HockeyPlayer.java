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
}
