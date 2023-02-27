public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("starting index = " + startingIndex);
        System.out.println("birth year = " + birthDate.substring(startingIndex));
        System.out.println("month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(15));

        System.out.println("ABC\n".repeat(3).indent(5));
        System.out.println("-".repeat(15));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(15));

        System.out.println(System.getProperty("java.version"));
    }
}
