/*
* File: Cat.java
* Name: David Bruno
* Date: 2/22/19
*/
public class Cat extends Animal{

    private Name name;
    private int lives;

    public Cat(String name, int weight, int height){
        super(weight, height);
        setName(name);
        lives = 9;
    }

    public Name getName(){
        return name;
    }

    public void setName(String name){
        this.name = new Name(name);
    }

    public int getLives(){
        return lives;
    }
    public void setLives(int lives){
        this.lives = lives;
    }

    @Override
    public String toString(){
        String result;
        result = "(CAT) " + this.getName() + ", " + this.getLives() + " lives, " + super.toString();
        return result;
    }
}