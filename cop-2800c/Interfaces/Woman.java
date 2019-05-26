public class Woman extends Person{
    private final char gender = 'F';
    private String ring = "(female wedding ring)";

    public Woman(String name, int height, int weight) {
        super(name, height, weight);
    }

    // Person abstract methods
    public void speak() {
        System.out.println("...i am a woman, ready to earn my spot in this world :)...");
    }

    public void move() {
        System.out.println("...skipping...");
    }

    // Student abstract methods
    public void doHomwork() {
        System.out.println("...doing...");
    }

    public void graduateHighSchool() {
        System.out.println("...graduated high school...");
    }

    public void startCollege() {
        System.out.println("...starting college...");
    }

    public void graduateCollege() {
        System.out.println("...graduated college...");
    }

    // Married abstract methods
    public void getMarried(Person p) {
        System.out.println(this.toString() + ": ");
        if(this.getSpouse() == p){
            System.out.println("...getting remarried...");
            return;
        }
        if(this.getSpouse() != null){
            System.out.println("...you are already married can't marry " + p.getName() +"...");
            return;
        }
        System.out.println("...getting married...");
        this.setSpouse(p);
        System.out.println("...married to " + p.getName()+"...");
    }

    public void getDivorced() {
        System.out.println(this.toString() + ": ");
        if(this.getSpouse() == null){
            System.out.println("...you are not currently married...");
            return;
        }
        System.out.println("...getting divorced...");
        this.getSpouse().setSpouse(null);
        this.setSpouse(null);
    }

    public void setRing(String ringName) {
        ring = ringName;
    }

    // Mother abstract methods
    public Person haveChild(String name, int height, int weight, char gender) {
        if(gender == 'M')
            return new Man(name, height, weight);
        else
            return new Woman(name, height, weight);
    }
}