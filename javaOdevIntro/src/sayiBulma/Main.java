package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 20;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				System.out.println("Dizi içerisinde " + sayi + " vardır.");
			}

		}
		System.out.println("Dizi içerisinde " + aranacak + " yoktur.");
	}
}
