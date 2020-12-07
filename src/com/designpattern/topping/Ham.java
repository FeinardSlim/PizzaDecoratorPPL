package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Ham extends Decorator {
  private Pizza pizza;

  public Ham(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Ham";
  }

  public double cost() {
    return 5 + pizza.cost();
  }
}
