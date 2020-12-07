package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Chicken extends Decorator {
  private Pizza pizza;

  public Chicken(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Chicken";
  }

  public double cost() {
    return 5 + pizza.cost();
  }
}
