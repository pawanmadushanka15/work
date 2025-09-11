<?php
session_start();
if (!isset($_SESSION['user'])) {
    header("location:index.php"); // redirect if not logged in
    exit();
}
$user = $_SESSION['user'];
?>
<html>
<head>
    <title>My First PHP website</title>
</head>
<body>
    <h2>Home Page</h2>
    <p>Hello <?php echo htmlspecialchars($user); ?>!</p>
    <a href="logout.php">Click here to logout</a><br/><br/>

    <form action="add.php" method="POST">
        Add more to list: <input type="text" name="details" /><br/>
        Public post? <input type="checkbox" name="public[]" value="yes" /><br/>
        <input type="submit" value="Add to list"/>
    </form>

    <h2 align="center">My list</h2>
    <table border="1px" width="100%">
        <tr>
            <th>Id</th>
            <th>Details</th>
            <th>Post Time</th>
            <th>Edit Time</th>
            <th>Edit</th>
            <th>Delete</th>
            <th>Public Post</th>
        </tr>
        <?php
        $conn = new mysqli("localhost", "root", "", "first_db");
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        $query = mysqli_query($conn, "SELECT * FROM list");
        while ($row = mysqli_fetch_array($query)) {
            echo "<tr>";
            echo '<td align="center">'.$row['id']."</td>";
            echo '<td align="center">'.$row['details']."</td>";
            echo '<td align="center">'.$row['date_posted'].' - '.$row['time_posted']."</td>";
            echo '<td align="center">'.$row['date_edited'].' - '.$row['time_edited']."</td>";
            echo '<td align="center"><a href="edit.php?id='.$row['id'].'">edit</a></td>';
            echo '<td align="center"><a href="delete.php?id='.$row['id'].'">delete</a></td>';
            echo '<td align="center">'.$row['public']."</td>";
            echo "</tr>";
        }
        ?>
    </table>
</body>
</html>
