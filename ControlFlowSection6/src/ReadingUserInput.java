import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi, " + name + ", nice to meet you on this course!");

        String yearOfBirth = System.console().readLine("Could you tell me what year were you born? ");
        int age = currentYear - Integer.parseInt(yearOfBirth);
        return "So you are " + age + " years old, great!";
//        це можна запустити лише з терміналу
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + ", nice to meet you on this course!");

        System.out.println("Could you tell me what year were you born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125)
                    + " and <=" + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters aren't allowed here.");
            }
        } while (!validDOB);
        return "So you are " + age + " years old, great!";
    }

    public static int checkData(int currentYear, String yearOfBirth) {
        int dob = Integer.parseInt(yearOfBirth);
        int minYear = currentYear - 125;

        if ((dob < minYear) || (dob > currentYear)) {
            return -1;
        }
        return currentYear - dob;
    }
}
