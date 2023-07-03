package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
public class TraverseAllTypes {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ravi Kannegundla");
        arrayList.add("UNT");
        arrayList.add("Denton");

        //  loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            String element = arrayList.get(i);
            System.out.println(element);
        }

        System.out.println();

        // enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        System.out.println();

        // iterator
        System.out.println("Using iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println();

        // forEach
        System.out.println("Using forEach:");
        arrayList.forEach(element -> System.out.println(element));

        System.out.println();

        //  parallel Stream
        System.out.println("Using parallel Stream:");
        AtomicInteger index = new AtomicInteger(0);
        Stream<String> stream = arrayList.parallelStream();
        stream.forEachOrdered(element -> System.out.println(index.getAndIncrement() + ": " + element));
    }

}
