package palabrasmayusculasminisculas;
import java.util.Scanner;

public class segundopunto {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("por favor coloque su frase");
		String frase = myObj.nextLine();
		System.out.println("porfavor coloque mayus o minus si quieres que tu frase cambie"
				+ " a sus respecitvas elecciones" );
		String decision = myObj.nextLine();
		if (decision.equals("mayus")) {
			String fraseMayus = frase.toUpperCase();
			System.out.println("Frase en mayúsculas: " + fraseMayus);
			
		} else {
			if (decision.equals("minus")) {
				String fraseMinus = frase.toLowerCase();
				System.out.println("Frase en minúsculas: " + fraseMinus);
			} else {
				System.out.println("Opción no válida. Por favor, intente de nuevo.");
				main(args);
			}
		}
	}

}
