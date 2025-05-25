package org.example.Models.Pizza;

public class CheesePizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza...");
    }
    @Override
    public void bake() {
        System.out.println("baking CheesePizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting CheesePizza...");
    }

    @Override
    public void box() {
        System.out.println("boxing CheesePizza...");
    }
}
