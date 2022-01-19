.PHONY: clean compile package exec

all: clean package exec

install:
	sudo apt-get install maven
	
clean:
	mvn clean

compile:
	mvn compile

package:
	mvn package

exec:
	mvn exec:java -Dexec.args=$(argumento)