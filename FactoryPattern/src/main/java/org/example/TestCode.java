package org.example;

import org.example.Models.Pizza.Pizza;

public class TestCode {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("pizza created  by using factory of type : "+ pizza.getClass().getSimpleName());

        System.out.println("\n");
        pizza = pizzaStore.orderPizza("clam");
        System.out.println(String.format("pizza created of type : %s by using factory\n", pizza.getClass().getSimpleName()));


        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(String.format("pizza created of type : %s by using factory\n", pizza.getClass().getSimpleName()));

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(String.format("pizza created of type : %s by using factory\n", pizza.getClass().getSimpleName()));

        try{
            pizza = pizzaStore.orderPizza("invalid"); // raises exception
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}