package day11;
public class CustomExceptionEx {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(15, 3);
            System.out.println("Result of the two given numbers are: " + result);
        } catch (RuntimeException e) {

            try {
                throw new CustomException("Divide by zero error occurred in this try block");
            } catch (CustomException customException) {
                System.out.println("Caught the CustomException is : " + customException.getMessage());
            }
        }
    }
    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }

}
