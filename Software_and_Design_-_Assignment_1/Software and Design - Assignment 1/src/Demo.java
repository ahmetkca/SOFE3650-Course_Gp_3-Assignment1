import java.util.Random;

public class Demo {

    public static final Random random = new Random();

    private static Manufacturer ManufacturerConfiguration(String manufacturerType) throws Exception {
        AbstractVehiclePartsFactory factory;
        Manufacturer manufacturer;

        if (manufacturerType.equalsIgnoreCase("car")){
            factory = new CarPartsFactory();
            manufacturer = new Manufacturer(factory);
        }
        else if(manufacturerType.equalsIgnoreCase("plane")){
            factory = new PlanePartsFactory();
            manufacturer = new Manufacturer(factory);
        }
        else {
            throw new Exception("Provide type of the manufacturer");
        }

        return manufacturer;
    }

    public static void main(String[] args) {

        try {
            String[] types = {"car", "plane"};
            int selection = random.nextInt(types.length);
            Manufacturer manufacturer = ManufacturerConfiguration(types[selection]);

            System.out.println("Engine Test: " + manufacturer.isTestEngineSuccessful());
            System.out.println("Lights Test: " + manufacturer.isTestLightsSuccessful());
        }
        catch (Exception E){
            System.out.println(E);
        }
    }
}
