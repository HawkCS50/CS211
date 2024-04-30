package Final_Project.Updated;

import java.util.Scanner;

public class Dialogue {
    private static final String[][] OPTIONS = {
            {"Enter digit to select"},
            {"#1: Add chemical", "#2: Chemical list", "#3: Exit"},
            {"#1: Type Chemical Name (e.g. C1H2Fe3)", "#2: Here are your stats"},
            {"#X: Select Chemical","#: Select Chemical"},
            {"#1: See molecular mass", "#2: Check solubility", "#4: Delete the chemical"}
    };


    private static Scanner scanner = new Scanner(System.in);

    public static void home() {
   	 boolean r=true;
        while (r) {
            for (String s : OPTIONS[1]) System.out.println(s);
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    r = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println(OPTIONS[0][0]);
            }
        }
    }

    public static void add() {
    	 boolean r=true;

        while (r) {
            System.out.println(OPTIONS[2][0]);
            String choice = scanner.next();
            scanner.nextLine();
            if (syntax.check(choice)) {
                Run.creation(choice);
                Run.stats(Run.cookbook.get(choice));
<<<<<<< HEAD
                r=false;
            }
           
=======
            }
>>>>>>> 471bf1605683397795dbd0da94500f3b1fd03127
        }
    }

    public static void list() {
   	 boolean r=true;
    	listChemicals();
        while (r) {
            for (String s : OPTIONS[3]) System.out.print(s);
<<<<<<< HEAD
            String choice = scanner.next();
            scanner.nextLine(); // consume newline
            if (Run.hasEntryInCookbook(choice)) {
            	Run.stats(Run.cookbook.get(choice)); 
            	r= false;
            }
=======
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (choice != 0) r = false;
>>>>>>> 471bf1605683397795dbd0da94500f3b1fd03127
        }
    }

    public static void listChoices() {
   	 boolean r=true;

    	while (r) {
            for (String s : OPTIONS[3]) System.out.println(s);
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    getMW();
                    break;
                case 2:
                    getSol();
                    break;
                case 3:
                    delChem();
                    r = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println(OPTIONS[0][0]);
            }
        }
    }

    private static void listChemicals() {
        // Implement listChemicals method if needed
<<<<<<< HEAD
    	Run.printAtomSymbols();
=======
>>>>>>> 471bf1605683397795dbd0da94500f3b1fd03127
    }

    private static void getMW() {
        // Implement getMW method if needed
    }

    private static void getSol() {
        // Implement getSol method if needed
    }

    private static void delChem() {
        // Implement delChem method if needed
    }
}