package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Pepperoni extends Decorator {
  private Pizza pizza;

  public Pepperoni(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Pepperoni";
  }

  public double cost() {
    return 4 + pizza.cost();
  }
}
