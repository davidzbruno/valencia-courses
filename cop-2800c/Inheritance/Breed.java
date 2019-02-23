/*
* File: Breed.java
* Name: David Bruno
* Date: 2/22/19
*/

public class Breed{

    private String breed;
    private boolean isPurebred;

    public Breed(String breed, boolean isPurebred){
        setBreed(breed);
        setIsPurebred(isPurebred);
    }

    public Breed(String breed){
        setBreed(breed);
        setIsPurebred(false);
    }

    public String getBreed(){
        return breed;
    }
    public boolean getIsPurebred(){
        return isPurebred;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsPurebred(boolean isPurebred) {
        this.isPurebred = isPurebred;
    }

    @Override
    public String toString(){
        return (isPurebred) ? breed + "(Purebred)" : breed;
    }
}