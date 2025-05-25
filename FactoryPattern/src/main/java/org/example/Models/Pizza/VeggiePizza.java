package org.example.Models.Pizza;

public class VeggiePizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("Preparing VeggiePizza...");
    }
    @Override
    public void bake() {
        System.out.println("baking VeggiePizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting VeggiePizza...");
    }

    @Override
    public void box() {
        System.out.println("boxing VeggiePizza...");
    }
}
