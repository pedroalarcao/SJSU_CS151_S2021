/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Employee class and consists of private variables for information of an Employee
 * Each variable has a setter and a getter method
 */

class Employee {

    /**
     * firstName the first name of employee
     */
    private String firstName;

    /**
     * lastName the last name of employee
     */
    private String lastName;
    /**
     * id of the Employee
     */
    private int id;

    /**
     * the pay of the Employee
     */
    private Double hourlyPay;

    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of Employee
     * @param lastName  the last name of Employee
     * @param id    the id of the Employee
     * @param hourlyPay the pay of the Employee
     */
    public Employee(String firstName, String lastName, int id, Double hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPay = hourlyPay;
        this.id = id;
    }

    /**
     * Getter for firstName
     * @return String firstName the first name of employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for firstName
     * @param firstName firstName the first name of employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for lastName
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter for lastName
     * @param lastName lastName the last name of employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for hourlyPay
     * @return Double the pay of the Employee
     */
    public Double getHourlyPay() {
        return hourlyPay;
    }

    /**
     * Setter for hourlyPay
     * @param hourlyPay the pay of the Employee
     */
    public void setHourlyPay(Double hourlyPay) {
        this.hourlyPay = hourlyPay;
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
     * Setter for the id of the Employee
     * @param id the id of the Employee
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method computes the total pay of the employee depending on the amount of hours worked.
     * It will throw exception if condition for overtime or incorrect format for input is given
     * @param numHrs int number of hours employee has worked
     * @return double for total pay due to employee
     */
    public double computePay(int numHrs){
        try {
            if (numHrs > 40)
                throw new TooManyHoursWorkedException("Too many hours inputted - User Input: ");
            if (numHrs < 0)
                throw new NumberFormatException("Negative number inputted not allowed - User Input: ");
            else
                return Math.round(numHrs*getHourlyPay());
        }catch (NumberFormatException e) {
            System.out.print(e);
            return Math.round(numHrs);
        }catch (TooManyHoursWorkedException e){
            System.out.print(e);
            return Math.round(numHrs);
        }
    }

}

/**
 * Custom class for Exception handling for overtime to be used in Employee class
 */
class TooManyHoursWorkedException extends Exception{
    TooManyHoursWorkedException(String s){
        super(s);
    }
}
