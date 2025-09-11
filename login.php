<?php
session_start();

// Redirect if already logged in
if (isset($_SESSION['user'])) {
    header("Location: home.php");
    exit();
}

$conn = new mysqli("localhost", "root", "", "first_db");
if ($conn->connect_error) die("Connection failed: " . $conn->connect_error);

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['username']) && isset($_POST['password'])) {

    $username = trim($_POST['username']);
    $password = trim($_POST['password']);

    $stmt = $conn->prepare("SELECT * FROM users WHERE username = ?");
    $stmt->bind_param("s", $username);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($row = $result->fetch_assoc()) {
        // Compare exactly as typed (plain text)
        if ($password === $row['password']) {
            $_SESSION['user'] = $username;
            header("Location: home.php");
            exit();
        } else {
            echo '<script>alert("Incorrect password!");</script>';
        }
    } else {
        echo '<script>alert("Username not found!");</script>';
    }

    $stmt->close();
}
$conn->close();
?>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Page</h2>
    <a href="register.php">Don't have an account? Register</a><br/><br/>
    <form action="login.php" method="POST">
        Enter Username: <input type="text" name="username" required /> <br/>
        Enter Password: <input type="password" name="password" required /> <br/>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>
