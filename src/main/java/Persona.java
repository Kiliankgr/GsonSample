import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
	String nombre,apellido;
	int edad;
	public static void main (String[]args) {
		Persona p= new Persona();
	}
	public Persona() {
		
		Scanner in=new Scanner (System.in);
		System.out.println("Introduce nombre");
		nombre=in.nextLine();
		
		System.out.println("Introduce apellido");
		apellido=in.nextLine();
		System.out.println("Introduce edad");
		edad=in.nextInt();
		in.close();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(nombre);
		System.out.println("\"nombre\": " +json);
		
		json = gson.toJson(apellido);
		System.out.println("\"apellidos\": " +json);
		json = gson.toJson(edad);
		System.out.println("\"edad\": " +json);
	}
}
