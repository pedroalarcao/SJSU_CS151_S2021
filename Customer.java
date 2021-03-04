
/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Customer class extends Person class and consists of private variables for information of an Customer
 * We have a method that shows values for Customer
 * A method to show Customer preferred method of payment
 *
 */
class Customer extends Person{

    private int customerID;
    private String payPreference;


    /**
     * This constructs a Person with with a specified first name, last name, age, weight, gender, ssn, and address
     *
     * @param firstName the first name of Customer
     * @param lastName  the last name of Customer
     * @param address   the address of the Customer
     * @param ssn the ssn of the Customer
     * @param age the age of the Customer
     * @param customerID the id of the Customer
     * @param payPreference the pay preference of the Customer
     */
    public Customer(String firstName, String lastName, Address address, String ssn, int age, int customerID, String payPreference) {
        super(firstName, lastName, address, ssn, age);
        this.customerID = customerID;
        this.payPreference = payPreference;
    }

    /**
     * Getter for customerID the id of the Customer
     * @return customerID the id of the Customer
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     *
     * @return String payPreference the pay preference of the Customer
     */
    public String getPayPreference() {
        return payPreference;
    }

    /**
     * Setter for customerID the id of the Customer
     * @param customerID customerID the id of the Customer
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     *
     * @param payPreference
     */
    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }

    /**
     * This method overrides the default toString method
     * @return String with info this Person
     */
    @Override
    public String toString() {
        return "Type: " + getClass().getName()  + '\n' + "First name: " + getFirstName() + '\n' + "Last name: " + getLastName() + '\n' +
                "Age: " + getAge() + '\n' + "Address: " + getAddress() + '\n' + "Customer ID: " + getCustomerID() + '\n' + "Payment preference: " + this.getPayPreference() + " " + '\n';
    }

    /**
     * This method when ran prints String with info of person
     */
    public void introduce() {
        System.out.println(this.toString());
    }

    /**
     * This method shows customers prefered payment method
     */
    public void makePayment(){
        System.out.println("Payment preference: " + this.getPayPreference());
    }
}
