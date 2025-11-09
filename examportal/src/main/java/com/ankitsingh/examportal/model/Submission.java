package com.ankitsingh.examportal.model;

public class Submission {
    private String questionId;
    private int selectedOptionIndex;
    private boolean isCorrect;

    public Submission() {}

    public Submission(String questionId, int selectedOptionIndex, boolean isCorrect) {
        this.questionId = questionId;
        this.selectedOptionIndex = selectedOptionIndex;
        this.isCorrect = isCorrect;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public int getSelectedOptionIndex() {
        return selectedOptionIndex;
    }

    public void setSelectedOptionIndex(int selectedOptionIndex) {
        this.selectedOptionIndex = selectedOptionIndex;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}

