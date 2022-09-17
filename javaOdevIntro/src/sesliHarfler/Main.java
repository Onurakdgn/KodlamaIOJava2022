package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'N';

		switch (harf) {
		case 'A':
		case 'E':
		case 'I':
		case 'İ':
		case 'Ü':
		case 'U':
		case 'O':
		case 'Ö':
			System.out.println("Sesli Harf");
			break;
		default:
			System.out.println("Sessiz Harf");
		}
	}

}
