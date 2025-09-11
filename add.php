<?php
session_start();
if(!issue($_SESSION['user'])){
    header("location:index.php");
}

if($_SERVER['REQUEST_METHOD'] == "POST"){
    //connect to the database
    $conn = new mysqli("localhost","root","","first_db");

    //check connection
    if($conn->connect_error){
        die("connection failed" . $conn->connect_error);
    }

    //sanitize input
    $details=mysqli_real_escape_string($conn,$_POST['details']);
    $time=strftime("%X"); //Time
    $date=strftime("%B %d,%Y");//Date
    $decision="no";

    //check if 'public' checkbox was selected
    if(isset($_POST['public'])){
        $decision="yes";
    }

    //Insert into database
    $query="INSERT INTO list(details,date_posted,time_posted,public)
            VALUES('$details','$date,'$time','$decision')";

    if(mysqli_query($conn,$query)){
        header("Location:home.php");
        exit();
    }else{
        echo "Error: ".mysqli_error($conn);
    }

    $conn->close();
}