/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This is a child class of Animal that implements the interface Domesticated and Scratcher
 * It is a Cat class and it furthers implements the method within the Domesticated and Scratcher interface
 */

class Cat extends Animal implements Domesticated, Scratcher{

    /**
     * This constructor for a Cat is fully parameterized
     * @param animalType animalType the type of animal
     * @param animalName animalName the name of the animal
     * @param age age the age of the animal
     * @param gender gender the gender of the animal
     * @param environment environment the environment of the animal
     * @param animalSpeed animalSpeed the speed of the animal
     */
    Cat(String animalType, String animalName, int age, String gender, String environment, double animalSpeed) {
        super(animalType, animalName, age, gender, environment, animalSpeed);
    }

    /**
     * This method overrides the method within the interface Domesticated
     * It prints out a special message
     */
    @Override
    public void walk(){
        System.out.println("Walking cat!");
    }

    /**
     * This method overrides the method within the interface Domesticated
     * It prints out a special message
     */
    @Override
    public void greetHuman() {
        System.out.println("Cat says hello to human!");
    }

    /**
     * This method overrides the method within the interface Scratcher
     * It prints out a special message
     */
    @Override
    public void scratch() {
        System.out.println("Cat scratches!");
    }
}
