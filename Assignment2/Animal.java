/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Animal class consists of private variables for information of an animal
 * Each variable has a setter and a getter method
 *
 *
 */
class Animal {
    /**
     * animalType the type of animal
     */
    private String animalType;
    /**
     * animalName the name of the animal
     */
    private String animalName;
    /**
     * age the age of the animal
     */
    private int age;
    /**
     * gender the gender of the animal
     */
    private String gender;
    /**
     * environment the environment of the animal
     */
    private String environment;
    /**
     * animalSpeed the speed of the animal
     */
    private double animalSpeed;

    /**
     * This constructor for a Animal is fully parameterized
     * @param animalType animalType the type of animal
     * @param animalName animalName the name of the animal
     * @param age age the age of the animal
     * @param gender gender the gender of the animal
     * @param environment environment the environment of the animal
     * @param animalSpeed animalSpeed the speed of the animal
     */
    Animal(String animalType, String animalName, int age, String gender, String environment, double animalSpeed) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.animalSpeed = animalSpeed;
    }

    /**
     * This returns the current animalType of this Animal
     * @return animalType
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * This returns the current animalName of this Animal
     * @return animalName
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * This returns the current age of this Animal
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * This returns the current gender of this Animal
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * This returns the current environment of this Animal
     * @return environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * This returns the current animalSpeed of this Animal
     * @return animalSpeed
     */
    public double getAnimalSpeed() {
        return animalSpeed;
    }

    /**
     *
     * @param animalType animalType the type of animal
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    /**
     *
     * @param animalName animalName the name of the animal
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     *
     * @param age age the age of the animal
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @param gender gender the gender of the animal
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @param environment environment the environment of the animal
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     *
     * @param animalSpeed animalSpeed the speed of the animal
     */
    public void setAnimalSpeed(double animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    /**
     * This method prints message move
     */
    public void move(){
        System.out.println(getAnimalName() + " is moving!");
    }

    /**
     * This method prints message sound
     */
    public void sound(){
        System.out.println(getAnimalName() + " is making a sound!");
    }

    /**
     * This method prints message eat
     */
    public void eat(){
        System.out.println(getAnimalName() + " is eating!");
    }

    /**
     * This method prints message sleep
     */
    public void sleep(){
        System.out.println(getAnimalName() + " is sleeping!");
    }

    /**
     * This method overrides the default toString and returns a custom string message
     * @return String message with animal info
     */
    @Override
    public String toString() {
        return ("Animal name: " + getAnimalName() + '\n' + "Animal type: " + getAnimalType() + '\n' +
                "Animal environment: " + getEnvironment() + '\n' + "Animal age: " + getAge() + '\n' +
                "Animal gender: " + getGender() + '\n' + "Animal speed: " + getAnimalSpeed());
    }
}
