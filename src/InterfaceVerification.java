interface Vehicle {
    int noOfWheels();
    double engineCapacity();
}

//Aish team
class Bike implements Vehicle {
    public int noOfWheels() {
        return 2;
    }

    @Override
    public double engineCapacity() {
        return 100;
    }

    public double sideStandLength() {
        return 2.0;
    }
}

//Elamathi team
class Car implements Vehicle {

    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public double engineCapacity() {
        return 1600;
    }
}

//Charu Team
public class InterfaceVerification {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println("No of wheels for the given vehicle is " + bike.noOfWheels());
        System.out.println("No of wheels for the given vehicle is " + bike.sideStandLength());

        Vehicle car = new Car();
        System.out.println("No of wheels for the given vehicle is " + car.noOfWheels());
        System.out.println("No of wheels for the given vehicle is " + car.engineCapacity());
    }
}




