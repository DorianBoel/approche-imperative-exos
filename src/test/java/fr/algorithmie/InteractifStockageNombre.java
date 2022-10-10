package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	
	public static void main(String[] args) {// Tests de vérification

		int[] intArr = new int[0];
		
		Scanner scanner = new Scanner(System.in);
		boolean rlOn = true;
		
		int choice;
		
		while (rlOn) {
			displayMenu();
			choice = scanner.nextInt();
			switch(choice) {
				case(1) :
					System.out.println("Rentrez un nombre à ajouter :");
					int newInt = promptInt(scanner);
					intArr = add(intArr, newInt);
					System.out.println("Nombre ajouté: " + newInt);
					System.out.println();
					break;
				case(2) :
					System.out.println("Liste des nombres :");
					displayArr(intArr);
					break;
				case(3) :
					rlOn = false;
					System.out.println("Fin du programme");
					break;
				default :
					System.out.println("Option invalide");
					System.out.println();
			}
		}
		scanner.close();
		
	}

	static void displayArr(int[] arr) {
		if (arr.length > 0) {
			for (int i : arr) {
				System.out.println(" " + i);
			}
		} else {
			System.out.println(" Liste vide");
		}
		System.out.println();
	}
	
	static void displayMenu() {
		System.out.println("Choisissez une option :");
		System.out.println(" 1 - Ajouter un nombre");
		System.out.println(" 2 - Afficher la liste de nombres");
		System.out.println(" 3 - Quitter");
		System.out.println();
	}
	
	static int promptInt(Scanner scanner) {
		System.out.print("> ");
		int newInt = scanner.nextInt();
		return newInt;
	}
	
	static int[] add(int[] arr, int n) {
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = n;
		return newArr;
	}
	
	/*
	public class HelloWorld{

	     public static void main(String []args){
	        System.out.println("lg" + fibby(25));
	     }
	     
	     public static int fibby(int n) {
	         int result = 2;
	         int gMin1 = 1;
	         int gMin2 = 0;
	         int g = 1;
	         while (g < n) {
	            g = gMin1 + gMin2;
	            gMin2 = gMin1;
	            gMin1 = g;
	            System.out.println(g);
	            result++;
	         }
	         return result;
	     }
	}*/
	
}
