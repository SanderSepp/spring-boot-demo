package com.example.demo.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScoreScheduler {
  @Scheduled(cron = "*/10 * * * * *")
  public void cronJobSch() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date now = new Date();
    String strDate = sdf.format(now);
    System.out.println("Java cron job expression:: " + strDate);
  }
}
