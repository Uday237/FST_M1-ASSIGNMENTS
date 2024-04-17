package activities;

public class car {
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    car() {
        tyres = 4;
        doors = 4;
    }

    //methods
    public void displaycharacterics() {
        System.out.println("color of the car:" + color);
        System.out.println("Make of the car: " + make);
        System.out.println("Transmission of the car is" + transmission);
        System.out.println("Number of doors" + doors);
        System.out.println("Number of tyres on the car" + tyres);

    }

    public void accelerate() {
        System.out.println("Car is moving forward");

    }

    public void brake() {
        System.out.println("Car is stopped.");

    }
}
