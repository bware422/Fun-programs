package gobspckg;

import java.util.Scanner;

public class Gobsprog {

	public static void main(String[] args) {
		Scanner GobsScan = new Scanner(System.in);
		System.out.println("Gob's Program: Y/N?");
		System.out.print("? ");
		char choice = GobsScan.next().charAt(0);
		if(choice == 'Y' || choice == 'y') {
			while(true) {
				System.out.print("Penus ");
			}
		} else {
			System.out.println("I've made a huge mistake.");
		}
		GobsScan.close();
	}
}
