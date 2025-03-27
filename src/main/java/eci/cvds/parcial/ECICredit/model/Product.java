package eci.cvds.parcial.ECICredit.model;

public class Product {

    private String name;
    private int value;
    private int amount;

    public Product(String nombre, int value, int amount) {
        this.name = nombre;
        this.value = value;
        this.amount = amount;
    }

    public int getTotalValue() {
        return value * amount;
    }
}
