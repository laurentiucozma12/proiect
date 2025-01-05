package main.webapp.java.com.example.model;

import java.util.List;

public class Poll {
    private int id;
    private String question;
    private List<String> options;
    private String createdBy;

    public Poll() {}

    public Poll(int id, String question, List<String> options, String createdBy) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.createdBy = createdBy;
    }

    // Getters și Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public List<String> getOptions() { return options; }
    public void setOptions(List<String> options) { this.options = options; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
}
