import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDayTest {
    @Test
    void testfindDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int expected = 2;
        int result = FindNextDay.nextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testfinDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 2;
        int resultDay = FindNextDay.nextDay(day, month, year);
        int resultMonth = FindNextDay.nextMonth(day, month, year);
        assertEquals(expectedDay, resultDay);
        assertEquals(expectedMonth, resultMonth);
    }
    @Test
    void testfinDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 5;
        int resultDay = FindNextDay.nextDay(day, month, year);
        int resultMonth = FindNextDay.nextMonth(day, month, year);
        assertEquals(expectedDay, resultDay);
        assertEquals(expectedMonth, resultMonth);
    }
    @Test
    void testfinDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 3;
        int resultDay = FindNextDay.nextDay(day, month, year);
        int resultMonth = FindNextDay.nextMonth(day, month, year);
        assertEquals(expectedDay, resultDay);
        assertEquals(expectedMonth, resultMonth);
    }
    @Test
    void testfinDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int expectedDay = 1;
        int expectedMonth = 3;
        int resultDay = FindNextDay.nextDay(day, month, year);
        int resultMonth = FindNextDay.nextMonth(day, month, year);
        assertEquals(expectedDay, resultDay);
        assertEquals(expectedMonth, resultMonth);

    }
    @Test
    void testfinDay5() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 1;
        int expectedYear = 2019;
        int resultDay = FindNextDay.nextDay(day, month, year);
        int resultMonth = FindNextDay.nextMonth(day, month, year);
        int resultYear = FindNextDay.nextYear(day,month, year);
        assertEquals(expectedDay, resultDay);
        assertEquals(expectedMonth, resultMonth);
        assertEquals(expectedYear, resultYear);
    }
}
