<?php
session_start();
if (!isset($_SESSION['user'])) {
    header("location:index.php");
    exit();
}

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    // connect to the database
    $conn = new mysqli("localhost", "root", "", "first_db");

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // sanitize inputs
    $details = trim($_POST['details']);
    $date = date("Y-m-d"); // proper date format
    $time = date("H:i:s"); // proper time format
    $decision = isset($_POST['public']) ? "yes" : "no";

    // use prepared statement
    $stmt = $conn->prepare("INSERT INTO list (details, date_posted, time_posted, public) VALUES (?, ?, ?, ?)");
    $stmt->bind_param("ssss", $details, $date, $time, $decision);

    if ($stmt->execute()) {
        header("Location: home.php");
        exit();
    } else {
        echo "Error: " . $stmt->error;
    }

    $stmt->close();
    $conn->close();
}
?>
