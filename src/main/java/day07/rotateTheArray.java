package day07;
import java.util.Arrays;
public class rotateTheArray {
    public  void rotateLeft(int[] array, int x) {
        int n = array.length;
        x = x % n;
        reverse(array, 0, x - 1);
        reverse(array, x, n - 1);
        reverse(array, 0, n - 1);
    }

    public  void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] orginalarray = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;
        System.out.println("Original Array is: " + Arrays.toString(orginalarray));
        rotateTheArray obj =new rotateTheArray();
        obj.rotateLeft(orginalarray, x);
        System.out.println("Final Rotated Array is : " + Arrays.toString(orginalarray));
    }

}
