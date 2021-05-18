/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This abstract Person class consists of private variables for information of a person
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
    private Address address;

    public Person() {

    }

    /**
     * This constructs a Person with with a specified first name, last name, age, ssn, and address
     *
     * @param firstName the first name of Person
     * @param lastName  the last name of Person
     * @param address   the address of the Person
     *
     *
     */
    public Person(String firstName, String lastName, Address address, String ssn, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(address.getStreetNum(), address.getStreetName(), address.getCity(), address.getZip(), address.getState());
        this.ssn = ssn;
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
     * This returns the current ssn of the Person
     *
     * @return String this Person's ssn
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
     * This returns the current address of the Person
     *
     * @return Address this Person's address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address of the Person
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * This method overrides the default toString method
     * @return String with info this Person
     */

    public String toString(){
        return "Type: " + getClass().getName()  + '\n' + "First name: " + getFirstName() + '\n' + "Last name: " + getLastName() + '\n' +
                "Age: " + getAge() + '\n';
    }

    /**
     * This method when ran prints String with info of person
     */
    public void introduce(){
        System.out.println(this.toString());
    }

}

