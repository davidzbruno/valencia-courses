/*
* File: Animal.java
* Name: David Bruno
* Date: 2/28/19
*/
abstract public class Animal {

    private String name;
    private int weight;

    public Animal(String name, int weight) {
        setName(name);
        setWeight(weight);
    }

    abstract public void makeNoise();

    abstract public void goHome();

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "I am an animal weighing " + weight;
    }
}