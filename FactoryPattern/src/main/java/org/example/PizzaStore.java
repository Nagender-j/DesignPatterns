package org.example;

import org.example.Models.Pizza.*;

public class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = null;
        // object instantiation logic based on type given
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

        // above switch case is a variable part in the method , so better to keep it outside of this class

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
