/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Contractor class extends Employee class and consists of private variables for information of an Contractor
 * Each variable has a setter and a getter method
 * We have a method that shows values for Contractor
 * A method to calculate the total pay for Contractor
 *
 */

class Contractor extends Employee{

    /**
     * Double basepay for Contractor
     */
    Double basePay;

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of Contractor
     * @param lastName  the last name of Contractor
     * @param address   the address of the Contractor
     * @param id the id of the Contractor
     * @param basePay the base pay for Contractor
     * @param age the age for Contractor
     * @param ssn the ssn for Contractor
     */
    public Contractor(String firstName, String lastName, Address address, String ssn, int age, int id, Double basePay) {
        super(firstName, lastName, address, ssn, age, id);
        this.basePay = basePay;
    }

    /**
     * Getter for the base pay for Contractor
     * @return Double basePay
     */
    public Double getBasePay() {
        return basePay;
    }

    /**
     * Setter for the base pay for Contractor
     * @param basePay the base pay for Contractor
     */
    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    /**
     * Overriden method of the default toString method
     * @return A string for PartTime employee attributes
     */
    @Override
    public String toString() {
        return super.toString() + '\n' + "Hourly Pay: $" + Math.round(getBasePay());
    }

    /**
     * Method that run this toString
     */
    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    /**
     * Method computes total pay depending of numHours
     * @param numHrs number of hours worked
     * @return Double total pay for Contractor
     */
    public Double computePay(int numHrs){
        return getBasePay() * numHrs;
    }
}
