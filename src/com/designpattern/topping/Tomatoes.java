package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Tomatoes extends Decorator {
  private Pizza pizza;

  public Tomatoes(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Tomatoes";
  }

  public double cost() {
    return 1 + pizza.cost();
  }

}
