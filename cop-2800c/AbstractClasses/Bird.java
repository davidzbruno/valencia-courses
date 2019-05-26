/*
* File: Bird.java
* Name: David Bruno
* Date: 2/22/19
*/

public class Bird extends Animal {
    private int wingspan;
    private boolean canFly;

    public Bird(String name, int weight, int wingspan, boolean canFly) {
        super(name, weight);
        setWingspan(wingspan);
        setCanFly(canFly);
    }

    public Bird(String name, int weight) {
        super(name, weight);
        setWingspan(0);
        setCanFly(false);
    }

    public int getWingspan() {
        return wingspan;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void makeNoise() {
        System.out.println("chrip");
    }

    public void goHome() {
        System.out.println("going home to a birdt house");
    }

    @Override
    public String toString() {
        String result;
        result = "(BIRD) " + super.toString();
        return result;
    }
}