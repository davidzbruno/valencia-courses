/*
* File: GolfPlayer.java
* Name: David Bruno
* Date: 3/03/19
*/

public class GolfPlayer extends Athlete {

    private String mainSponser;

    public GolfPlayer(String name, int age, String team, String position, String mainSponser) {
        super(name, age, team, position);
        setMainSponser(mainSponser);
    }

    public String getMainSponser() {
        return mainSponser;
    }

    public void setMainSponser(String mainSponser) {
        this.mainSponser = mainSponser;
    }

    public void doThis() {
        System.out.println("I putt it in the hole.");
    }

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof GolfPlayer)) {
            return false;
        }

        GolfPlayer gObj = (GolfPlayer) obj;

        return super.equals(obj) && this.getMainSponser().equals(gObj.getMainSponser());
    }
}
