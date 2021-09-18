public class CarPartsFactory implements AbstractVehiclePartsFactory{
    @Override
    public Engine createEngine() {
        System.out.println("Created a new Car Engine.");
        return new CarEngine();
    }

    @Override
    public Lights createLights() {
        System.out.println("Created new Car Lights.");

        return new CarLights();
    }


}
