package modulo3_java_w1;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;

public class libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int CantPages;
    
    //Constructor por defecto(sin parametros)
    public libro() {
        
    }
    
    //Constructor por parametros
    public libro(int ISBN, String Titulo, String Autor, int CantPages) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.CantPages = CantPages;
    }
    
    // Método para establecer el valor 
    public libro crearLibro() {
    	
    	Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
    	System.out.println("INGRESAR ISBN: ");
    	ISBN = scan.nextInt();
    	System.out.println("INGRESAR TITULO: ");
    	Titulo = scan.next();
    	System.out.println("INGRESAR AUTOR: ");
    	Autor = scan.next();
    	System.out.println("INGRESAR CANT PAGINAS: ");
    	CantPages = scan.nextInt();
    	
    	libro livro = new libro(ISBN, Titulo,Autor,CantPages);
    	
    	return livro;
    	
    }
    
    // Método para obtener el valor 
    public String sacarLibro() {
        return "ISBN: " + ISBN + ", Título: " + Titulo + ", Autor: " + Autor + ", Cantidad de páginas: " + CantPages;
    }
}
