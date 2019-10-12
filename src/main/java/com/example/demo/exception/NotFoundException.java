package com.example.demo.exception;

public class NotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  private String name;

  public NotFoundException(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
