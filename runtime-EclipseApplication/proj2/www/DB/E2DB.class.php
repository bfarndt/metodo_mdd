<?php

include "E2.class.php";

class E2DB
{
	private $dbconn;
	private $dbname = "jet";
	private $user = "jet";
	private $password = "jet";
	
	public function __construct()
	{
		$this->dbconn = pg_connect("dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}
	
	public function add($E2)
	{
		$query = pg_query('INSERT INTO e2() VALUES()');
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function update($E2)
	{
		$query = pg_query('UPDATE e2 SET
			');
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function destroy()
	{
		$query = pg_query("DELETE FROM e2");
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function getAll()
	{
		$result = array();
		
		$query = pg_query("SELECT * FROM e2");
		
		if ( ! $query) {
			while ($row = pg_fetch_assoc($query)) {
				$E2 = new E2();
				
				
				$result[] = $E2;
			}
		}
		
		return $result;
	}
}

?>