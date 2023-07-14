public class Rocket {
    int id;
    String name;
    int capacity;
    
    public void ignite() {
        System.out.println("Rocket " + name + " ignited");
    }
    
    public void launch() {
        System.out.println("Rocket " + name + " launched");
    }
}
