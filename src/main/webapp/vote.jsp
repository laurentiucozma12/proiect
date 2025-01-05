<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vote</title>
  </head>
  <body>
    <h2>Vote for Poll</h2>
    <form action="VoteServlet" method="post">
      <h3><%= "What is your favorite color?" %></h3>
      <input type="radio" id="red" name="vote" value="Red" />
      <label for="red">Red</label><br />
      <input type="radio" id="blue" name="vote" value="Blue" />
      <label for="blue">Blue</label><br />
      <input type="radio" id="green" name="vote" value="Green" />
      <label for="green">Green</label><br /><br />
      <button type="submit">Vote</button>
    </form>
    <a href="pollList.jsp">Back to Poll List</a>
  </body>
</html>
