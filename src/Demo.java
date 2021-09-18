import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    private static Database database;
    public static final Random random = new Random();

    private static Manufacturer ManufacturerConfiguration(String manufacturerType) throws Exception {
        AbstractVehiclePartsFactory factory;
        Manufacturer manufacturer;



        if (manufacturerType.equalsIgnoreCase("car")){
            factory = new CarPartsFactory();
            manufacturer = new Manufacturer(factory);
            for (String[] vehiclePart : database.getDB()) {
                if (vehiclePart[0].equalsIgnoreCase("car")) {
                    if (vehiclePart[1].equalsIgnoreCase("engine")) {
                        manufacturer.getEngine().setName(vehiclePart[2]);
                        manufacturer.getEngine().setPrice(Float.parseFloat(vehiclePart[3]));
                    } else if (vehiclePart[1].equalsIgnoreCase("lights")) {
                        manufacturer.getLights().setName(vehiclePart[2]);
                        manufacturer.getLights().setPrice(Float.parseFloat(vehiclePart[3]));
                    }

                }
            }


        }
        else if(manufacturerType.equalsIgnoreCase("plane")){
            factory = new PlanePartsFactory();
            manufacturer = new Manufacturer(factory);
            for (String[] vehiclePart : database.getDB()) {
                if (vehiclePart[0].equalsIgnoreCase("plane")) {
                    if (vehiclePart[1].equalsIgnoreCase("engine")) {
                        manufacturer.getEngine().setName(vehiclePart[2]);
                        manufacturer.getEngine().setPrice(Float.parseFloat(vehiclePart[3]));
                    } else if (vehiclePart[1].equalsIgnoreCase("lights")) {
                        manufacturer.getLights().setName(vehiclePart[2]);
                        manufacturer.getLights().setPrice(Float.parseFloat(vehiclePart[3]));
                    }

                }
            }
        }
        else {
            throw new Exception("Provide type of the manufacturer");
        }

        return manufacturer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try {
            database = new Database();
        } catch (java.io.IOException E) {
            System.out.println(E);
        }
        try {
            String[] types = {"car", "plane"};
            System.out.println("Factory Types: ");
            int i = 1;
            for (String factoryType : types) {
                System.out.println(i+ " - " +factoryType);
                i++;
            }
            System.out.print("Select one: ");
            int factoryType = sc.nextInt();
//            int selection = random.nextInt(types.length);
            Manufacturer manufacturer = ManufacturerConfiguration(types[factoryType-1]);

            manufacturer.displayVehicleParts();
            System.out.println("Engine Test: " + manufacturer.isTestEngineSuccessful());
            System.out.println("Lights Test: " + manufacturer.isTestLightsSuccessful());
        }
        catch (Exception E){
            System.out.println(E);
        }
    }
}
