package ua.zxc.coffee.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AsleepTask {

  private static final String ATTEN = "https://attenbot.onrender.com/api/users";

  @Scheduled(fixedDelay = 14 * 60 * 1000)
  public void asleep() {
    try {
      RestTemplate restTemplate = new RestTemplate();
      Integer count = restTemplate.getForObject(ATTEN, Integer.class);
    } catch (Exception e) {
    }
  }
}
