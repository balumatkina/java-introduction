public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("Do you have to wake up? => " + shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23) return (barking && (hourOfDay < 8 || hourOfDay > 22)) ? true : false;
        else return false;
    }
}
