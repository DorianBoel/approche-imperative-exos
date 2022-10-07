package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		// TODO Affichez chaque nombre saisi avec Resultat.log
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
	
		int[] intArr = new int[10];
		
		System.out.println("Veuillez saisir 10 nombres entiers: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + (i + 1) + ": ");
			int nb = scanner.nextInt();
			intArr[i] = nb;
		}
		System.out.println();
		
		int maxValue = Integer.MIN_VALUE;
		for (int i : intArr) {
			Resultat.log(i);
			if (i > maxValue) {
				maxValue = i;
			}
		}
		System.out.println();
		
		System.out.println("La valeur maximum est :");
		Resultat.log(maxValue);
		
		scanner.close();
	}

}
