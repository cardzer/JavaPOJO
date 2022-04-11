package basic.JavaPOJOs;

public class Vehicle {
    private String make;
    private String colour;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(String make, String colour, String model) {
        this.make = make;
        this.colour = colour;
        this.model = model;
    }
}
