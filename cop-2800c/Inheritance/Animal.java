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
        result = " I am an animal weighting: " + weight + "and " + height + " inches.";
        return result;

    }
}