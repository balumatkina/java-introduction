public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(25));
        System.out.println(convertToCentimeters(5,8));
    }

    public static double convertToCentimeters(int heightInches) {
        return (double) heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int remainHeightInches) {
        return convertToCentimeters(((heightFeet * 12) + remainHeightInches));
    }
}
