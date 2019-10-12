package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Score;

public interface ScoreServiceInterface {
  void createScore(Score score);
  void updateScore(String id, Score score);
  void deleteScore(String id);
  Collection<Score> getScores();
}
