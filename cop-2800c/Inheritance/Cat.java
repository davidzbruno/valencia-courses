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

    @Overrride
    public String toString(){
        String result;
        result = "Cat: " + name + " Lives: " + this.getLives() + super.toString() + super.getWeight() + super.getHeight();
        return result;
    }
}