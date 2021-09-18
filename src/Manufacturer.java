public class Manufacturer {
    private Engine engine;
    private Lights lights;

    public Manufacturer(AbstractVehiclePartsFactory factory){
        engine = factory.createEngine();
        lights = factory.createLights();
    }

    public Engine getEngine() {
        return engine;
    }

    public Lights getLights() {
        return lights;
    }

    public boolean isTestEngineSuccessful(){
        System.out.println("Engine Test Commencing...");
        boolean testStart = engine.start();
        boolean testStop = engine.stop();

        return testStart && testStop;
    }

    public boolean isTestLightsSuccessful(){
        System.out.println("Lights Test Commencing...");
        boolean testOn = lights.on();
        boolean testOff = lights.off();

        return testOn && testOff;
    }

    public void displayVehicleParts() {
        System.out.println("Engine: ");
        System.out.println(engine);
        System.out.println("Lights: ");
        System.out.println(lights);
    }
}
