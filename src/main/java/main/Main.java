package main;

import main.car.CarBuilder;

public class Main {
    public static void main(String[] args) {
        var toyota = new CarBuilder()
                .setModel("Toyota Safari")
                .setColor("Green")
                .setDescription("Shit-looking made for safari expedition")
                .build();
        System.out.println(toyota);

        var saab = new CarBuilder()
                .setModel("Saab 9000")
                .setColor("Black")
                .setDescription("Brutal-looking death vehicle made for hunting down criminals")
                .build();
        System.out.println(saab);
    }
}
