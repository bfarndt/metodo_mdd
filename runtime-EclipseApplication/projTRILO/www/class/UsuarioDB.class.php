<?php

include_once "Usuario.class.php";


class UsuarioDB
{
	private $dbconn;
	private $host = "localhost";
	private $port = "5432";
	private $dbname = "projTRILO";
	private $user = "postgres";
	private $password = "teste";

	public function __construct()
	{
		$this->dbconn = pg_connect("host= " . $this->host . " port=" . $this->port . " dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}

	public function add($Usuario)
	{
		$query = pg_query("INSERT INTO usuario(
				nome,
				email,
				email_relatorio,
				senha,
				crfa,created_at,
				update_at
			) VALUES(
				'" . $Usuario->getNome() . "',
				'" . $Usuario->getEmail() . "',
				'" . $Usuario->getEmail_relatorio() . "',
				'" . $Usuario->getSenha() . "',
				'" . $Usuario->getCrfa() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Usuario)
	{
		$query = pg_query("UPDATE usuario SET
				nome = '" . $Usuario->getNome() . "',
				email = '" . $Usuario->getEmail() . "',
				email_relatorio = '" . $Usuario->getEmail_relatorio() . "',
				senha = '" . $Usuario->getSenha() . "',
				crfa = '" . $Usuario->getCrfa() . "',update_at = now()
			WHERE id = " . $Usuario->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Usuario)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM usuario WHERE id = " . $Usuario->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				usuario.id AS usuario_id,
				usuario.nome AS usuario_nome,usuario.email AS usuario_email,usuario.email_relatorio AS usuario_email_relatorio,usuario.senha AS usuario_senha,usuario.crfa AS usuario_crfa,
				usuario.created_at,
				usuario.update_at
			FROM usuario
			
			ORDER BY usuario.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Usuario = new Usuario();

				$Usuario->setId($row["usuario_id"]);
			
				$Usuario->setNome($row["usuario_nome"]);
			
				$Usuario->setEmail($row["usuario_email"]);
			
				$Usuario->setEmail_relatorio($row["usuario_email_relatorio"]);
			
				$Usuario->setSenha($row["usuario_senha"]);
			
				$Usuario->setCrfa($row["usuario_crfa"]);
			
				$result[] = $Usuario;
			}
		}

		return $result;
	}

	public function get($Usuario)
	{
		$result = array();

		$where = "";

	
		if (strlen($Usuario->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "usuario.nome = '" . $Usuario->getNome() . "'";
			
		}
	
		if (strlen($Usuario->getEmail()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "usuario.email = '" . $Usuario->getEmail() . "'";
			
		}
	
		if (strlen($Usuario->getEmail_relatorio()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "usuario.email_relatorio = '" . $Usuario->getEmail_relatorio() . "'";
			
		}
	
		if (strlen($Usuario->getSenha()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "usuario.senha = '" . $Usuario->getSenha() . "'";
			
		}
	
		if (strlen($Usuario->getCrfa()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "usuario.crfa = '" . $Usuario->getCrfa() . "'";
			
		}
	
		$query = pg_query("SELECT
				usuario.id AS usuario_id,
				usuario.nome AS usuario_nome,usuario.email AS usuario_email,usuario.email_relatorio AS usuario_email_relatorio,usuario.senha AS usuario_senha,usuario.crfa AS usuario_crfa,
				usuario.created_at,
				usuario.update_at
			FROM usuario
			
		" . $where . "ORDER BY usuario.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Usuario = new Usuario();

				$Usuario->setId($row["usuario_id"]);
			
				$Usuario->setNome($row["usuario_nome"]);
			
				$Usuario->setEmail($row["usuario_email"]);
			
				$Usuario->setEmail_relatorio($row["usuario_email_relatorio"]);
			
				$Usuario->setSenha($row["usuario_senha"]);
			
				$Usuario->setCrfa($row["usuario_crfa"]);
			
				$result[] = $Usuario;
			}
		}

		return $result;
	}
}

?>