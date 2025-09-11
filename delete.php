<?php
session_start();
if (!isset($_SESSION['user'])) {
    header("location:index.php");
    exit();
}

if (isset($_GET['id'])) {
    $id = intval($_GET['id']); // make sure it's an integer

    $conn = new mysqli("localhost", "root", "", "first_db");
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // delete the row with this id
    $stmt = $conn->prepare("DELETE FROM list WHERE id = ?");
    $stmt->bind_param("i", $id);

    if ($stmt->execute()) {
        header("Location: home.php"); // go back to list
        exit();
    } else {
        echo "Error deleting record: " . $stmt->error;
    }

    $stmt->close();
    $conn->close();
} else {
    header("Location: home.php");
    exit();
}
?>
