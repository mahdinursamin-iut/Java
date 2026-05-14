package BroCode_Project;
import java.util.*;

public class Game {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String adjective1, adjective2, adjective3, noun1, verb1;

            System.out.print("Enter an adjective here (descriptive): ");
            adjective1 = sc.nextLine();
            System.out.print("Enter a noun here (animal or person): ");
            noun1 = sc.nextLine();
            System.out.print("Enter an adjective here (descriptive): ");
            adjective2 = sc.nextLine();
            System.out.print("Enter a verb with -ing (action): ");
            verb1 = sc.nextLine();
            System.out.print("Enter an adjective here (descriptive): ");
            adjective3 = sc.nextLine();

            System.out.println("Today I went to my " + adjective1 + " university named IUT.");
            System.out.println("There in the gymnesium, I met " + noun1 + ".");
            System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
            System.out.println("I became very " + adjective3 + "!");

            sc.close();
        }
    }

    // changed the file type and added it into a class named Game.