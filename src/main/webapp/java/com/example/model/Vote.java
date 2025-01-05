package main.webapp.java.com.example.model;

public class Vote {
    private int id;
    private int pollId;
    private String optionChosen;
    private String votedBy;

    public Vote() {}

    public Vote(int id, int pollId, String optionChosen, String votedBy) {
        this.id = id;
        this.pollId = pollId;
        this.optionChosen = optionChosen;
        this.votedBy = votedBy;
    }

    // Getters și Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPollId() { return pollId; }
    public void setPollId(int pollId) { this.pollId = pollId; }

    public String getOptionChosen() { return optionChosen; }
    public void setOptionChosen(String optionChosen) { this.optionChosen = optionChosen; }

    public String getVotedBy() { return votedBy; }
    public void setVotedBy(String votedBy) { this.votedBy = votedBy; }
}