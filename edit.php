<?php
session_start();
if (!isset($_SESSION['user'])) {
    header("location:index.php");
    exit();
}

$conn = new mysqli("localhost", "root", "", "first_db");
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if (isset($_GET['id'])) {
    $id = intval($_GET['id']);

    // fetch current row
    $stmt = $conn->prepare("SELECT * FROM list WHERE id = ?");
    $stmt->bind_param("i", $id);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($row = $result->fetch_assoc()) {
        ?>
        <h2>Edit Item</h2>
        <form method="POST" action="update.php">
            <input type="hidden" name="id" value="<?php echo $row['id']; ?>">
            Details: <input type="text" name="details" value="<?php echo htmlspecialchars($row['details']); ?>"><br/>
            Public post? 
            <input type="checkbox" name="public" value="yes" <?php if($row['public']=="yes") echo "checked"; ?>><br/>
            <input type="submit" value="Update">
        </form>
        <?php
    } else {
        echo "Item not found.";
    }

    $stmt->close();
}
$conn->close();
?>
