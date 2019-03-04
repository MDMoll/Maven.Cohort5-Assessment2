package rocks.zipcode.assessment2.collections;

import java.time.*;
import java.util.*;
import java.text.DateFormatSymbols;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName   - name of month
     */

    public Map<Integer, String> monthMap = new TreeMap<>();

    public void add(Integer monthNumber, String monthName) {
        monthMap.put(monthNumber, monthName);
    }

    private int getMonthNumber(String monthName) {
        return Month.valueOf(monthName.toUpperCase()).getValue();
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String result = "";
        try {
            result = new DateFormatSymbols().getMonths()[monthNumber - 1];

        } catch (java.lang.IllegalArgumentException e) {
            result = null;
        }
        return result;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return getMonthNumber(monthName);
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthMap.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName   - name of month
     */
    public void update(Integer monthNumber, String monthName) {
    }
}
