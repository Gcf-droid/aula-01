package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many tries ?");
		//System.out.println("Teste de upload para o Git Hub");
		int x = sc.nextInt();
		System.out.println("Enter secret number");
		int l = sc.nextInt();
		int[] rota = new int[x];

		for (int i = 0; i < rota.length; i++) {
			System.out.println("Entry lucky number");
			rota[i] = sc.nextInt();
		}
		for (int i = 0; i < rota.length; i++) {
			System.out.println(rota[i]);
			if (rota[i] != l) {
				System.out.println("Bad luck, try again !");
			} else {

				System.out.println("The victory is yours");
				System.out.println("Number " + l);
			}
		}
		sc.close();
	}

}
