package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Onions extends Decorator {
  private Pizza pizza;

  public Onions(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Onions";
  }

  public double cost() {
    return 3 + pizza.cost();
  }
}
