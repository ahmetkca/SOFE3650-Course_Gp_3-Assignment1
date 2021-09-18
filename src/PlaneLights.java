public class PlaneLights implements Lights{
    private String name;
    private float price;

    public PlaneLights(){
        this.name = "[PLACEHOLDER] Plane Lights";
        this.price = -1;
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
        return "Name: " + this.name + "\tPrice: " + this.price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}
