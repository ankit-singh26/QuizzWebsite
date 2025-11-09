package com.ankitsingh.examportal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quizzes")
public class Quiz {
    @Id
    private String id;

    private String title;

    private String subjectId;

    private List<Question> questions;

    private int timeLimitMinutes;

    public Quiz() {}

    public Quiz(String title, String subjectId, List<Question> questions, int timeLimitMinutes) {
        this.title = title;
        this.subjectId = subjectId;
        this.questions = questions;
        this.timeLimitMinutes = timeLimitMinutes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getTimeLimitMinutes() {
        return timeLimitMinutes;
    }

    public void setTimeLimitMinutes(int timeLimitMinutes) {
        this.timeLimitMinutes = timeLimitMinutes;
    }
}
