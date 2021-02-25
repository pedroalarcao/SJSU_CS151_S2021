/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This is a child class of Animal that implements the interface Domesticated
 * It is a Dog class and it furthers implements the method within the Domesticated interface
 */

class Dog extends Animal implements Domesticated{

    /**
     * This constructor for a Dog is fully parameterized
     * @param animalType animalType the type of animal
     * @param animalName animalName the name of the animal
     * @param age age the age of the animal
     * @param gender gender the gender of the animal
     * @param environment environment the environment of the animal
     * @param animalSpeed animalSpeed the speed of the animal
     */
    Dog(String animalType, String animalName, int age, String gender, String environment, double animalSpeed) {
        super(animalType, animalName, age, gender, environment, animalSpeed);
    }

    /**
     * This is a special method of the Dog class that prints a special message
     */
    public void bark(){
        System.out.println("The dog barks!");
    }

    /**
     * This method overrides the method within the interface Domesticated
     * It prints out a special message
     */
    @Override
    public void walk() {
        System.out.println("Waling the dog!");
    }

    /**
     * This method overrides the method within the interface Domesticated
     * It prints out a special message
     */
    @Override
    public void greetHuman() {
        System.out.println("The dog greets the human!");
    }
}
