import java.util.Scanner;
import java.util.Random;
public class MemeAdventure {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		// TODO Auto-generated method stub
		int playerLevel = 1;
		String playerName = "Gislan";
		double playerHealth = 10.0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your character's name?");
		playerName = userInput.nextLine();
		System.out.println("Welcome, " + playerName + "!");
		System.out.println("Look, man. Theres this cave thats pretty dark. Supposedly its got money or something, \nbut between you and me, its probably a pit of buffalos. Dare you enter the Cave of Wonders?");
		
		System.out.println("1. l could use some buffalo horn shampoo.");
		System.out.println("2. This ain't the life for meeeeeeeeeeeeeeeee!!!!" );
		
		int playerChoice;
		playerChoice = userInput.nextInt();
		if(playerChoice == 1) {
			//The player enters the cave
			System.out.println("You approach the cave and say, \"hey this is pretty dank.\"");
			playerLevel++;
		
			//Trap is triggered
			System.out.println(" \"I AM INDEED, HOW YOU SAY, \"DANK.\" THIS PLEASES ME GREATLY.\" \nThe cave rewards you for calling it dank. You've reached level " + playerLevel + "!");
			System.out.println("You swagger into the dank cave. All of a sudden, you feel something press against your sixth kneecap...");
			System.out.println("IT WAS A TRAP! Rocks bombard you from above!");
			int rockDamage;
			rockDamage = randomGenerator.nextInt(5);
			playerHealth -= rockDamage;
			System.out.println("Oh noes! The rock slide slaps you for " + rockDamage + " health!");
			System.out.println("You have " + playerHealth + " health remaining.");
			
			//The player finds a chest
			System.out.println("Pushing your SmartPeopleGlasses™ up your nose with a sigh, you stand up and brush off the dust from your clothes.");
			System.out.println("As you moonwalk forward, the cave narrows like the elegant slope of a carrot. You emerge from the tunnel and arrive at a large cavern.");
			System.out.println("Before you lies a treasure chest bathed in holy golden light!");
			
			boolean hasSword = false;
			System.out.println("1. Ignore this pathetic attempt at a trap. What kind of buffoon do they think I am to fall for such an obvious trick?");
			System.out.println("2. yOLO~!");
			playerChoice = userInput.nextInt();
			if(playerChoice == 2) {
				System.out.println("You intelligently decide that opening this random chest is a great idea! Well, guess what? It was! Inside was a magical spork.");
				hasSword = true;
			}
			
			System.out.println("You bear crawl out of the cavern, and continue your journey.");
			System.out.println("Up ahead, the air grows even danker. Cautiously, you cartwheel forward to investigate.");
			System.out.println("You peek around a corner and see a looming, shadowy figure. Le gasp! You know that creature-!");
			System.out.println("It is your sworn nemesis, the Dragon of Many Glabellas.");
			System.out.println("Gulping, you decide it's time to board the Nope Train to ImOutville and begin to slowly backflip out of the cavern.");
			System.out.println("Oh noes! Your excellent five-star acrobatics skills woke up the dragon!");
			
			System.out.println("1. Honestly, the things people assume others do just for the sake of petty revenge. I'm not foolish enough to take on a dragon. I shall make my escape with dignity.");
			System.out.println("2. fIGhT mE bRO");
			playerChoice = userInput.nextInt();
			if(playerChoice == 2) {
				//The player fights the dragon
				System.out.println("You feel courage swirl through your body as you charge the dragon!");
				if(hasSword) {
					System.out.println("You raise the magic spork high above your head, magical energy swirling around the tip. \nYou stab the dragon right in the Central Glabella, where its main intelligence lies. You've done it! The dragon is dead! HOORAY!");
				}else {
					System.out.println("You scoot towards the dragon with nothing but your bare fists. You know you cannot beat it just by punching it, so you make a decision: if you die, you're bringing the dragon down with you! \nWith a battle cry, you launch yourself into the dragon and spontaneously combust. \n...game over?");
					System.exit(0);					
				}
			}else {
				//The player flees
				System.out.println("You urgently waddle out of the cavern, arriving at the train station. You give the conductor your ticket and board the Nope Train. \nYou arrive home, safe and sound in your Superman bedsheets. Meanwhile, in the cavern, the dragon falls back asleep.");
			}
				
		} else {
			//The player dips faster than doritos
			System.out.println("You dip faster than doritos at the sight of the cave. Ain't no buffalos messin' with you today. \nYou nyoom back to your house." );
			System.exit(0);
		}
	}

}
