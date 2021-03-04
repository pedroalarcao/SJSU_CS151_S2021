/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This abstract FullTimeEmployee class extends Employee class and consists of private variables for information of an FullTimeEmployee
 * Each variable has a setter and a getter method
 *
 */
abstract class FullTimeEmployee extends Employee{

    /**
     * Double basepay for FullTime employee
     */
    Double basePay;

    /**
     * default constructor
     */
    public FullTimeEmployee() {

    }

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name for FullTime employee
     * @param lastName  the last name for FullTime employee
     * @param address   the address for FullTime employee
     * @param id   the id for FullTime employee
     * @param ssn   the ssn for FullTime employee
     * @param age   the age for FullTime employee
     * @param basePay base pay for FullTime employee
     */
    public FullTimeEmployee(String firstName, String lastName, Address address, String ssn, int age, int id, Double basePay) {
        super(firstName, lastName, address, ssn, age, id);
        this.basePay = basePay;
    }

    /**
     * Getter for basepay for FullTime employee
     * @return Double basePay
     */
    public Double getBasePay() {
        return basePay;
    }

    /**
     * Setter for basepay for FullTime employee
     * @param basePay basepay for FullTime employee
     */
    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }
}
