package day16;

import java.util.ArrayList;
public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> arrayListOld = new ArrayList<>();
        arrayListOld.add("Ravi");
        arrayListOld.add("Kannegundla");
        arrayListOld.add("UNT");
        arrayListOld.add("Denton");
        String[] arraynew = arrayListOld.toArray(new String[arrayListOld.size()]);

        for (String element : arraynew) {
            System.out.println(element);
        }
    }

}
