
class Vehicle extends Object { // a Vehicle is an object
    public String toString () {return "Vehicle"; }
}
class Car extends Vehicle { // a car is a vehicle
     public String toString () { return "Car"; }
}

class Boat extends Vehicle{ } // a boat is-a vehicle
class Saloon extends Car {} // a Saloon is a car, a Saloon is a vehicle
class Convertible extends Car {} // a Convertible is a car, a Convertible is a vehicle

public class Inheritance {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        System.out.println(v.toString());
        Boat b = new Boat();
        System.out.println();
    }
}
