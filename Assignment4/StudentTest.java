/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This is a test class for Student class and Course class that includes the main
 * We test the functionality of the clone method implemented on the Student class and the Course class
 * There's also a try catch block for exception handling
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science",
                "School of Computer Science", new Course("CS151", "Object Oriented Design and Programming",
                "CS", "6:00pm", "Tue"));

        Student student2 = null;

        try{
            student2 = (Student) student1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        student1.printInfo();
        student2.printInfo();

        student2.setCourse("PHIL100", "Intro to Philosophy");

        student1.printInfo();
        student2.printInfo();

        Course course1 = new Course("CS123A", "Bioinformatics", "CS", "10am", "Tue");
        Course course2 = null;

        try{
            course2 = (Course) course1.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println(course1.getCourseName());
        System.out.println(course2.getCourseName());

        course2.setCourseName("CS146");

        System.out.println(course1.getCourseName());
        System.out.println(course2.getCourseName());
    }
}
