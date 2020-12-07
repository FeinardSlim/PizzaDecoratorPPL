package com.designpattern.pizza;

public class AmericanPizza extends Pizza {
  public AmericanPizza() {
    description = "American Pizza";
  }

  public double cost() {
    if (this.size == Size.STANDARD) {
      return 2.0;
    } else if (this.size == Size.DELUXE) {
      return 2.5;
    } else if (this.size == Size.JUMBO) {
      return 3.0;
    } else
      return 0;
  }
}
