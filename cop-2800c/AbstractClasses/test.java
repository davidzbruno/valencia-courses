/*
* File: test.java
* Name: David Bruno
* Date: 2/28/19
*/

public class test {

    public static void main(String[] args) {

        Animal pet[] = new Animal[3];

        pet[0] = new Dog("Ruff Ruffman", 150);
        pet[1] = new Cat("Slyvester Sky", 30);
        pet[2] = new Cat("Kitty Galore", 60);

        for (Animal a : pet) {
            System.out.printf("Name: %s\n", a.getName());
            a.makeNoise();
            a.goHome();
        }

    }
}