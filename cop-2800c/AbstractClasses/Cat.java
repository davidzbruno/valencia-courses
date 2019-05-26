/*
* File: Cat.java
* Name: David Bruno
* Date: 2/28/19
*/

public class Cat extends Animal {

    private boolean isNuetered;

    public Cat(String name, int weight, boolean isNuetered) {
        super(name, weight);
        setNuetered(isNuetered);
    }

    public Cat(String name, int weight) {
        super(name, weight);
        setNuetered(false);
    }

    public boolean getIsNuetered() {
        return isNuetered;
    }

    public void setNuetered(boolean isNuetered) {
        this.isNuetered = isNuetered;
    }

    public void makeNoise() {
        System.out.println("meow");
    }

    public void goHome() {
        System.out.println("going home to a cat house");
    }
}