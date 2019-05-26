public class Animal implements Runnable{

    private String name;
    private int position;
    private int speed;
    private int restMax;
    private Food food;

    private final int RACE_LENGTH = 100;

    private static boolean isWinner = false;


    public Animal(String name, int position, int speed, int restMax, Food food){
        this.name = name;
        this.position = position;
        this.speed = speed;
        this.restMax = restMax;
        this.food = food;
    }

    @Override
    public void run() {
        while( getPosition() < RACE_LENGTH && !isWinner() )
        {
            System.out.println(toString());
            advancePosition();
            eatFood();
        }
        if(!isWinner()){
            System.err.println("Winner: " + toString());
        }
        else{
            System.err.println("Loser: " + toString());
        }
        setWinner(true);
        

        
    }

    public static void main(String[] args) {
        Food carrots = new Food();
        Animal rabbit_runner = new Animal("Bugz Bunny",0, 17, 6, carrots);
        Animal turtle_runner = new Animal("Franklin the Turle",0, 9, 3, carrots);

        Thread rabbit = new Thread(rabbit_runner);
        Thread turtle = new Thread(turtle_runner);

        rabbit.setDaemon(false);
        turtle.setDaemon(false);

        rabbit.setName("Bugz Bunny");
        turtle.setName("Franklin the Turle");

        turtle.start();
        rabbit.start();
    }

    public void advancePosition(){
        this.position += this.speed;
    }

    public void eatFood(){
        food.eat(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRestMax() {
        return restMax;
    }

    public void setRestMax(int restMax) {
        this.restMax = restMax;
    }

    public static boolean isWinner() {
        return isWinner;
    }

    public static void setWinner(boolean isWinner) {
        Animal.isWinner = isWinner;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString(){
        return this.name + ", " + position;
    }
}

class Food{

    public void eat(Animal animal){
        System.out.println(animal.getName() + " has started eating.");

        try{
            Thread.sleep(((int) Math.ceil(Math.random() * animal.getRestMax())) * 1000);
        }catch(InterruptedException exception){
            exception.printStackTrace();
        }
        
        System.out.println(animal.getName() + " has finished eating.");

    }
}