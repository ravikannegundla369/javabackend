package Java8features;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dates {

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2022, 3, 15));
        dates.add(LocalDate.of(2023, 6, 30));
        dates.add(LocalDate.of(2021, 12, 1));
        dates.add(LocalDate.of(2005, 11, 14));
        dates.add(LocalDate.of(2007, 02, 4));


        LocalDate earliestDate = findEarliestDate(dates);
        LocalDate latestDate = findLatestDate(dates);

        System.out.println("Earliest Date: " + earliestDate);
        System.out.println("Latest Date: " + latestDate);
    }

    public static LocalDate findEarliestDate(List<LocalDate> dates) {
        LocalDate earliestDate = null;

        for (LocalDate date : dates) {
            if (earliestDate == null || date.isBefore(earliestDate)) {
                earliestDate = date;
            }
        }

        return earliestDate;
    }

    public static LocalDate findLatestDate(List<LocalDate> dates) {
        LocalDate latestDate = null;

        for (LocalDate date : dates) {
            if (latestDate == null || date.isAfter(latestDate)) {
                latestDate = date;
            }
        }

        return latestDate;
    }

}
