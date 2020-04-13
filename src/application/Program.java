package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many tries ?");
		System.out.println("Teste de upload para o Git Hub");
		int x = sc.nextInt();
		double[] rota = new double[x];
		
		for (int i = 0; i < rota.length; i++) {
			System.out.println("Entry lucky number");
			rota[i]=sc.nextDouble();
		}
		for (int i=0;i<rota.length;i++) {
			System.out.println(rota[i]);
		}
		sc.close();
	}

}
