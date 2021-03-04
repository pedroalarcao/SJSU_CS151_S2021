/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Executive class extends Employee class and consists of private variables for information of an Executive
 * Each variable has a setter and a getter method
 * We have a method that shows values for executive
 * A method to calculate the total salary for executive
 *
 */
class Executive extends Employee {

    /**
     *
     */
    Double yearlyBonus;

    /**
     *
     */
    Double yearlyCompensation;

    /**
     * The default constructor
     */
    public Executive() {

    }
    /**
     * This constructs a Executive with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of Executive
     * @param lastName  the last name of Executive
     * @param address   the address of the Executive
     * @param id    the id of the Executive
     * @param ssn the ssn of the Executive
     * @param age the age of the Executive
     * @param yearlyBonus the yearly bonus Executive
     * @param yearlyCompensation the yearly comp Executive
     */
    public Executive(String firstName, String lastName, Address address, String ssn, int age, int id, Double yearlyCompensation, Double yearlyBonus) {
        super(firstName, lastName, address, ssn, age, id);
        this.yearlyBonus = yearlyBonus;
        this.yearlyCompensation = yearlyCompensation;
    }

    /**
     * Getter for the yearly bonus Executive
     * @return Double yearlyBonus the yearly bonus Executive
     */
    public Double getYearlyBonus() {
        return yearlyBonus;
    }

    /**
     * Getter for the yearly comp Executive
     * @return Double yearlyCompensation the yearly comp Executive
     */
    public Double getYearlyCompensation() {
        return yearlyCompensation;
    }

    /**
     * Setter for the yearly bonus Executive
     * @param yearlyBonus the yearly bonus Executive
     */
    public void setYearlyBonus(Double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    /**
     * Setter for the yearly comp Executive
     * @param yearlyCompensation the yearly comp Executive
     */
    public void setYearlyCompensation(Double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }

    /**
     * Overriden method of the default toString method
     * @return A string for Executive attributes
     */
    @Override
    public String toString() {
        return super.toString() + '\n' + "Yearly Bonus: $" + Math.round(getYearlyBonus()) + '\n' + "Yearly Salary: $" + Math.round(getYearlyCompensation())
                + '\n' + "Yearly Total: $" + Math.round(this.computePay()) + " " + '\n';
    }

    /**
     * Method that run this toString
     */
    @Override
    public void introduce() {
        System.out.println(this.toString());
    }

    /**
     * Method that computes the yearly total comp
     * @return Double yearly total comp
     */
    public Double computePay(){
        return (getYearlyCompensation() + getYearlyBonus());
    }
}
