package main.car;

public class Car {
    private final String model;
    private final String color;
    private final String description;

    Car(String model, String color, String description) {
        this.model = model;
        this.color = color;
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  "\nModel: " + getModel() +
                "\nColor: " + getColor() +
                "\nDescription: " + getDescription();
    }
}
