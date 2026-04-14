package durgasirpractise.oopspractise.java.ConstructorPractice.FactoryMethodPractice;

public class MainImplement {
    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.createVehicle("CAR");
        Vehicle v2= VehicleFactory.createVehicle("bike");

    }
}
