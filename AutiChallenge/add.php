<?php 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Getting values
		$name = $_POST['NomEnfant'];
		$type = $_POST['Type'];
		$score = $_POST['score'];
		$date = $_POST['date'];
		$time = $_POST['timee'];
		
		
		//Creating an sql query
		$sql = "INSERT INTO autiste (NomEnfant,Type,score,datte,timee) VALUES ('$name','$type','$score','$date','$time')";
		
		//Importing our db connection script
		require_once('dbConnect.php');
		
		//Executing query to database
		if(mysqli_query($con,$sql)){
			echo 'Successfully';
		}else{
			echo 'Error';
		}
		
		//Closing the database 
		mysqli_close($con);
	}