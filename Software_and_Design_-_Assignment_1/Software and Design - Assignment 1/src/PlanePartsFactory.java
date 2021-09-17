public class PlanePartsFactory implements AbstractVehiclePartsFactory{
    @Override
    public Engine createEngine() {
        System.out.println("Created a new Plane Engine.");
        return new PlaneEngine();
    }

    @Override
    public Lights createLights() {
        System.out.println("Created new Plane Lights.");
        return new PlaneLights();
    }
}
