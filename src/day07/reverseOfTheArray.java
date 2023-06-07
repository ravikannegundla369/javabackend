package day07;

import java.util.Arrays;

public class reverseOfTheArray {
    public void reverseArray(int[] array)
    {
        for (int i = 0; i < array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
        public static void main(String[] args) {
            int[] arraynumbers = {15, 24, 354, 455, 5454};
            System.out.println("Original Array is: " + Arrays.toString(arraynumbers));
            reverseOfTheArray obj=new reverseOfTheArray();
            obj.reverseArray(arraynumbers);
            System.out.println("Reversed Array is : " + Arrays.toString(arraynumbers));
        }
}
