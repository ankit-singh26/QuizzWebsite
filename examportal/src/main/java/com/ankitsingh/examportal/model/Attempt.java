package com.ankitsingh.examportal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "attempts")
public class Attempt {
    @Id
    private String id;

    private String quizId;

    private String userId;

    private List<Submission> submissions;

    private int score;

    private long timeStarted;

    private long timeFinished;

    public Attempt() {}

    public Attempt(String quizId, String userId, List<Submission> submissions, int score, long timeStarted, long timeFinished) {
        this.quizId = quizId;
        this.userId = userId;
        this.submissions = submissions;
        this.score = score;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(long timeStarted) {
        this.timeStarted = timeStarted;
    }

    public long getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(long timeFinished) {
        this.timeFinished = timeFinished;
    }
}

