package com.example.demo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Score;

@Service
public class ScoreService implements ScoreServiceInterface {
  private static Map<String, Score> scoreRepo = new HashMap<>();
  static {
    Score score = new Score();
    score.setId("1");
    score.setScore(2);
    scoreRepo.put(score.getId(), score);

    Score score2 = new Score();
    score2.setId("2");
    score2.setScore(3);
    scoreRepo.put(score2.getId(), score2);
  }
  @Override
  public void createScore(Score score) {
    scoreRepo.put(score.getId(), score);
  }

  @Override
  public void updateScore(String id, Score score) {
    scoreRepo.remove(id);
    score.setId(id);
    scoreRepo.put(id, score);
  }

  @Override
  public void deleteScore(String id) {
    scoreRepo.remove(id);
  }

  @Override
  public Collection<Score> getScores() {
    return scoreRepo.values();
  }
}
