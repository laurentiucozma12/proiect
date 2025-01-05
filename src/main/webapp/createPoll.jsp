<!DOCTYPE html>
<html>
  <head>
    <title>Creare Sondaj</title>
  </head>
  <body>
    <h1>Creare Sondaj</h1>
    <form action="polls" method="post">
      <label>Întrebare:</label>
      <input type="text" name="question" required /><br />
      <label>Opțiuni (separate prin virgulă):</label>
      <input type="text" name="options" required /><br />
      <button type="submit">Creează</button>
    </form>
  </body>
</html>
