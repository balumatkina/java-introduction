public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println("Kilometers to miles: " + toMilesPerHour(75.114));
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour * 0.622);
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h = "
                + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
