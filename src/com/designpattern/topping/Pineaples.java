package com.designpattern.topping;

import com.designpattern.pizza.Pizza;

public class Pineaples extends Decorator {
  private Pizza pizza;

  public Pineaples(Pizza pizza) {
    this.pizza = pizza;
  }

  public String getDescription() {
    return pizza.getDescription() + ", Pineaples";
  }

  public double cost() {
    return 2 + pizza.cost();
  }
}
