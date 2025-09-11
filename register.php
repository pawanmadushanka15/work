<?php
session_start();
?>

<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Registration Page</h2>
    <a href="login.php">Already have an account? Login</a><br/><br/>
    <form action="register.php" method="POST">
        Enter Username: <input type="text" name="username" required /> <br/>
        Enter Password: <input type="password" name="password" required /> <br/>
        <input type="submit" value="Register"/>
    </form>
</body>
</html>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $conn = new mysqli("localhost", "root", "", "first_db");
    if ($conn->connect_error) die("Connection failed: " . $conn->connect_error);

    $username = trim($_POST["username"]);
    $password = trim($_POST["password"]); // store exactly as entered

    // Check if username exists
    $stmt = $conn->prepare("SELECT * FROM users WHERE username = ?");
    $stmt->bind_param("s", $username);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        echo '<script>alert("Username has been taken!"); window.location.assign("register.php");</script>';
    } else {
        // Store password in plain text
        $stmt = $conn->prepare("INSERT INTO users (username, password) VALUES (?, ?)");
        $stmt->bind_param("ss", $username, $password);

        if ($stmt->execute()) {
            echo '<script>alert("Successfully Registered! Please login."); window.location.assign("login.php");</script>';
        } else {
            echo '<script>alert("Error registering user.");</script>';
        }
    }

    $stmt->close();
    $conn->close();
}
?>
