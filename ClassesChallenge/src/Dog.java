public class Dog extends Animal {

    public String earShape;
    public String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    private void bark() {
        System.out.println("Woof!");
    }

    private void run() {
        System.out.println("Dog is running");
    }

    private void walk() {
        System.out.println("Dog is walking");
    }

    private void wagTail() {
        System.out.println("The tail is wagging");
    }

    public void makeNoise() {
        if (type == "Wolf") System.out.println("Ow Wooooo!");
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
