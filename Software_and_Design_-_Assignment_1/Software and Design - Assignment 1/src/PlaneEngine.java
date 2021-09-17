public class PlaneEngine implements Engine{
    private String name;

    public PlaneEngine(){
        this.name = "Plane Engine";
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
