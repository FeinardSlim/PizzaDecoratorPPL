package com.designpattern.pizza;

public class NewYorkerPizza extends Pizza {
  public NewYorkerPizza() {
    description = "New Yorker Pizza";
  }

  public double cost() {
    if (this.size == Size.STANDARD) {
      return 3.5;
    } else if (this.size == Size.DELUXE) {
      return 4.0;
    } else if (this.size == Size.JUMBO) {
      return 4.5;
    } else
      return 0;
  }
}
