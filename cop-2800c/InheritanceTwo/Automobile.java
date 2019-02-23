public class Automobile{
    private String model;
    private int year;
    private String color;

    public Automobile(String model, int year, String color){
        setModel(model);
        setYear(year);
        setColor(color);
    }

    public Automobile(String model, int year){
        setModel(model);
        setYear(year);
        setColor("SILVER");
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String model){
        this.model = model.toUpperCase();
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color.toUpperCase();
    }

    @Override
    public String toString(){
        return this.getModel() + ", " + this.getYear() + ", " + this.getColor();
    }
}