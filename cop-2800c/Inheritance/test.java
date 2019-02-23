/*
* File: test.java //tester class for inheritance
* Name: David Bruno
* Date: 2/22/19
*/
public class test{
    public static void main(String[] args){

        Animal pets[] = new Animal[4];

        pets[0] = new Animal(250, 54);
        pets[1] = new Dog("Connie", 43, 43, "Cocker-spaniel", "2/4/2015");
        pets[2] = new Cat("Alice Carroll", 12, 32);
        pets[3] = new Bird("Coco Channel", 3, 7, 4, true);

        for(Animal pet : pets){
            System.out.println(pet);
        }
    }
}