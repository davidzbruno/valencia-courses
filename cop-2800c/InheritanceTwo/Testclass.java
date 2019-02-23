public class Testclass{
    public static void main(String[] args){
        Automobile cars[] = new Automobile[6];

        cars[0] = new Automobile("Toyota Pathfinder", 1995, "grey");
        cars[1] = new Automobile("Toyota Prius", 1995, "ReD");
        cars[2] = new Automobile("Toyota Camary", 2012, "BLACK");
        cars[3] = new RaceCar("Yuzimoto Supercharger Z51", 2019, "WHITE","Supercharch YZ61", 291, false);
        cars[4] = new RaceCar("Dodge Charger", 2002, "Youngholmz Dry Switch Maximum Control", 169, true);
        cars[5] = new RaceCar("Mercedez Benz CX2910", 2017, "GoodYear Racetrack 213Xc", 150);
       
        for(Automobile car : cars){
            System.out.println(car);
        }
    }
}