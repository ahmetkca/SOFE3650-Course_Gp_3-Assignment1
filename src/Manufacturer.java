public class Manufacturer {
    private Engine engine;
    private Lights lights;

    public Manufacturer(AbstractVehiclePartsFactory factory){
        engine = factory.createEngine();
        lights = factory.createLights();





//        engine.setName("Engine1");
//        engine.setPrice(99.56f);
//
//        lights.setName("Lights1");
//        lights.setPrice(.0999f);
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
