/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This class contains the main for Employee class and run a test for all methods in employee
 */

class EmployeeTest {

    public static void main(String[] args) {


        Employee joeSmith = new Employee("Joe", "Smith", 30, "111-11-1111", "2121 El camino real", "Male", 80.0,
                111, "Contractor", 60.00);
        joeSmith.introduce();
        System.out.println("Employee Compensation: $" + Math.round(joeSmith.calculatePay((double) 30)) + '\n');



        Employee lisaGray = new Employee("Lisa", "Smith", 20, "222-22-2222", "1521 Lago st", "Female", 120.0,
                222, "Full time", 110000.00);
        lisaGray.introduce();
        System.out.println("Employee Compensation: $" + Math.round(lisaGray.calculatePay((double) 2)) + '\n');



        Employee timothyBriggs = new Employee("Timothy", "Briggs", 40, "333-33-3333", "5700 NE 22nd", "Male", 200.0,
                333, "Full time", 80000.00);
        timothyBriggs.introduce();
        System.out.println("Employee Compensation: $" + Math.round(timothyBriggs.calculatePay((double) 4)) + '\n');



        Employee georgeWallace = new Employee("George", "Wallace", 18, "444-44-4444", "1336 Rosita ave", "Male", 170.0,
                444, "Part time", 20.0);
        georgeWallace.introduce();
        System.out.println("Employee Compensation: $" + Math.round(georgeWallace.calculatePay((double) 25)) + '\n');



        Employee amyStudent = new Employee("Amy", "Student", 19, "555-55-5555", "201 Del Norte dr", "Female", 130.0,
                555, "Contractor", 45.0);
        amyStudent.introduce();
        System.out.println("Employee Compensation: $" + Math.round(amyStudent.calculatePay((double) 45)) + '\n');

    }

}
