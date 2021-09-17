public class CarEngine implements Engine{

    private String name;

    public CarEngine(){
        this.name = "Car Engine";
    }

    @Override
    public boolean start() {
        System.out.println(this.name + ": Engine has started.");
        return true;
    }

    @Override
    public boolean stop() {
        System.out.println(this.name + ": Engine has stopped.");
        return true;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
