package Java8features;

import java.util.Optional;

public class EmptyOptional {

    public static Optional<Integer> calculateTheLengthOfString(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            int length = input.length();
            return Optional.of(length);
        }
    }




    public static void main(String[] args) {
        String input = "Ravi Kannegundla";
        Optional<Integer> lengthOptional = EmptyOptional.calculateTheLengthOfString(input);

        if (lengthOptional.isPresent()) {
            int length = lengthOptional.get();
            System.out.println("Length is : " + length);
        } else {
            System.out.println("Input string is null.");
        }
    }

}
