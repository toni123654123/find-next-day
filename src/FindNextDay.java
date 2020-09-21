public class FindNextDay {
    public static int nextDay(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31)
                    return 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30)
                    return 1;
                break;
            case 2:
                if (isLeapYear( year)) {
                    if(day == 29){
                        day=1;
                    return day;}

                }else if (day == 28) {
                    return 1;
                }
        }
        return day + 1;

    }
    public static int nextMonth( int day, int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31)
                    month +=1;
                break;
            case 12:
                if (day == 31)
                month = 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30)
                    month = month + 1;
                break;
            case 2:
                if (isLeapYear(year)) {
                    if(day == 29)
                    month += 1;
                    break;
                }else if (day == 28) {
                    month += 1;
                    return month;
                }

        }
        return month;
    }
    public static boolean isLeapYear(int year){
        boolean isDivisibleBy4 = year % 4 ==0;

        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year %100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400){
                    return true;
                }
            }else {
                return true;
            }
        }
        return false;
    }
    public static int nextYear(int day, int month, int year){
        if (day==31){
            if (month==12){
                year+=1;
            }
        }return year;
    }
}
