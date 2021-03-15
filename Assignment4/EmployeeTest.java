/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This is a test class for Employee class that includes the main
 * We test the functionality of the method implemented on the to compute total pay and testing its exception handling for incorrect inputs
 *
 */
class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Smith", 101, 35.00);

        System.out.println("$" + Math.round(employee1.computePay(40)));
        System.out.println("$" + Math.round(employee1.computePay(23)));
        System.out.println("$" + Math.round(employee1.computePay(1)));
        System.out.println("$" + Math.round(employee1.computePay(0)));
        System.out.println(Math.round(employee1.computePay(-5)));
        System.out.println(Math.round(employee1.computePay(45)));
    }
}
