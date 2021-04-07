package com.jay.java;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

    private int questionId;
    private String question;
    private List<String> answers;
    private Set<String> answersSet;
    private Map<Integer, String> answersMap;

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                ", answersSet=" + answersSet +
                ", answersMap=" + answersMap +
                '}';
    }

    public Map<Integer, String> getAnswersMap() {
        return answersMap;
    }

    public void setAnswersMap(Map<Integer, String> answersMap) {
        this.answersMap = answersMap;
    }

    public Question(int questionId, String question, List<String> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public Set<String> getAnswersSet() {
        return answersSet;
    }

    public void setAnswersSet(Set<String> answersSet) {
        this.answersSet = answersSet;
    }

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

}
