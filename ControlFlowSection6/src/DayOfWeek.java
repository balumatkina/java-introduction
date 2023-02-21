public class DayOfWeek {
    public static void main(String[] args) {
        printDayOfWeek(6);
        printWeekDay(6);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println("printDayOfWeek: The number of the day is " + day + " and the day is " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfTheWeek;
        if (day == 0) dayOfTheWeek = "Sunday";
        else if (day == 1) dayOfTheWeek = "Monday";
        else if (day == 2) dayOfTheWeek = "Tuesday";
        else if (day == 3) dayOfTheWeek = "Wednesday";
        else if (day == 4) dayOfTheWeek = "Thursday";
        else if (day == 5) dayOfTheWeek = "Friday";
        else if (day == 6) dayOfTheWeek = "Saturday";
        else dayOfTheWeek = "Invalid Day";
        System.out.println("printWeekDay: The number of the day is " + day + " and the day is " + dayOfTheWeek);
    }

}
