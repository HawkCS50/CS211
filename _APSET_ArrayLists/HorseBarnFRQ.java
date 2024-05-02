package _APSET_ArrayLists;

public class HorseBarnFRQ {
	public static void main(String[] args) {
		HorseBarn barn = new HorseBarn(5);
		barn.addHorse(new Horse("Trigger",1340), 0);
		barn.addHorse(new Horse("Silver",1210), 2);
		barn.addHorse(new Horse("Lady", 1575),3);
		barn.addHorse(new Horse("Patches",1350), 5);
		barn.printAllHorses();
		barn.consolidate();
		System.out.println("Consilidated:");
		barn.printAllHorses();
	}
}
class Horse {
	private String name;
	private int weight;

	public Horse(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
}

class HorseBarn {
	private Horse[] spaces;
	public HorseBarn(int numSpaces) {
		spaces = new Horse[numSpaces];
	}

	public void addHorse(Horse horse, int space) {
		if (space >= 0 && space < spaces.length) {
			spaces[space] = horse;
		} else {
			System.out.println("Invalid space number.");
		}
	}

	public int findHorseSpace(String name) {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null && spaces[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public void printAllHorses() {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				System.out.println("Space " + i + ": " + spaces[i].getName());
			} else {
				System.out.println("Space " + i + ": Empty");
			}
		} 
	}
	public void consolidate() {
		int nextEmptySpace = 0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				spaces[nextEmptySpace] = spaces[i];
				if (nextEmptySpace != i) {
					spaces[i] = null;
				}
				nextEmptySpace++;
			}
		}
	}
}

