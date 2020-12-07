package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Mushrooms extends Decorator {
  private Pizza pizza;

  public Mushrooms(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Mushrooms";
  }

  public double cost() {
    return 3 + pizza.cost();
  }
}
