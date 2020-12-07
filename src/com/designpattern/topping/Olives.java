package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Olives extends Decorator {
  private Pizza pizza;

  public Olives(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Olives";
  }

  public double cost() {
    return 4 + pizza.cost();
  }
}
