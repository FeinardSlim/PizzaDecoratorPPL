package com.designpattern.pizza;

public abstract class Pizza {
  String description = "Unknown Pizza";
  Size size;

  public enum Size {
    STANDARD, DELUXE, JUMBO
  }

  public String getDescription() {
    return description;
  }

  public abstract double cost();

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

}
