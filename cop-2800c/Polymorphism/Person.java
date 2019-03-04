/*
* File: Person.java
* Name: David Bruno
* Date: 3/03/19
*/

public class Person {
    private Name name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = new Name(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person pObj = (Person) obj;

        return this.getName().equals(pObj.getName()) && this.getAge() == pObj.getAge();
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

}
