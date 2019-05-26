public abstract class Person implements Student, Parent, Married {
    private Person spouse = null;
    private String name;
    private int height;
    private int weight;

    abstract public void speak();

    abstract public void move();

    public Person(String name, int height, int weight) {
        setName(name);
        setHeight(height);
        setWeight(weight);
    }

    public void grow(int inches, int pounds) {
        setHeight(getHeight() + inches);
        setWeight(getWeight() + pounds);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return name + ", " + height + "\", " + weight;
    }
    public Person getSpouse(){
        return spouse;
    }
    public void setSpouse(Person spouse){
        this.spouse = spouse;
    }
    public Person haveChild(){
        return null;
    }
    public Person haveChild(String name, int height, int weight, char gender){
        return new Man("Demon Child",0,0);
    }

}