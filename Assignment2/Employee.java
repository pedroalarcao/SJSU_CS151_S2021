/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Employee class is a child of Person class consists of private variables for information of an employee
 * Each variable has a setter and a getter method
 * We have a method that shows values for employee
 * A method that calculate
 *
 */

class Employee extends Person{

    /**
     * id the badge work id of Employee
     */
    private int id;

    /**
     * status the status of work of Employee
     */
    private String status;

    /**
     * basePay the salary or pay of Employee
     */
    private Double basePay;


    /**
     * This constructs a Employee with with a specified first name, last name, age, weight, gender, ssn, address, id, basepay, status
     *
     * @param firstName the first name of Employee
     * @param lastName  the last name of Employee
     * @param age       the age of the Employee
     * @param ssn       the ssn of the Employee
     * @param address   the address of the Employee
     * @param gender    the gender of the Employee
     * @param weight    the weight of the Employee
     * @param basePay   the salary or pay of Employee
     * @param id        the id of work of Employee
     * @param status    the badge work id of Employee
     */
    public Employee(String firstName, String lastName, int age, String ssn, String address, String gender, double weight, int id, String status, Double basePay) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }

    /**
     * This returns the current
     * @return
     */
    public int getID(){
        return id;
    }

    /**
     * This returns the current
     * @return
     */
    public String getStatus(){
        return status;
    }

    /**
     * This returns the current
     * @return
     */
    public Double getBasePay(){
        return basePay;
    }

    /**
     *
     * @param id badge work id of Employee
     */
    public void setID(int id){
        this.id = id;
    }

    /**
     *
     * @param status the status of work of Employee
     */
    public void setStatus(String status){
        this.status = status;
    }

    /**
     *
     * @param basePay the salary or pay of Employee
     */
    public void setBasePay(Double basePay){
        this.basePay = basePay;
    }

    /**
     * This method overrides the introduce method of Person with extra formatting and logic for Employee
     */
    @Override
    public void introduce(){
        System.out.println("First name: " + getFirstName() + '\n' + "Last name: " + getLastName() + '\n' +
                "Age: " + getAge() + '\n' + "SSN: " + getSSN() + '\n' + "Address: " + getAddress() + '\n' +
                "Gender: " + getGender() + '\n' + "Weight: " + getWeight() + '\n' +
                "Employee ID: " + getID() + '\n' + "Employee Status: " + getStatus());
        if(getStatus().equals("full time") || getStatus().equals("Full time") || getStatus().equals("full-time") || getStatus().equals("Full-time")){
            System.out.println("Employee Base Pay: $" + Math.round(getBasePay()) + "/yr");
        }
        else{
            System.out.println("Employee Base Pay: $" + Math.round(getBasePay()) + "/hr");
        }

    }

    /**
     * This method checks logic for status of employee and then returns the amount of pay due for employee
     * @param unitsWorked this variable is set by user for the amount of time that the worker has worked
     * @return double value for amount of pay is due for employee
     */
    public Double calculatePay(Double unitsWorked){
        if (getStatus().equals("full time") || getStatus().equals("Full time") || getStatus().equals("full-time") || getStatus().equals("Full-time")){
            return ((getBasePay()/52)*unitsWorked);
        }
        if(getStatus().equals("part time") || getStatus().equals("Part time") || getStatus().equals("part-time") || getStatus().equals("Part-time") ||
                getStatus().equals("contractor") || getStatus().equals("Contractor")){
            return (getBasePay()*unitsWorked);
        }
        else{
            return 0.0;
        }
    }
}
