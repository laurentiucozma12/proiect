<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Poll List</title>
</head>
<body>
    <h2>List of Polls</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Poll Question</th>
                <th>Created By</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <%
                // Aici vei popula cu sondaje din baza de date folosind un servlet sau o metodă.
                // Exemplu simplu:
                // PollDAO pollDAO = new PollDAO();
                // List<Poll> polls = pollDAO.getAllPolls();
                // for (Poll poll : polls) {
            %>
            <tr>
                <td><%= "Sample Poll Question" %></td>
                <td><%= "Admin" %></td>
                <td><a href="vote.jsp?id=<%= "1" %>">Vote</a></td>
            </tr>
            <% // } %>
        </tbody>
    </table>
    <a href="createPoll.jsp">Create New Poll</a>
</body>
</html>
