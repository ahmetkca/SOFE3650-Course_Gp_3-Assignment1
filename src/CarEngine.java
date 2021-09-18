public class CarEngine implements Engine{

    private String name;
    private float price;

    public CarEngine(){
        this.name = "[PLACEHOLDER] Car Engine";
        this.price = -1;
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
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\tPrice: " + this.price;
    }
}
