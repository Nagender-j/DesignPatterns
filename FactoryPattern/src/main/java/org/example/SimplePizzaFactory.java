package org.example;

import org.example.Models.Pizza.*;

public class SimplePizzaFactory {
    Pizza pizza;
    Pizza createPizza(String type) {
        switch(type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new RuntimeException(String.format("%s , is not a valid type ", type));
        }
        return pizza;
    }
}
