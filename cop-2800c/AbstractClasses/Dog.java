/*
* File: Dog.java
* Name: David Bruno
* Date: 2/28/19
*/
public class Dog extends Animal {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public void makeNoise() {
        System.out.println("ruff");
    }

    public void goHome() {
        System.out.println("going home to a kennel");
    }

    @Override
    public String toString() {
        String result;
        result = "(DOG) " + super.toString();
        return result;
    }
}