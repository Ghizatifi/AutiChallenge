<?php
 
	
	define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','AutiChallenge');
	
	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Probleme de connection avec la base de donnees');