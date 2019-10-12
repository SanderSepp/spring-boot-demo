package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Score;
import com.example.demo.service.ScoreService;

@RestController
public class ScoreController {
  @Autowired
  ScoreService scoreService;

  @RequestMapping(value = "/scores")
  public ResponseEntity<Object> getScore() {
    return new ResponseEntity<>(scoreService.getScores(), HttpStatus.OK);
  }

  @RequestMapping(value = "/scores/{id}", method = RequestMethod.PUT)
  public ResponseEntity<Object> updateScore(@PathVariable("id") String id, @RequestBody Score product) {
    scoreService.updateScore(id, product);
    return new ResponseEntity<>("Score is updated successfully", HttpStatus.OK);
  }

  @RequestMapping(value = "/scores/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Object> delete(@PathVariable("id") String id) {
    scoreService.deleteScore(id);
    return new ResponseEntity<>("Score is deleted successfully", HttpStatus.OK);
  }

  @RequestMapping(value = "/scores", method = RequestMethod.POST)
  public ResponseEntity<Object> createScore(@RequestBody Score product) {
    scoreService.createScore(product);
    return new ResponseEntity<>("Score is created successfully", HttpStatus.CREATED);
  }
}
