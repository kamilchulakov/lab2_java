.PHONY: compile, clean, prepare, jar

clean:
  rm -rf classes releases

prepare:
  mkdir classes
  mkdir releases
  cd source

compile:
  javac -cp ".:../lib/Pokemon.jar" -d ../classes lab/attacks/*.java
  javac -cp ".:../lib/Pokemon.jar:lab/attacks" -d ../classes lab/pokemons/*.java
  javac -cp ".:../lib/Pokemon.jar" -d ../classes Main.java

jar: clean prepare compile
  cd ../classes
  jar -cvfm ../releases/v1.0.jar ../manifest.txt *.class lab/*/*.class
