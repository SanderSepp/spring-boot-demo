package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.NotFoundException;

@RestController
public class MainController {

  @Value("${spring.application.name}")
  private String name;

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @GetMapping("/name")
  public String name() {
    return name;
  }

  @GetMapping("/exception")
  public String exception() {
    throw new NotFoundException("dayum");
  }
}
