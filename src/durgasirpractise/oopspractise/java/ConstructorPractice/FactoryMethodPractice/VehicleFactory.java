package durgasirpractise.oopspractise.java.ConstructorPractice.FactoryMethodPractice;

public class VehicleFactory {

    /**
     * @param vehicle
     * @return Vehicle(Interface)
     * we don't know what type of vechile client want so here we can create both car object  bike object as return.
     */
    public static Vehicle createVehicle(String vehicle){
        if(vehicle.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if (vehicle.equalsIgnoreCase("bike")){

            return new Bike();
        }
        return null;

    }
}
