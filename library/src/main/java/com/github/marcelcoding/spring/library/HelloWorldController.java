package com.github.marcelcoding.spring.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping
  private String get() {
    return "Hello World";
  }
}
