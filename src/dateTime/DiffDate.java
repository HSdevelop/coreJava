package dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author HS
 */
public class DiffDate {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate MyBirthday = LocalDate.of(1988, Month.APRIL, 3);

        Period period = Period.between(MyBirthday, today);
        long myDays = ChronoUnit.DAYS.between(MyBirthday, today);
        System.out.println(period);
        System.out.println(myDays);
        String result = String.format("%s years, %s month, %s deys", period.getYears(),period.getMonths(),period.getDays());
        System.out.println(result);
    }

}
