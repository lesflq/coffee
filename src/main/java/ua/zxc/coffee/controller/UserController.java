package ua.zxc.coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/cars")
public class UserController {

  private static final Random RANDOM = new Random();

  @GetMapping
  public int getCars() {
    return RANDOM.nextInt();
  }
}
