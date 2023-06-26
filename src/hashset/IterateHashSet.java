package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        hset.add("one");
        hset.add("two");
        hset.add("three");
        hset.add("four");
        hset.add("five");
        hset.add("six");
        hset.add("seven");
        hset.add("eight");
        hset.add("nine");
        hset.add("ten");

        // Iterating using Iterator
        System.out.println("Iteration using Iterator:");
        Iterator<String> iterator = hset.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }




        // Iterating using forEach loop
        System.out.println("\nIteration using forEach loop:");
        for (String element : hset) {
            System.out.println(element);
        }




        // Iterating using Streams forEach
        System.out.println("\nIteration using Streams forEach:");
        hset.stream().forEach(System.out::println);
    }

}
