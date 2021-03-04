/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This FullTimeHourly class extends FullTimeEmployee class and consists of private variables for information of an FullTimeHourly
 * Each variable has a setter and a getter method
 * We have a method that shows values for FullTimeHourly
 * A method to calculate the total pay for FullTimeHourly
 *
 */

class FullTimeHourly extends FullTimeEmployee {

    /**
     * Double overtimePay overtime base pay of the FullTimeHourly employee
     */
    Double overtimePay;

    /**
     * default constructor
     */
    public FullTimeHourly() {

    }

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of FullTimeHourly employee
     * @param lastName  the last name of FullTimeHourly employee
     * @param address   the address of the FullTimeHourly employee
     * @param id the id of the FullTimeHourly employee
     * @param basePay the base pay of the FullTimeHourly employee
     * @param ssn the ssn of the FullTimeHourly employee
     * @param age the age of the FullTimeHourly employee
     * @param overtimePay the overtime base pay of the FullTimeHourly employee
     */
    public FullTimeHourly(String firstName, String lastName, Address address, String ssn, int age, int id, Double basePay, Double overtimePay) {
        super(firstName, lastName, address, ssn, age, id, basePay);
        this.overtimePay = overtimePay;
    }

    /**
     * Getter for the overtime base pay of the FullTimeHourly employee
     * @return Double the overtime base pay of the FullTimeHourly employee
     */
    public Double getOvertimePay() {
        return overtimePay;
    }

    /**
     * Setter for the overtime base pay of the FullTimeHourly employee
     * @param overtimePay the overtime base pay of the FullTimeHourly employee
     */
    public void setOvertimePay(Double overtimePay) {
        this.overtimePay = overtimePay;
    }

    /**
     * Overriden method of the default toString method
     * @return A string for PartTime employee attributes
     */
    @Override
    public String toString() {
        return super.toString() + '\n' + "Overtime Pay: $" + Math.round(getOvertimePay());
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
     * @return Double total pay for FullTimeHourly employee
     */
    public Double computePay(int numHrs){
        if (numHrs > 40){
            return (double) (Math.round((getBasePay() * 40) + getOvertimePay() * (numHrs - 40)));
        }
        else{
            return (double) (Math.round(getBasePay() * numHrs));
        }
    }
}
