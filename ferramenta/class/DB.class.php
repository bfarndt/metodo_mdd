<?php

class DB
{
    private $dbconn;
    private $host = "localhost";
    private $port = "5432";
    private $dbname = "metodo";
    private $user = "postgres";
    private $password = "teste";

    public function __construct()
    {
        $this->dbconn = pg_connect("host= " . $this->host . " port=" . $this->port . " dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
    }
}

?>