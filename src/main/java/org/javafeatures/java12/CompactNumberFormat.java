package org.javafeatures.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {
    public static void main(String[] args)
    {
        NumberFormat fmtLong
                = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.LONG);

        System.out.println(fmtLong.format(100));
        System.out.println(fmtLong.format(1000));
        System.out.println(fmtLong.format(10000));

        System.out.println("...............................");

        NumberFormat fmtShort
                = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.SHORT);

        System.out.println(fmtShort.format(100));
        System.out.println(fmtShort.format(1000));
        System.out.println(fmtShort.format(10000));
    }
}
