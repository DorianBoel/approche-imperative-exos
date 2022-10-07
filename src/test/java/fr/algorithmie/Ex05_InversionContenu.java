package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InversionContenu")
public class Ex05_InversionContenu {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableauArrayCopy() {
		
		// TODO Créer un tableau nommé arrayCopy et qui contient les mêmes nombres
		// que dans le tableau array mais dans l'ordre inverse. 
		// Pour être plus précis, arrayCopy commence par les nombres suivants : -4, 14, 0, etc..
		
		// TODO LOGUER le contenu de ce tableau arrayCopy
		int[] arrayCopy = new int[array.length];
		for (int i = 1; i <= array.length; i++) {
			arrayCopy[i - 1] = array[array.length - i];
		}
		for (int i : arrayCopy) {
			Resultat.log(i);
		}
		
	}
}
