package day08;
import java.io.*;
public class Csv {
    public static void main(String[] args) {
        File csvFile = new File("D:\\assignements\\javaWorkspace\\Project1\\src\\day08\\lastnamedata.csv");
        String line;
        String cvsSplitBy = ",";

        Student[] students = new Student[10];

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                String firstName = data[0];
                String lastName = data[1];
                double gpa = Double.parseDouble(data[2]);
                Student student = new Student(firstName, lastName, gpa);
                students[count] = student;
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            Student student = students[i];
            System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getGpa());
        }
    }


}
