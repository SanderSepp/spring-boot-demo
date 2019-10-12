package com.example.demo.model;

public class Score {
  private String id;
  private Integer score;

  public Score(String id, Integer score) {
    this.id = id;
    this.score = score;
  }

  public Score() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }
}
