/*
* File: BaseballPlayer.java
* Name: David Bruno
* Date: 3/03/19
*/

public class BaseballPlayer extends Athlete {

    private int battingPosition;
    private BattingHand batHand;

    public BaseballPlayer(String name, int age, String team, String position, int battingPosition, String batHand) {
        super(name, age, team, position);
        setBattingPosition(battingPosition);
        setBatHand(batHand);
    }

    public int getBattingPostion() {
        return battingPosition;
    }

    public BattingHand getBatHand() {
        return batHand;
    }

    public void setBattingPosition(int battingPosition) {
        this.battingPosition = battingPosition;
    }

    public void setBatHand(String batHad) {
        this.batHand = BattingHand.valueOf(batHad);
    }

    @Override
    public void doThis() {
        System.out.println("I hit something.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof BaseballPlayer)) {
            return false;
        }

        BaseballPlayer bObj = (BaseballPlayer) obj;

        return super.equals(obj) && this.getBattingPostion() == bObj.getBattingPostion()
                && this.getBatHand() == bObj.getBatHand();
    }
}

enum BattingHand {
    BH_BOTH(0), BH_LEFT(1), BH_RIGHT(2);

    private final int batHad;

    private BattingHand(int batHad) {
        this.batHad = batHad;
    }
};