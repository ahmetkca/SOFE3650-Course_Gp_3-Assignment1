public class CarLights implements Lights{
    private String name;

    public CarLights(){
        this.name = "Car Lights";
    }

    @Override
    public boolean on() {
        System.out.println(this.name + ": Lights are on.");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println(this.name + ": Lights are off.");
        return true;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
