<?php
    session_start();
    session_destroy();
    header("location:index.php");
?>

//do delete and edit