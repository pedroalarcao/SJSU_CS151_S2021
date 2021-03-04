/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This PartTimeHourly class extends Employee class and consists of private variables for information of an PartTimeHourly
 * Each variable has a setter and a getter method
 * We have a method that shows values for PartTimeHourly
 * A method to calculate the total pay for PartTimeHourly
 *
 */
class PartTimeHourly extends Employee{

    /**
     * Double base hourly pay for PartTime employee
     */
    Double baseHourlyPay;

    /**
     * default constructor
     */
    public PartTimeHourly() {

    }

    /**
     * This constructs a artTime employee with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of artTime employee
     * @param lastName  the last name of artTime employee
     * @param address   the address of the artTime employee
     * @param id    the id of the artTime employee
     * @param ssn the ssn of the artTime employee
     * @param age the age of the artTime employee
     * @param baseHourlyPay  base hourly pay for PartTime employee
     */
    public PartTimeHourly(String firstName, String lastName, Address address, String ssn, int age, int id, Double baseHourlyPay) {
        super(firstName, lastName, address, ssn, age, id);
        this.baseHourlyPay = baseHourlyPay;
    }

    /**
     * Getter for base hourly pay for PartTime employee
     * @return Double baseHourlyPay
     */
    public Double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    /**
     * Setter for base hourly pay for PartTime employee
     * @param baseHourlyPay
     */
    public void setBaseHourlyPay(Double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    /**
     * Overriden method of the default toString method
     * @return A string for PartTime employee attributes
     */
    @Override
    public String toString() {
        return super.toString() + '\n' + "Hourly Pay: $" + Math.round(getBaseHourlyPay());
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
     * @return Double total pay for Parttime employee
     */
    public Double computePay(int numHrs){
        if (numHrs > 40){
            return -1.0;
        }
        else{
            return Double.valueOf((Math.round(getBaseHourlyPay()*numHrs)));
        }

    }
}
