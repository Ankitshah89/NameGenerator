package com.skilldistillery.namegenerator;

import java.util.Scanner;

public class NameGenerator {
	// Fields

	private String[] firstNames = { "The", "Tha", "Amazing", "Wonderful", "Cordial", "Impeccable", "Stylin'",
			"Shoutin'", "Armchair", "Argumentative", "Desperate", "Analagous", "Graduate", "Childish", "Annual",
			"Dogmatic", "Violent", "Expert", "Smilin'", "Drunken", "Structural", "Vulgar", "Foolish", "Mad",
			"Inspector", "Captain", "Colonel", "Lazy", "Solid", "Dynamic", "Angry", "Visual", "Exemplary", "Insane",
			"Arrogant", "Polymorphic", "Multidimensional" };
	private String[] lastNames = { "Developer", "Ambassador", "Programmer", "Protector", "Funk", "Philosopher",
			"Monster", "Outsider", "Master", "Chieftain", "Despot", "Artist", "Creator", "Warrior", "Pupil", "Watcher",
			"Conqueror", "Mastermind", "Structure", "Wanderer", "Overlord", "Samurai", "Menace", "Clinician", "Doctor",
			"Leader", "Destroyer", "Commander", "Menace", "Specialist", "Exception", "Crusader", "CEO", "President",
			"Baller", "Carcinogen", "2D Array", "Change", "ACL", "Crutch" };

	// Methods

	public void run() {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = kb.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = kb.nextLine();

		System.out.println("Your translated first name is " + translateFirstName(firstName));
		System.out.println("Your translated last name is " + translateLastName(lastName));
		System.out.println();
		System.out.println("Your translated (random) first name is " + randomFirstName(firstName));
		System.out.println("Your translated (random) last name is " + randomLastName(lastName));

		kb.close();
	}

	public String translateFirstName(String fName) {
		String output = null;
		// split fName into a character array
		char[] nameArray = fName.toCharArray();
		// total up the value of all of the characters in name array
		int total = 0;
		for (int i = 0; i < nameArray.length; i++) {
			total += nameArray[i];
		}
		// use modulus to divide firstName.length into total value of characters
		int randomIndex = total % firstNames.length;
		// return the somewhat randomly chosen name from the firsetNames array
		output = firstNames[randomIndex];

		return output;
	}

	public String translateLastName(String lName) {
		String output = null;
		char[] nameArray = lName.toCharArray();
		// total up the value of all of the characters in name array
		int total = 0;
		for (int i = 0; i < nameArray.length; i++) {
			total += nameArray[i];
		}
		// use modulus to divide firstName.length into total value of characters
		int randomIndex = total % lastNames.length;
		// return the somewhat randomly chosen name from the firsetNames array
		output = lastNames[randomIndex];

		return output;
	}

	public String randomLastName(String lName) {
		String output = "";
		for (int i = 0; i < lastNames.length; i++) {
			int randomIndex = (int) (Math.random() * lastNames.length);
			output = lastNames[randomIndex];

		}

		return output;
	}

	public String randomFirstName(String fName) {
		String output = " ";
		for (int i = 0; i < firstNames.length; i++) {
			int randomIndex = (int) (Math.random() * firstNames.length);
			output = firstNames[randomIndex];

		}

		return output;

	}

}
