public class PlaneLights implements Lights{
    private String name;

    public PlaneLights(){
        this.name = "Plane Lights";
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
