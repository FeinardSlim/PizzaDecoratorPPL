package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Tuna extends Decorator {
  private Pizza pizza;

  public Tuna(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Tuna";
  }

  public double cost() {
    return 4 + pizza.cost();
  }
}
