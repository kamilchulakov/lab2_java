rm -rf classes releases
mkdir classes
mkdir releases
cd source
javac -cp ".:../lib/Pokemon.jar" -d ../classes lab/attacks/*.java
javac -cp ".:../lib/Pokemon.jar:lab/attacks" -d ../classes lab/pokemons/*.java
javac -cp ".:../lib/Pokemon.jar" -d ../classes Main.java
cd ../classes
jar -cvfm ../releases/v1.0.jar ../manifest.txt *.class lab/*/*.class
