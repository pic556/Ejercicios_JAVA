package matematicaRandom;
import java.util.Scanner;

public class primerpunto {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Ingrese num1");
		int num1 = myObj.nextInt();
		int num2 = (int)(Math.random()*100);
			System.out.println("el num1 es " + num1 );
			if (num1 >= 0 && num1 <= 99) {
			System.out.println("el num2 es " + num2 );
			int suma = num1 + num2;
			System.out.println("la suma es " + suma );
		} else {
			System.out.println("el numero ingresado no funciona");
			System.out.println("volver a ingresar");
			main(args);

		}
	}

}
