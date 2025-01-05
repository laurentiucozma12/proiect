package main.webapp.java.com.example.dao;

import main.webapp.java.com.example.model.Poll;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PollDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/VotingSystem";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "password";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    public List<Poll> getAllPolls() throws SQLException {
        List<Poll> polls = new ArrayList<>();
        String sql = "SELECT * FROM polls";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Poll poll = new Poll(
                        rs.getInt("id"),
                        rs.getString("question"),
                        Arrays.asList(rs.getString("options").split(",")),
                        rs.getString("created_by")
                );
                polls.add(poll);
            }
        }
        return polls;
    }

    public void createPoll(Poll poll) throws SQLException {
        String sql = "INSERT INTO polls (question, options, created_by) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, poll.getQuestion());
            stmt.setString(2, String.join(",", poll.getOptions()));
            stmt.setString(3, poll.getCreatedBy());
            stmt.executeUpdate();
        }
    }
}
