import java.util.*;

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
class Student{

    /**
     * type LinkedList<Course> variable courses, which is the course info for Student
     */
    private LinkedList<Course> courses;

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
     * @param courses type LinkedList<Course> variable courses, which is the course info for Student
     */
    public Student(String firstName, String lastName, int age, double gpa, String major, String department, LinkedList<Course> courses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
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
     * Getter for courses
     * @return LinkedList<Course></> object
     */
    public LinkedList<Course> getCourses() {
        return courses;
    }

    /**
     * Setter for courses
     * @param courses
     */
    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    /**
     * This method adds a course object to LinkedList courses
     * @param course type Course
     */
    public void addCourse(Course course){
        courses.add(course);
    }

    /**
     * This method removes a course object to LinkedList courses
     * @param course type Course
     */
    public void removeCourse(Course course){
        courses.remove(course);
    }

    /**
     * This method sorts and prints info from courses Linked list depending on attribute and ascending or descending order
     * @param ascending boolean type for setting sort and print of info in ascending order or descending
     * @param attribute String type for which atribute from Course obj to sort by
     */
    void sortCourse(boolean ascending, String attribute){
        if(attribute.equalsIgnoreCase("CourseName")){
            courses.sort(new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    return o1.getCourseName().compareTo(o2.getCourseName());
                }
            });
        }
        else if(attribute.equalsIgnoreCase("CourseDescription")){
            courses.sort(new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    return o1.getCourseDescription().compareTo(o2.getCourseDescription());
                }
            });
        }
        else if(attribute.equalsIgnoreCase("CourseStartTime")) {
            courses.sort(new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    return o1.getCourseStartTime().compareTo(o2.getCourseStartTime());
                }
            });
        }
        else if (attribute.equalsIgnoreCase("CourseDay")){
            courses.sort(new Comparator<Course>() {
                @Override
                public int compare(Course o1, Course o2) {
                    return o1.getCourseDay().compareTo(o2.getCourseDay());
                }
            });
        }

        if (ascending == false){
            Collections.reverse(courses);
        }

        Iterator iterator = courses.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
