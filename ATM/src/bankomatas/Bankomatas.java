package bankomatas;

import java.util.Scanner;

public class Bankomatas {
	Scanner scan = new Scanner(System.in);
	private int pinigaiBankomate = 500;

	public void iseik() {
		System.out.println("Jus isejote is sistemos.");
	}

	public void klausk() {

		int ats = 0;
			System.out.println("Pasirinkite veiksma:");
			System.out.println("1 - jei norite isgryninti pinigus");
			System.out.println("2 - jei norite baigti darba");
			ats = scan.nextInt();
			
			switch (ats) {
			case 1:
				isgrynink();
				break;
			case 2:
				iseik();
				break;
			default:
				System.out.println("Tokio pasirinkimo nera.");
				klausk();
			}
	}

	public void isgrynink() {
		
		int ivestis;
		while (pinigaiBankomate > 0) {
			System.out.println("Kiek pinigu norite isgrininti?");
			ivestis = scan.nextInt();

			if (ivestis > pinigaiBankomate) {
				System.out.println("Tiek pinigu bankomate nera. Iveskite mazesne suma, ne didesne kaip "
						+ pinigaiBankomate + " euru. Arba baikite darba.");
				klausk();
				break;

			} else {

				System.out.println("Jusu pinigai isgryninti.");
				setPinigaiBankomate(pinigaiBankomate -= ivestis);

				if (pinigaiBankomate == 0) {
					System.out.println(
							"Daugiau pinigu bankomate nera. Galite pasinaudoti artimiausiu bankomatu Naugarduko g.");
					break;
				} else {
					System.out.println("Ka noretumet daryti toliau?");
					klausk();
					break;
				}
			}
		}

	}

	public void setPinigaiBankomate(int pinigaiBankomate) {
		this.pinigaiBankomate = pinigaiBankomate;
	}

}
