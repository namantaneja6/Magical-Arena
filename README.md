Magical Arena -
The Magical Arena is a simulation game where two players compete in a turn-based battle. Each player has attributes like health, strength, and attack power, and the game is driven by dice rolls that determine attack and defense outcomes. The game concludes when one player’s health reaches zero.



Project Structure -
Swiggy Assignment/
├── src/
│   │── main/
│   │   └── java/
│   │       ├── MagicalArenaMain.java      # Entry point for the game.
│   │       ├── Player.java                # Represents a player with attributes and methods.
│   │       ├── Match.java                 # Handles the logic of a match between two players.
│   │       ├── Dice.java                  # Simulates a six-sided dice.
│   │── test/
│       └── java/
│           ├── TestPlayer.java            # Unit tests for Player class.
│           ├── TestDice.java              # Unit tests for Dice class.
│           ├── TestMatch.java             # Unit tests for Match class.
│           ├── TestMagicalArenaMain.java  # Simulated tests for MagicalArenaMain.
└── README.md                              # Project documentation.
└── .gitignore                             # Files to be ignored while pushing on git.



To run this project, ensure the following tools are installed on your system -
Java Development Kit (JDK) - Version 8 or higher (JDK 23 recommended).
Visual Studio Code (VSCode) - IDE.
JUnit Extension VSCode extension - For running tests.
Extension for java VSCode extension.



How to Set Up the Project in VSCode -
Download and extract Swiggy Assignment.
Open the Project in VSCode.
Install the above asked extension in VSCode.
Install code runner extension in VSCode.
Open the MagicalArenaMain.java file and on top right in VSCode click on play button down arrow and then click on Run Java.
The project will succesffuly.



Run the Unit Tests -
Open a test file in src/test/java/ (e.g., TestPlayer.java) and click the Run button in VSCode near the class button.



Explanation of Files -
MagicalArenaMain.java - Main entry point, handles player creation and starts the game.
Player.java - Represents players with attributes (health, strength, attack, etc.).
Match.java - Implements the turn-based battle logic.
Dice.java -	Simulates a six-sided dice roll for randomization.
TestPlayer.java	- Unit tests to validate the functionality of the Player class.
TestDice.java -	Unit tests to validate the functionality of the Dice class.
TestMatch.java - Unit tests for the Match logic.
TestMagicalArenaMain.java -	Simulates user input to test the main program flow.



Sample Gameplay - 
When you run the program, you’ll be prompted to input the details for two players.
Welcome to the Magical Arena!
Enter details for player One:
Enter player name: John
Enter health (positive integer): 100
Enter strength (positive integer): 50
Enter attack (positive integer): 30

Enter details for player Two:
Enter player name: Jane
Enter health (positive integer): 80
Enter strength (positive integer): 40
Enter attack (positive integer): 35

Match started between John and Jane
------------------------------------------------
John attacks Jane:
Attack Roll: 3 | Attack Damage: 90
Defense Roll: 2 | Defense Value: 80
Jane takes 10 damage. Remaining Health: 70
------------------------------------------------
...
Winner: John



Notes -
The game uses dice rolls to randomize attack and defense values.
Attributes like health, strength, and attack directly influence the outcome of the battle.
Tests are included to ensure robustness and correctness of each class.