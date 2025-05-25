package org.example.Models.Pizza;

public class ClamPizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("Preparing ClamPizza...");
    }
    @Override
    public void bake() {
        System.out.println("baking ClamPizza...");
    }

    @Override
    public void cut() {
        System.out.println("cutting ClamPizza...");
    }

    @Override
    public void box() {
        System.out.println("boxing ClamPizza...");
    }
}
