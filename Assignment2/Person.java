/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Person class consists of private variables for information of a person
 * Each variable has a setter and a getter method
 * We have a method that shows values for person
 *
 *
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
     * ssn the social security of Person
     */
    private String ssn;

    /**
     * address the address of Person
     */
    private String address;

    /**
     * gender the gender of Person
     */
    private String gender;

    /**
     * weight the weight of Person
     */
    private double weight;

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of Person
     * @param lastName  the last name of Person
     * @param age       the age of the Person
     * @param ssn       the ssn of the Person
     * @param gender    the gender of the Person
     * @param address   the address of the Person
     * @param weight    the weight of the Person
     *
     *
     */
    public Person(String firstName, String lastName, int age, String ssn, String address, String gender, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;

    }


    /**
     * This returns the current first name of this Person
     *
     * @return this Person's first name
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
     * This returns the current ssn of the Person
     *
     * @return this Person's ssn
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * @param ssn the ssn of the Person
     */
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }


    /**
     * This returns the current gender of the Person
     *
     * @return this Person's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender of the Person
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This returns the current address of the Person
     *
     * @return this Person's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address of the Person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This returns the current weight of the Person
     *
     * @return this Person's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight of the Person
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * This method overrides the default toString method
     * @return String with info this Person
     */
    @Override
    public String toString(){
        return "First name: " + getFirstName() + '\n' + "Last name: " + getLastName() + '\n' +
                "Age: " + '\n' + "SSN: " + getSSN() + '\n' + "Address: " + getAddress() + '\n' +
                "Gender: " + getGender() + '\n' + "Weight: " + getWeight();
    }

    /**
     * This method when ran prints String with info of person
     */
    public void introduce(){
        System.out.println(this.toString());
    }

}

