package org.javafeatures.java12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpressionTester {
    public static void main(String[] args)
    {
        //Synatax before JAVA 12
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";

        // JAVA 12 Syntax
            typeOfDay = switch (dayOfWeek) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
                case SATURDAY, SUNDAY -> "Day Off";
            };

        }
    }
}
