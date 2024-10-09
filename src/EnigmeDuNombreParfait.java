import java.util.Scanner;

public class EnigmeDuNombreParfait {

	public static void main(String[] args) {
		/*
		 * Exercice 2 : "L'énigme du nombre parfait" // Un nombre parfait est un
		 * nombre qui est égal à la somme de ses diviseurs propres (les diviseurs //
		 * strictement inférieurs à lui-même). Par exemple, 6 est un nombre parfait, car
		 * ses diviseurs propres // sont 1, 2 et 3, et 1 + 2 + 3 = 6. Votre programme
		 * doit déterminer si un nombre donné par l'utilisateur // est un nombre
		 * parfait.
		 */
		
		Scanner myObj = new Scanner(System.in);
		int nombre = 0;
		int listeDiviseurs = 0;
		
		System.out.println("Entrez un nombre ");
		nombre = myObj.nextInt();
		
		System.out.println("Le nombre est divisible par : ");
	    for (int i = 1; i < nombre; ++i) {
	    	if (nombre% i == 0) {
	    	System.out.println(i);
	    	}
	     } 
		
	}

}
