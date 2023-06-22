package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return GPA;
    }

    public static void main(String[] args) {
        // Create the HashMap of Student objects
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add 8 Student objects to the HashMap
        studentMap.put("ravi", new Student("ravi", "kannegundla", 3.8));
        studentMap.put("kamal", new Student("kamal", "S", 3.9));
        studentMap.put("ajay", new Student("ajay", "K", 3.7));
        studentMap.put("vivek", new Student("vivel", "K", 4.0));
        studentMap.put("teju", new Student("teju", "J", 3.5));
        studentMap.put("priya", new Student("priya", "P", 3.6));
        studentMap.put("siri", new Student("siri", "P", 3.2));
        studentMap.put("sujith", new Student("sujith", "J", 3.4));

        // Print the HashMap using Entry Set
        System.out.println("Printing using Entry Set:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();

        // Print the HashMap using map's forEach method
        System.out.println("Printing using map's forEach method:");
        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println();

        // Print the HashMap using keySet and Iterator
        System.out.println("Printing using keySet and Iterator:");
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
        }
    }



}
