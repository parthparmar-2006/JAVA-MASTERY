package Constructor;

public class SmartLight {
    private String brand;
    private int brightness;
    private String color;
    private boolean on;

    public SmartLight() {
        this("Generic", 50, "White", false);
    }

    public SmartLight(String brand, String color) {
        this(brand, 80, color, true);;
    }

    public SmartLight(String brand, int brightness, String color, boolean on) {
        setBrand(brand);
        setBrightness(brightness);
        setColor(color);
        setIsOn(on);
    }

    public String getBrand() {
        return brand;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    } 

    public boolean isOn() {
        return on;
    }

    public void setBrand(String brand) {
        if ("Philips".equals(brand) || "Wipro".equals(brand) || "Syska".equals(brand)) this.brand = brand;
        else this.brand = "Unknown";
    }

    public void setBrightness(int brightness) {
        if (brightness>=0 && brightness<=100) this.brightness = brightness;
        else {
            this.brightness = 0;
            System.err.println("Brightness cannot be " + brightness + "%!");
        }
    }

    public void setColor(String color) {
        if ("White".equals(color) || "Warm".equals(color) || "RGB".equals(color)) this.color = color;
        else {
            this.color = "Unknown";
            System.err.println("Color " + color + " is invalid!");
        }
    }

    public void setIsOn(boolean on) {
        this.on = on;
    }

    public void displayStatus() {
        System.out.println("--- Device Status ---");
        System.out.println("Brand: " + brand);
        System.out.println("Brightness: " + brightness + "%");
        System.out.println("Color: " + color);
        System.out.println("on: " + (on ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        SmartLight l1 = new SmartLight();
        SmartLight l2 = new SmartLight("Philips", "RGB");
        SmartLight l3 = new SmartLight("Wipro", -20, "Red", true);
        SmartLight l4 = new SmartLight("Sony", 70, "White", true);

        l1.displayStatus();
        l2.displayStatus();
        l3.displayStatus();
        l4.displayStatus();
    }
}
