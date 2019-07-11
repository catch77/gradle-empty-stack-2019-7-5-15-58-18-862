public abstract class Mobile {

    private String name;
    private String color;
    private String brand;

    public Mobile() {}

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void makeACall(String msg) {
        System.out.println("Message : "+msg);
    }

    public void printProperty() {
        System.out.println("name: ["+name+"], color: ["+color+"], brand: ["+brand+"]");
    }

    public abstract void limitMsg();
}
