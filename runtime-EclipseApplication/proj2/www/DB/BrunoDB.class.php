<?php

include "Bruno.class.php";

class BrunoDB
{
	private $dbconn;
	private $dbname = "jet";
	private $user = "jet";
	private $password = "jet";
	
	public function __construct()
	{
		$this->dbconn = pg_connect("dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}
	
	public function add($Bruno)
	{
		$query = pg_query('INSERT INTO bruno(cpf, endereco) VALUES("' . $Bruno->getCpf() . '", "' . $Bruno->getEndereco() . '")');
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function update($Bruno)
	{
		$query = pg_query('UPDATE bruno SET
			cpf = "' . $Bruno->getCpf() . '", endereco = "' . $Bruno->getEndereco() . '"');
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function destroy()
	{
		$query = pg_query("DELETE FROM bruno");
		
		return (pg_affected_rows($query) > 0);
	}
	
	public function getAll()
	{
		$result = array();
		
		$query = pg_query("SELECT * FROM bruno");
		
		if ( ! $query) {
			while ($row = pg_fetch_assoc($query)) {
				$Bruno = new Bruno();
				
					$Bruno->setCpf($row["cpf"]);
				
					$Bruno->setEndereco($row["endereco"]);
				
				
				$result[] = $Bruno;
			}
		}
		
		return $result;
	}
}

?>