<?php

include "E1.class.php";

class E1DB
{
	private $dbconn;
	private $dbname = "jet";
	private $user = "jet";
	private $password = "jet";
	
	public function __construct()
	{
		$this->dbconn = pg_connect("dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}
	
	public function add($E1)
	{
		$query = pg_query('INSERT INTO e1() VALUES()');
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function update($E1)
	{
		$query = pg_query('UPDATE e1 SET
			');
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function destroy()
	{
		$query = pg_query("DELETE FROM e1");
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function getAll()
	{
		$result = array();
		
		$query = pg_query("SELECT * FROM e1");
		
		if ( ! $query) {
			while ($row = pg_fetch_assoc($query)) {
				$E1 = new E1();
				
				
				$result[] = $E1;
			}
		}
		
		return $result;
	}
}

?>