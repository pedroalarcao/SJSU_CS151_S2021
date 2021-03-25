/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Course class consists of private variables for information of a Course
 * Each variable has a setter and a getter method
 *
 */
class Course {

    /**
     * String courseName the course name
     */
    private String courseName;
    /**
     * String courseDescription the course description
     */
    private String courseDescription;
    /**
     * String department the course department
     */
    private String department;
    /**
     * String courseStartTime the course start time
     */
    private String courseStartTime;
    /**
     * String courseDay the course start day
     */
    private String courseDay;

    /**
     * This constructs a Course with a specified courne name, description, department, start time, and day
     * @param courseName the course name
     * @param courseDescription the course description
     * @param department the course department
     * @param courseStartTime the course start time
     * @param courseDay the course start day
     */
    public Course(String courseName, String courseDescription, String department, String courseStartTime, String courseDay) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.courseStartTime = courseStartTime;
        this.courseDay = courseDay;
    }

    /**
     * Getter for courseName
     * @return String courseName the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * setter for String courseName the course name
     * @param courseName String courseName the course name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Getter for courseDescription
     * @return String courseDescription the course description
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * Setter for courseDescription
     * @param courseDescription String courseDescription the course description
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * Getter for department
     * @return String department the course department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Setter for department
     * @param department String department the course department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter for courseStartTime
     * @return String courseStartTime the course start time
     */
    public String getCourseStartTime() {
        return courseStartTime;
    }

    /**
     * Setter for courseStartTime
     * @param courseStartTime String courseStartTime the course start time
     */
    public void setCourseStartTime(String courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    /**
     * Getter for courseDay
     * @return String courseDay the course start day
     */
    public String getCourseDay() {
        return courseDay;
    }

    /**
     * Setter for courseDay
     * @param courseDay String courseDay the course start day
     */
    public void setCourseDay(String courseDay) {
        this.courseDay = courseDay;
    }

    /**
     * Overriden default toString method that run printInfo method
     * @return printInfo String
     */
    @Override
    public String toString() {
        return printInfo();
    }

    /**
     * this method returns info from Course object
     * @return String with info for Course object
     */
    String printInfo(){

        return "Course Name: " + getCourseName() + '\n' +
                "Course Description: " + getCourseDescription() + '\n' +
                "Course Department: " + getDepartment() + '\n' +
                "Course Day: " + getCourseDay() + '\n' +
                "Course Time: " + getCourseStartTime() + '\n';
    }
}
