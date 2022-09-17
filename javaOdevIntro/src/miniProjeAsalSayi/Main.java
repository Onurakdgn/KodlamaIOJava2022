package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 23;

		Boolean asalMi = true;

		for (int i = 2; i < number; i++) {
			int kalan = number % i;
			if (kalan == 0) {
				asalMi = false;
			}
		}
		if (asalMi) {
			System.out.println(number + " sayısı asal sayıdır.");
		} else
			System.out.println(number + " sayısı asal değildir.");

	}

}
