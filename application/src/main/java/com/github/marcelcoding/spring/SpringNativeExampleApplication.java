package com.github.marcelcoding.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.marcelcoding.spring.library.TestService;

@SpringBootApplication
public class SpringNativeExampleApplication implements CommandLineRunner {

  private final TestService testService;

  public SpringNativeExampleApplication(final TestService testService) {
    this.testService = testService;
  }

  public static void main(final String[] args) {
    SpringApplication.run(SpringNativeExampleApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(this.testService.helloWorld());
  }
}
