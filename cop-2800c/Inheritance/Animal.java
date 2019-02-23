/*
* File: Animal.java
* Name: David Bruno
* Date: 2/22/19
*/

public class Animal extends Object{
    private int weight;
    private int height;

    public Animal(int weight, int height){
        super();
        setWeight(weight);
        setHeight(height);
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString(){
        String result;
        result = "(ANIMAL) " + weight + " lbs, " + height + "\'";
        return result;

    }
}