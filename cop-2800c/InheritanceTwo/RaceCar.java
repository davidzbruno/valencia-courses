public class RaceCar extends Automobile{
    private String tires;
    private int topSpeed;
    private boolean isStreetRacer;

    public RaceCar(String model, int year, String color, String tires, int topSpeed, boolean isStreetRacer){
        super(model,year,color);
        setTires(tires);
        setTopSpeed(topSpeed);
        setIsStreetRacer(isStreetRacer);
    }
    public RaceCar(String model, int year, String color, String tires, int topSpeed){
        super(model,year,color);
        setTires(tires);
        setTopSpeed(topSpeed);
        setIsStreetRacer(false);
    }

    public RaceCar(String model, int year, String tires, int topSpeed, boolean isStreetRacer){
        super(model,year);
        setTires(tires);
        setTopSpeed(topSpeed);
        setIsStreetRacer(isStreetRacer);
    }
    public RaceCar(String model, int year, String tires, int topSpeed){
        super(model,year);
        setTires(tires);
        setTopSpeed(topSpeed);
        setIsStreetRacer(false);
    }

    public String getTires(){
        return tires;
    }
    public int getTopSpeed(){
        return topSpeed;
    }
    public boolean getIsStreetRacer(){
        return isStreetRacer;
    }

    public void setTires(String tires){
        this.tires = tires;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public void setIsStreetRacer(boolean isStreetRacer){
        this.isStreetRacer = isStreetRacer;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + this.getTopSpeed() + ", " + this.getTires();
    }
}