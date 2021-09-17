public class Manufacturer {
    private Engine engine;
    private Lights lights;

    public Manufacturer(AbstractVehiclePartsFactory factory){
        engine = factory.createEngine();
        lights = factory.createLights();
    }

    public boolean isTestEngineSuccessful(){
        System.out.println("Engine Test Commencing...");
        boolean testStart = engine.start();
        boolean testStop = engine.stop();

        boolean success = testStart && testStop;

        return success;
    }

    public boolean isTestLightsSuccessful(){
        System.out.println("Engine Test Commencing...");
        boolean testOn = lights.on();
        boolean testOff = lights.off();

        boolean success = testOn && testOff;

        return success;
    }
}
