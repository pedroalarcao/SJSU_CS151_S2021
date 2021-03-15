/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Student class implements Cloneable and consists of private variables for information of an Student
 * Each variable has a setter and a getter method
 * We instantiate a Course object to be used as a variable for Student
 * Here we implement the and override the method clone from interface Cloneable
 * There's a method that prints all the info from this Student class
 *
 */
class Student implements Cloneable{

    /**
     * type Course variable course, which is the course info for Student
     */
    private Course course;

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
     *
     * This constructs a Student with with a specified first name, last name, age, gpa, major, and department
     * @param firstName the first name of student
     * @param lastName the last name of student
     * @param age the age of the student
     * @param gpa the gpa of the student
     * @param major the major of the student
     * @param department the department of the student
     */
    public Student(String firstName, String lastName, int age, double gpa, String major, String department, Course course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
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
     * Setter for multiple variables to modify from the Course class
     * @param courseName String courseName the course name
     * @param courseDescription String courseDescription the course description
     */
    public void setCourse(String courseName, String courseDescription){
        this.course.setCourseName(courseName);
        this.course.setCourseDescription(courseDescription);

    }

    /**
     * Clones or deep copies instance of student (different reference address therefore we could modify without modifying cloned instance)
     * @return student Type Student
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }

    /**
     * prints info about Student instance
     */
    void printInfo(){
        System.out.println("Student Name: " + getFirstName() + " " + getLastName() + '\n' +
                "Age: " + getAge() + '\n' +
                "GPA: " + getGpa() + '\n' +
                "Major: " + getMajor() + '\n' +
                "Department: " + getDepartment() + '\n' +
                "Class Schedule: " + course.getCourseName() + ", " +
                course.getCourseDescription() + ", " + course.getDepartment() + '\n' +
                course.getCourseStartTime() + ", " + course.getCourseDay() + '\n');
    }
}
