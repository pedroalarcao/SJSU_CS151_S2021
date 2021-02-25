/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Student class consists of private variables for information of a student
 * Each variable has a setter and a getter method
 * Within the Student class, we have a nested non-static class called Course
 * Within Course we have one non-static method witch prints a schedule for a the Student class
 *
 *
 */

class Student {

    /**
     * firstName the first name of student
     */
    private String firstName;

    /**
     * lastName the last name of student
     */
    private String lastName;

    /**
     * age the age of student
     */
    private int age;

    /**
     * gpa the gpa of student
     */
    private double gpa;

    /**
     * major the major of student
     */
    private String major;

    /**
     * department the department of student
     */
    private String department;

    /**
     * This constructs a Student with default values hard coded by author
     */
    public Student(){
        this.firstName = "Thomas";
        this.lastName = "Hobbes";
        this.age = 433;
        this.gpa = 3.8;
        this.major = "Philosophy";
        this.department = "Arts & Sciences";
    }

    /**
     *
     * This constructs a Student with with a specified first name, last name, age, gpa, major, and department
     * @param firstName the first name of student
     * @param lastName the last name of student
     * @param age the age of the student
     * @param gpa the gpa of the student
     * @param major the major of the student
     * @param department the department of the student
     */
    public Student(String firstName, String lastName, int age, double gpa, String major, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }


    /**
     * This returns the current first name of this Student
     * @return this Student's first name
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     *
     * @param firstName the first name of student
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * This returns the current last name of the Student
     * @return this Student's last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     *
     * @param lastName the last name of student
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * This returns the current age of the Student
     * @return this Student's age
     */
    public int getAge(){
        return age;
    }

    /**
     *
     * @param age the age of the student
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * This returns the current gpa of the Student
     * @return this Student's gpa
     */
    public double getGpa(){
        return gpa;
    }

    /**
     *
     * @param gpa the gpa of the student
     */
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    /**
     * This returns the current major of the Student
     * @return this Student's major
     */
    public String getMajor(){
        return major;
    }

    /**
     *
     * @param major the major of the student
     */
    public void setMajor(String major){
        this.major = major;
    }

    /**
     * This returns the current department of the Student
     * @return this Student's department
     */
    public String getDepartment(){
        return department;
    }

    /**
     *
     * @param department the department of the student
     */
    public void setDepartment(String department){
        this.department = department;
    }


    /**
     * Nested non-static class with one method that prints a message
     */
    class Course{

        /**
         * This method when called prints this current Student first name, last name, and major with a default schedule hard coded by author
         */
        void printSchedule(){
            System.out.println("Student Name: " + getFirstName() + " " + getLastName() + '\n' +
                    "Major: " + getMajor() + '\n' +
                    "Class Schedule: " + '\n' +
                    "CS146 Mon/Wed 3-4:15" + '\n' + "CS151 Mon/Wed 9-10:15" + '\n' + "PHIL100 Tues/Thur 1-2:15" + '\n' + "CS123 Tues/Thus 6-7:15");
        }
    }
}
