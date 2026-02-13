final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// class Car extends Vehicle {Error: cannot inherit from final class
// }

public class final3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}
