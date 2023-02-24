public class Fish extends Animal {
    private int fins;
    private int gills;

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveBackFins() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed.equals("fast")) moveBackFins();
        System.out.println(); //EXTENDED
    }

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
