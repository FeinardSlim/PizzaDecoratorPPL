package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Cheese extends Decorator {
  private Pizza pizza;

  public Cheese(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Cheese";
  }

  public double cost() {
    return 1 + pizza.cost();
  }
}
