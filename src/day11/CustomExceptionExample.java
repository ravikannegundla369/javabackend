package day11;

// Main program
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulating a runtime exception
            int result = divideNumbers(15, 3);
            System.out.println("Result: " + result);
        } catch (RuntimeException e) {
            // Catching the runtime exception and converting it into CustomException
            try {
                throw new CustomException("Divide by zero error occurred");
            } catch (CustomException customException) {
                System.out.println("Caught CustomException: " + customException.getMessage());
            }
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }


}
