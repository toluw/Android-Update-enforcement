<?php
$user_name = 'root';
$host_name = 'localhost';
$db_name = 'project';
$user_pass = 'hamburger';

$con = Mysqli_connect($host_name,$user_name,$user_pass,$db_name);
if ($con)
{
$cam = "SELECT version FROM version WHERE id = '1' ";
$fav = mysqli_query($con,$cam);

if ($fav){
	$row = mysqli_fetch_assoc($fav);
	$lab = $row["version"];
	$goal=array("response"=>$lab);
	echo json_encode ($goal);
}
 else
{
$goal=array("response"=>'Unable to run SQL query'); 
echo json_encode ($goal);
} 
}
else
{
	 $goal=array("response"=>'Unable to connect to database'); 
echo json_encode ($goal);
}

?>
