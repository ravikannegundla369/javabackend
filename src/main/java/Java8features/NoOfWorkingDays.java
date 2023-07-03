package Java8features;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NoOfWorkingDays {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 01);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        int workingDays = calculateWorkingDays(startDate, endDate);

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }

    public static int calculateWorkingDays(LocalDate startDate, LocalDate endDate) {
        int workingDays = 0;
        LocalDate currentDate = startDate;

        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workingDays;
    }


}
