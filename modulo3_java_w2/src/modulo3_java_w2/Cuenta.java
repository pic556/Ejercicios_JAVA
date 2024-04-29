package modulo3_java_w2;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;



public class Cuenta {
	public int numeroCuenta;
	public long dni;
	public double saldo;
	
	
	//constructor por defecto
	public Cuenta() {
		
	}
	
	
	//constructor por parametro
	
	
	public Cuenta(int numeroCuenta, long dni, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}
	
	//metodo para establecer valor
	public Cuenta crearCuenta() {
	    	
	    	Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	    	System.out.println("INGRESAR NUMERO DE CUENTA: ");
	    	numeroCuenta = scan.nextInt();
	    	System.out.println("INGRESAR DNI: ");
	    	dni = scan.nextLong();
	    	System.out.println("INGRESAR SALDO: ");
	    	saldo = scan.nextDouble();

	    	
	    	Cuenta cuenta = new Cuenta(numeroCuenta,dni,saldo);
	    	
	    	return cuenta;
	    	
	    }
	
	
	public void ingresar() {
		double masdinero;
		Scanner scan = new Scanner(System.in).useDelimiter("\r\n");	
    	System.out.println("Ingresar mas dinero: ");    	
    	masdinero = scan.nextDouble();
    	this.saldo = this.saldo + masdinero;
	}
	
	
	public void retirar() {
		double retirardinero;
		double revisionsaldo;
		Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
		System.out.println("retirar mas dinero: ");   	
		retirardinero = scan.nextDouble();
		revisionsaldo = this.saldo - retirardinero;
		if (revisionsaldo<0) {
			this.saldo = 0;
		}else {
			this.saldo = revisionsaldo;
		}
	}
	
	
	public String consultarSaldo() {
        return  "Su saldo es de : " + saldo;
    }
	
	public String sacarDatos() {
        return "Cuenta: " + numeroCuenta + ", DNI: " + dni + ", Saldo: " + saldo;
    }
}
