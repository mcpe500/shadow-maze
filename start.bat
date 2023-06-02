@echo off
javac -cp lib/core.jar src/shadowmaze2/ShadowMaze2.java src/shadowmaze2/menu/MainMenu.java src/shadowmaze2/utils/Button.java src/shadowmaze2/menu/*.java src/shadowmaze2/game/*.java src/shadowmaze2/levels/*.java src/shadowmaze2/map/*.java src/shadowmaze2/utils/*.java

java -cp lib/core.jar;src shadowmaze2.ShadowMaze2
