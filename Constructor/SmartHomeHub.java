package Constructor;

public class SmartHomeHub {
    private String name;
    private static SmartHomeHub instance;

    private SmartHomeHub() {
        this.name = "Default Hub";
    }

    public static SmartHomeHub getInstance() {
        if (instance == null) {
            instance = new SmartHomeHub();
        } 
        return instance;
    }

    public void setName(String name) { 
        this.name = name; 
    }
    
    public String getName() { 
        return name; 
    }

    public static void main(String[] args) {
        SmartHomeHub hub1 = SmartHomeHub.getInstance();
        SmartHomeHub hub2 = SmartHomeHub.getInstance();

        hub1.setName("Custom Hub");

        System.out.println("Hub 1 Name: " + hub1.getName());
        System.out.println("Hub 2 Name: " + hub2.getName());

        System.out.println("Are hub1 and hub2 pointing to same location? " + (hub1 == hub2));
    }
}