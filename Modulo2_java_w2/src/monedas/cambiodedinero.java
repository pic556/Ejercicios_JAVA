package monedas;
import java.util.Scanner;

public class cambiodedinero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros: ");
		double cantidadEuros = scan.nextDouble();
		
		System.out.println("¿A que vas a conventir?(dolares, yenes, libras):  ");
		String monedaDestino = scan.next();
		
		convertirDivisa(cantidadEuros, monedaDestino);
	}

	
	public static void convertirDivisa(double cantidadEuros, String monedaDestino) {
		double cantidadConvertidad = 0.0;
		
		
		switch (monedaDestino) {
		case "dolares":
			cantidadConvertidad = cantidadEuros * 1.28611;
			System.out.println("cantidad de dolares: " + cantidadConvertidad);
			break;
		case "yenes":
			cantidadConvertidad = cantidadEuros * 129.852;
			System.out.println("cantidad de yenes: " + cantidadConvertidad);
			break;
		case "libras":
			cantidadConvertidad = cantidadEuros * 0.86;
			System.out.println("cantidad de libras: " + cantidadConvertidad);
			break;	
		default:
			System.out.println("Moneda no valida, vuelve a intentarlo ");
			main(null);
		}
	}
}
