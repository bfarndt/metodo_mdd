#!/bin/bash
JRE_HOME="./eclipse/jre"
DERBY_HOME="./db-derby-10.11.1.1-bin"
DATABASE_FOLDER="./derbyDatabases"
DATABASE_NAME="$2"

JAVA_CMD="$JRE_HOME/bin/java"
DERBY_LIBS="$DERBY_HOME/lib/derby.jar:$DERBY_HOME/lib/derbytools.jar"
CMD="$JAVA_CMD -cp $DERBY_LIBS -Dderby.system.home=$DATABASE_FOLDER"

VALID="true"

case $1 in
	"createAndConnect") CMD=" $CMD -Dij.connection.connectionName=jdbc:derby:$DATABASE_NAME;create=true";;
	"connect"|"executeScript") CMD=" $CMD -Dij.connection.connectionName=jdbc:derby:$DATABASE_NAME";;
	*) VALID="false"
esac

CMD=" $CMD org.apache.derby.tools.ij"

if [ "$1" == "executeScript" ]; then
	CMD=" $CMD $3"
fi

if [ "$VALID" == "false" ]; then
	echo "Uso: scriptDB.sh [ createAndConnect <nome do banco> | connect <nome do banco> | executeScript <nome do banco> <arquivo.sql>]"
else
	echo "Running: $CMD"
	$CMD
fi
