package bankomatas;

import java.util.Scanner;

public class Verifikacija {

	Scanner scan = new Scanner(System.in);

	public void pradek() {
		Verifikacija v = new Verifikacija();
		v.patikrinkPinKoda();
	}

	public void patikrinkPinKoda() {

		Bankomatas bank1 = new Bankomatas();
		int i = 3;
		String reikalingaspin = "testas", ivestasPin;
		
		while (i > 0) {
			i--;
			System.out.println( "Iveskite savo pin koda:");
			ivestasPin = scan.nextLine();
			if (ivestasPin.equalsIgnoreCase(reikalingaspin)) {
				System.out.println("Pin teisingas");
				bank1.klausk();
				break;
			} else {
				if (i != 0)

					System.out.print(("Pinkodas neteisingas. Liko bandymu: " + i + "."+ "\n" ));

				else
					System.out.print("Pinkodas neteisingas. ");

			}
			if (i == 0)
				System.out.println("Jusu kortele uzblokuota");
		}
	}
}
