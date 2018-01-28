package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String myHippo = "Fiona";

		String option = null;

		VirtualPet myPet = new VirtualPet(40, 40, 40, 40);

		System.out.println("Hello, this is " + myHippo + " the amazing hippo!");

		do {
			System.out.println(myHippo + " 's hunger level is " + myPet.getHunger());
			System.out.println(myHippo + " 's thirst level is " + myPet.getThirst());
			System.out.println(myHippo + " 's boredom level is " + myPet.getBoredom());
			System.out.println(myHippo + " 's tiredness level is " + myPet.getFatigue());
			System.out.println("What would you like to do?");
			System.out.println("1. Give " + myHippo + " some tasty lettuce.");
			System.out.println("2. Pour " + myHippo + " some water.");
			System.out.println("3. Play with " + myHippo + " .");
			System.out.println("4. Put " + myHippo + " to bed.");
			System.out.println("5. Do nothing");
			System.out.println("6. Quit");
			option = input.next();

			if (option.equals("1")) {
				System.out.println("You give " + myHippo + " some lettuce, she wiggles her ears in excitment.");
				myPet.feedLettuce();
			}

			if (option.equals("2")) {
				System.out.println("You pour " + myHippo + " some fresh water.");
				myPet.giveWater();
			}

			if (option.equals("3")) {
				System.out.println("You take " + myHippo + " out to play, she jumps around in joy!");
				myPet.play();
			}

			if (option.equals("4")) {
				System.out.println("You take " + myHippo + " to bed.");
				myPet.sleep();
			}

			if (option.equals("5")) {
				System.out.println(myHippo + " lays in the corner");
			}

			myPet.tick();

		} while (!option.equals("6"));
		System.out.println("Thank you so much for playing!");
		System.exit(0);

		input.close();

	}

}
