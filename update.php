<?php
session_start();
if (!isset($_SESSION['user'])) {
    header("location:index.php");
    exit();
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $id = intval($_POST['id']);
    $details = $_POST['details'];
    $public = isset($_POST['public']) ? "yes" : "no";
    $date = date("Y-m-d");
    $time = date("H:i:s");

    $conn = new mysqli("localhost", "root", "", "first_db");
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $stmt = $conn->prepare("UPDATE list SET details=?, public=?, date_edited=?, time_edited=? WHERE id=?");
    $stmt->bind_param("ssssi", $details, $public, $date, $time, $id);

    if ($stmt->execute()) {
        header("Location: home.php");
        exit();
    } else {
        echo "Error updating record: " . $stmt->error;
    }

    $stmt->close();
    $conn->close();
}
?>
