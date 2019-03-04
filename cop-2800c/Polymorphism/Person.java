/*
* File: Person.java
* Name: David Bruno
* Date: 3/03/19
*/

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return name + ", " + age;
    }
    
}
