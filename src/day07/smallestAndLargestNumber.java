package day07;
public class smallestAndLargestNumber {
    public static void main(String[] args) {

        int[] arraynumbers = {15, 89, 453, 41, 77, 2};
        int largestnumber = arraynumbers[0];
        int smallestnumber = arraynumbers[0];

        for (int i = 1; i < arraynumbers.length; i++) {
            if (arraynumbers[i] > largestnumber) {
                largestnumber = arraynumbers[i];
            }
            if (arraynumbers[i] < smallestnumber) {
                smallestnumber = arraynumbers[i];
            }
        }
        System.out.println("Largest number in the array is : " + largestnumber);
        System.out.println("Smallest number in the array is : " + smallestnumber);
    }

}
