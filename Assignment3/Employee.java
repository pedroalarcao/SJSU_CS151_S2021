/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This abstract Employee class extends Person class and consists of private variables for information of an Employee
 * Each variable has a setter and a getter method
 */
abstract class Employee extends Person{

    /**
     * id of the Employee
     */
    private int id;

    /**
     * the edu lvl of the Employee
     */
    private String educationLevel;

    /**
     * the boolean value for direct deposit of the Employee
     */
    private boolean directDeposit;


    /**
     * Default constructor
     */
    public Employee() {

    }

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of Employee
     * @param lastName  the last name of Employee
     * @param address   the address of the Employee
     * @param id    the id of the Employee
     * @param ssn the ssn of the Employee
     * @param age the age of the Employee
     */
    public Employee(String firstName, String lastName, Address address, String ssn, int age, int id) {
        super(firstName, lastName, address, ssn, age);
        this.id = id;
    }

    /**
     * This returns the current id of this Employee
     *
     * @return int this Employee ID
     */
    public int getId() {
        return id;
    }

    /**
     * This returns the current edu lvl of this Employee
     *
     * @return String this Employee education lvl
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * This returns the boolean value ofr direct deposit of this Employee
     *
     * @return boolean value ofr direct deposit of this Employee
     */
    public boolean isDirectDeposit() {
        return directDeposit;
    }

    /**
     * Setter for the id of the Employee
     * @param id the id of the Employee
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setter the edu lvl of the Employee
     * @param educationLevel the edu lvl of the Employee
     */
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * Setter for the boolean value for direct deposit of the Employee
     * @param directDeposit the boolean value for direct deposit of the Employee
     */
    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }
}
