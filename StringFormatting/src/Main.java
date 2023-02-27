import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello world!";
        printInformation(helloWorld);
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("world"));
        System.out.printf("last index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l'));
        System.out.printf("last index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) System.out.println("Values match exactly");
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) System.out.println("Values match ignoring case");
        if (helloWorld.startsWith("Hello")) System.out.println("String starts with Hello");
        if (helloWorld.endsWith("!")) System.out.println("String ends with !");
        if (helloWorld.contains("world")) System.out.println("String contains world");
        if (helloWorld.contentEquals(helloWorldLower)) System.out.println("Values match exactly");

    }

    public static void printInformation(String string) {
        int stringLength = string.length();
        System.out.printf("Length = %d %n", stringLength);
        if (string.isEmpty()) {
            System.out.println("The string is empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("The string is blank");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(stringLength - 1));
    }
}
