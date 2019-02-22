/***************************************************************************/
/* FileL test.java
/* Name: David Bruno 
/* Date: 2/21/19 
/* Description: To test Person and Name classes
/***************************************************************************/

import java.util.*;

public class test{
    public static void main(String[] args){
        //The program will create and populate at least three different people.
        //The program will allow a user to change the fields for a person.
        //The program will output all three people.
        Person p1 = new Person("David Zepheniah Bruno",'M',18,25000.00);
        Person p2 = new Person("Barack Hussein Obama II",'M',57,569000.44);
        Person p3 = new Person("Spongebob SquarePants",'F',32);

        assert(p1.getName().equals("David Zepheniah Bruno"));
        assert(p1.getGender() == 'M');
        assert(p1.getAge() == 18);
        assert(p1.getSalary() == 25000);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.setName("Barack Obama");
        assert(p2.getName().equals("Barack Obama"));
        
        p3.setSalary(1.0000);
        assert(p3.getSalary() == 1.0);

        p3.setGender('m');
        assert(p3.getGender() == 'M');

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
    }

}