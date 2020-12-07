package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Peppers extends Decorator {
  private Pizza pizza;

  public Peppers(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Peppers";
  }

  public double cost() {
    return 2 + pizza.cost();
  }
}
