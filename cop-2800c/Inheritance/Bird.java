public class Bird extends Animal{
    private int wingspan;
    private boolean canFly;

    public Bird(String name, int weight, int height, int wingspan, boolean canFly){
        super(weight, height);
        setName(name);
        setWingspan(wingspan);
        setCanFly(canFly);
    }

    public Name getName(){
        return name;
    }
    public int getWingspan(){
        return wingspan;
    }
    public boolean getCanFly(){
        return canFly;
    }
    public void setName(String name){
        this.name = new Name(name);
    }
    public void setWingspan(int wingspan){
        this.wingspan = wingspan;
    }
    public void setCanFly(boolean canFly){
        this.canFly = canFly;
    }

    @Overrride
    public String toString(){
        String result;
        result = "Bird: " + name + " Wingspan: " + this.getWingspan() + "Canfly: "+ this.getCanFly() + super.toString() + super.getWeight() + super.getHeight();
        return result;
    }
}