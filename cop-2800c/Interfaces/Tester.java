public class Tester{

    public static void main(String[] args){
        Person person1 = new Man("James Williams", 73, 210);
        Person person2 = new Woman("Francine Wayne", 56, 125);

        person1.getMarried(person2);
        person1.setRing("Simple Wedding Band");
        person2.setRing("Fancy Overlypriced Wedding Ring");

        Person[] family = new Person[3];
        family[0] = person1;
        family[1] = person2;

        for(Person familyMember : family ){
            if(familyMember != null){
                System.out.println(familyMember);
                familyMember.grow(3,30);
                familyMember.move();
            }
        }

        Person person3 = person2.haveChild("Cardon Blant " + person1.getName(), 1, 8,'M');
        family[2] = person3;
        
        for(Person familyMember : family){
            if(familyMember != null){
                System.out.println(familyMember);
                familyMember.speak();
                familyMember.move();
                familyMember.grow(0,5);
            }
        }

        family[2].grow((family[0].getHeight() + family[1].getHeight())/2,140);
        family[2].doHomwork();
        family[2].graduateHighSchool();

        Person mistress = new Man("Hillfon James", 74, 190);
        family[0].getMarried(mistress);

        family[0].getDivorced();
        family[0] = null;

        Person person4 = person2.haveChild("Regina " + person2.getName(), 1, 8,'F');
        family[0] = person4;
        person1.getMarried(mistress);

        family[2].startCollege();
        family[2].graduateCollege();

        for(Person familyMember : family){
            if(familyMember != null){
                System.out.println(familyMember);
                familyMember.speak();
                familyMember.move();
            }
        }

    }
}