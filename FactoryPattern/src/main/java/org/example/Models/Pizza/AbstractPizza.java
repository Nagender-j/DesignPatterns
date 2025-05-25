package org.example.Models.Pizza;

public abstract class AbstractPizza implements Pizza {
   @Override
    public void prepare() {
       System.out.println("Preparing");
    }


}
