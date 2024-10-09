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
		long nombre = 0;

		long sommeDiviseurs = 0;
		
		System.out.println("Entrez un nombre ");
		nombre = myObj.nextLong();
		
		boolean DoDisplay = (nombre < 1000000000);
		
		long listeDiviseurs[] = new long[20000];
		
		int intI = 0;
		
		System.out.print(nombre + " est divisible par : ");
	    for (long i = 1; i < nombre; ++i) {
	    	if (nombre% i == 0) {
	    		System.out.print(i + " ");
		    	sommeDiviseurs += i;
		    	if (DoDisplay) {
		    		intI = (int) i;
			    	listeDiviseurs[intI] = i;
		    	}
	    	}
	     } 
		
	    System.out.println("");
	    System.out.println("");
	    
	    if (sommeDiviseurs == nombre) {
	    	System.out.print(nombre + " est parfait  ");
	    	if (DoDisplay) {
	    		System.out.print(" sa liste de diviseur est ");
	    		for (int i = 1; i < listeDiviseurs.length; ++i) {
	    			if (listeDiviseurs[i] != 0) {
	    				System.out.print(listeDiviseurs[i] + " ");
	    			}
	    		}
	    	}
	    }else {
	    	System.out.println(nombre + " n'est pas parfait car la somme des diviseurs est "  + sommeDiviseurs);
	    }
	}

}
