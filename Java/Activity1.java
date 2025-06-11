package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car honda = new Car("Black", "Manual", 2014);
        honda.displayCharacteristics();
        honda.accelerate();
        honda.brake();
    }
}
