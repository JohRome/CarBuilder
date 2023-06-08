package main.car;

public class CarBuilder {
    private String model;
    private String color;
    private String description;

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    public CarBuilder setDescription(String description) {
        this.description = description;
        return this;
    }
    public Car build() {
        return new Car(model, color, description);
    }

}
