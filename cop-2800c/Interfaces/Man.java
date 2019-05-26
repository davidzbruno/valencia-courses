public class Man extends Person{
    private final char gender = 'M';
    private String ring = "(male wedding ring)";
    public Person spouse = null;

    public Man(String name, int height, int weight) {
        super(name, height, weight);
    }
    
    // Man class methods
    public void manSplain(){
        System.out.println("...so basically, I am going to tell you what it is because I am an alpha man...");
    }

    // Person abstract methods
    public void speak() {
        System.out.println("...hey, I am a man! Everything is in my favor!...");
    }

    public void move() {
        if(this.getWeight() < 200){
            System.out.println("...running like Forrest Gump...");
        }
        else{
            System.out.println("...running like Donald Trump...");
        }
    }

    // Married abstract methods
    public void getMarried(Person p) {
        System.out.println(this.toString() + ": ");
        if(this.getSpouse() == p){
            System.out.println("...getting remarried...");
            return;
        }
        if(this.getSpouse() != null){
            System.out.println("...you are already married (are you from Utah?) You can't marry " + p.getName() +"...");
            return;
        }
        System.out.println("...getting married...this will be short...");
        this.setSpouse(p);
        System.out.println("...married to " + p.getName() + "...");
    }

    public void getDivorced() {
        System.out.println(this.toString() + ": ");
        if(this.getSpouse() == null){
            System.out.println("...you are not currently married thankfully...");
            return;
        }
        System.out.println("...getting divorced because I cheated...");
        this.getSpouse().setSpouse(null);
        this.setSpouse(null);
    }

    public void setRing(String ringName) {
        ring = ringName;
    }


    // Student abstract methods
    public void doHomwork() {
        System.out.println("...doing homework (slowly)...");
    }

    public void graduateHighSchool() {
        System.out.println("...graduated high school barely...");
    }

    public void startCollege() {
        System.out.println("...starting college by the grace of God (and my male privledge)...");
    }

    public void graduateCollege() {
        System.out.println("...cheated my way to graduating college...");
    }
}
