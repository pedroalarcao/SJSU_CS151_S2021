/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This class contains the main
 */

class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("John", "Smith", 20, 3.6,
                "Computer Science", "School of Computer Science");

        Student.Course schedule = student.new Course();

        schedule.printSchedule();
    }
}
