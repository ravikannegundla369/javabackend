package day16;
import java.util.ArrayList;
public class StudentGpa {
    public static void main(String[] args) {

        ArrayList<Student> newstudentList = new ArrayList<>();
        newstudentList.add(new Student("Ravi", "kannegundla", 3.8));
        newstudentList.add(new Student("naveen", "K", 4.0));
        newstudentList.add(new Student("Rahul", "M", 3.5));
        newstudentList.add(new Student("kamal", "R", 3.9));
        newstudentList.add(new Student("sai", "kumar", 3.6));

        double sum = 0;
        for (Student student : newstudentList) {
            sum += student.getGpa();
        }
        double averageGPA = sum / newstudentList.size();
        newstudentList.removeIf(student -> student.getGpa() < averageGPA);
        for (Student student : newstudentList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", GPA: " + student.getGpa());
        }
    }

}
