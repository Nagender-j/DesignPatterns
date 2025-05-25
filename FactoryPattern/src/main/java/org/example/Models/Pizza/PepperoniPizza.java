package org.example.Models.Pizza;

public class PepperoniPizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("Preparing PepperoniPizza...");
    }
    @Override
    public void bake() {
        System.out.println("baking PepperoniPizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting PepperoniPizza...");
    }

    @Override
    public void box() {
        System.out.println("boxing PepperoniPizza...");
    }
}
