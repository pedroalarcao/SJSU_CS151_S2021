/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Person class consists of private variables for information of a person
 * Each variable has a setter and a getter method
 * We have a method that shows info for person
 */
class Person {

    /**
     * firstName the first name of Person
     */
    private String firstName;

    /**
     * lastName the last name of Person
     */
    private String lastName;

    /**
     * age the age of Person
     */
    private int age;

    /**
     *
     * @param firstName firstName the first name of Person
     * @param lastName lastName the last name of Person
     * @param age age the age of Person
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * This returns the current first name of this Person
     *
     * @return String this Person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the first name of Person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This returns the current last name of the Person
     *
     * @return this Person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the last name of Person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This returns the current age of the Person
     *
     * @return this Person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age of the Person
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Overriden default toString method that prints info
     * @return method that prints course info
     */
    @Override
    public String toString() {
        return printInfo();
    }

    /**
     * Method that returns String with Person info
     * @return Person info
     */
    String printInfo(){

        return getFirstName() + " " + getLastName() + ", " + getAge();
    }
}
