package Java8features;


import java.util.Optional;

public class OptionalUpperCase {

    public static Optional<String> toUpperCase(Optional<String> optionalString) {
        if (optionalString.isPresent()) {
            String str = optionalString.get();
            return Optional.of(str.toUpperCase());
        } else {
            return Optional.empty();
        }
    }



    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Ravi kannegundla");
        Optional<String> uppercaseOptional = OptionalUpperCase.toUpperCase(optionalString);

        if (uppercaseOptional.isPresent()) {
            String uppercaseString = uppercaseOptional.get();
            System.out.println("Uppercase: " + uppercaseString);
        } else {
            System.out.println("Input Optional is empty.");
        }
    }

}
