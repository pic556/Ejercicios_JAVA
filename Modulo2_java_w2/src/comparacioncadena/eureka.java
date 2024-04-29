package comparacioncadena;
import java.util.Scanner;


public class eureka {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("por favor coloque su frase");
		String frase = myObj.nextLine();
		if (frase.equals("eureka")) {
			System.out.println("mensaje correcto");
		} else {
			System.out.println("mensaje incorrecto");
		}

	}

}
