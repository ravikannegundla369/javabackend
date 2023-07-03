package Java8features;

import java.time.LocalDate;
import java.time.Period;

public class Age {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1997, 10, 13);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);

        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days");
    }

}
