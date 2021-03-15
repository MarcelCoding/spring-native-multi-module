package com.github.marcelcoding.spring.library;

import io.netty.channel.epoll.Epoll;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

  @Bean
  CommandLineRunner runner(){
    return args -> System.out.println("Epoll: " + Epoll.isAvailable());
  }
}
