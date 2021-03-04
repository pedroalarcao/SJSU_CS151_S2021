/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This FullTimeSalaried class extends FullTimeEmployee class and consists of private variables for information of an FullTimeSalaried
 * We have a method that shows values for FullTimeSalaried
 * A method to calculate the total pay for FullTimeSalaried
 *
 */
class FullTimeSalaried extends FullTimeEmployee{

    /**
     * default constructor
     */
    public FullTimeSalaried() {

    }

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of FullTimeSalaried employee
     * @param lastName  the last name of FullTimeSalaried employee
     * @param address   the address of the FullTimeSalaried employee
     * @param id the id of the FullTimeSalaried employee
     * @param basePay the base pay of the FullTimeSalaried employee
     * @param age the age of the FullTimeSalaried employee
     * @param ssn the ssn of the FullTimeSalaried employee
     */
    public FullTimeSalaried(String firstName, String lastName, Address address, String ssn, int age, int id, Double basePay) {
        super(firstName, lastName, address, ssn, age, id, basePay);
    }

    /**
     * Overriden method of the default toString method
     * @return String A string for PartTime employee attributes
     */
    @Override
    public String toString() {
        return super.toString() + '\n' + "Salary: $" + Math.round(getBasePay());
    }

    /**
     * Method that run this toString
     */
    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    /**
     * Method computes total pay depending of numWeeks
     * @param numWeeks number of hours worked
     * @return Double total pay for FullTimeSalaried employee
     */
    public Double computePay(int numWeeks){
        return (Double.valueOf(Math.round(getBasePay()/52)*numWeeks));
    }
}
