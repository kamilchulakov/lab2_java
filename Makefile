.PHONY: compile clean prepare jar
clean:
	rm -rf classes releases
prepare: clean
	mkdir classes
	mkdir releases
compile: clean prepare
	javac -cp ".:lib/Pokemon.jar" -d classes source/lab/attacks/*.java
	javac -cp ".:lib/Pokemon.jar:lab/attacks" -d classes source/lab/pokemons/*.java
	javac -cp ".:lib/Pokemon.jar" -d classes Main.java

jar: clean prepare compile
	jar -cvfm releases/v1.0.jar manifest.txt *.class classes/lab/*/*.class
