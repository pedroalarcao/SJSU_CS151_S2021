/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This is a child class of Animal that implements the interface Swimmer
 * It is a whale class and it furthers implements the method within the Swimmer interface
 */

class Whale extends Animal implements Swimmer{

    /**
     * This constructor for a Whale is fully parameterized
     * @param animalType animalType the type of animal
     * @param animalName animalName the name of the animal
     * @param age age the age of the animal
     * @param gender gender the gender of the animal
     * @param environment environment the environment of the animal
     * @param animalSpeed animalSpeed the speed of the animal
     */
    Whale(String animalType, String animalName, int age, String gender, String environment, double animalSpeed) {
        super(animalType, animalName, age, gender, environment, animalSpeed);
    }

    /**
     * This method overrides the method within the interface Swimmer
     * It prints out a special message
     */
    @Override
    public void swim() {
        System.out.println("The whale swims!");
    }
}
