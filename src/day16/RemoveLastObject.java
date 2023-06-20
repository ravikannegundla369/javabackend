package day16;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ravi");
        arrayList.add("Kannegundla");
        arrayList.add("UNT");
        arrayList.add("Denton");

        System.out.println("Before removal: " + arrayList);
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }

        System.out.println("After removal: " + arrayList);
    }

}
