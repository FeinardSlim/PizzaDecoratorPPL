package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Bacon extends Decorator {
  private Pizza pizza;

  public Bacon(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Bacon";
  }

  public double cost() {
    return 5 + pizza.cost();
  }
}
