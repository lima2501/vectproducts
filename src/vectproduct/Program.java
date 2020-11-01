package vectproduct;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("N�mero de produtos: ");
		int n = scan.nextInt();
		scan.nextLine();

		Product[] vect = new Product[n];

		System.out.println("Informe os dados do produto");
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Nome: ");
			String name = scan.nextLine();
			System.out.print("Pre�o: ");
			Double price = scan.nextDouble();
			scan.nextLine();

			vect[i] = new Product(name, price);
		}

		var sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		var avgPrice = sum / vect.length;

		System.out.println("M�dia dos pre�os: " + String.format("%.2f", avgPrice));

		scan.close();
	}
}
