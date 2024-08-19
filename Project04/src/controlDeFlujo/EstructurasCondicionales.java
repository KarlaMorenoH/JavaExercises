package controlDeFlujo;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Instanciar un objeto de tipo Scanner:
		Scanner scanner = new Scanner(System.in);
//2. Darle contexto al usuario
		System.out.println("Ingresa tu nombre");
//3. Guardar el objeto Scanner instanciado en una variable
		String nombre = scanner.next();
//4. Imprimir la variable declarada
		System.out.println("Bienvenida " + nombre);
//*Si queremos solicitar al usuario otro dato, podermos usar el mismo Scanner:
		System.out.println("Ingresa tu edad");
		int edad = scanner.nextInt();
		
		System.out.println(nombre + " tu edad es de " + edad);

		
// Uso de if´s anidados
//Determinar si una persona es bebé, niño, adolescente, adulto o viejito
		
		if (edad >= 18 ) {
			if (edad < 60) {
				System.out.println("Es un adulto");
			} else {
				System.out.println("Es adulto mayor");
			}
		    } else if (edad >= 12 ) {
				System.out.println("Es un adolescente");
			} else if (edad >= 3 ) {
				System.out.println("Es un niño");
			} else {
				System.out.println("Es un bebé");
			}
			
//Ingresa un número del 1-7 para conocer el día de la semana
		
		System.out.println("Ingresa un número del 1 al 7 y ve qué día de la semana es");
		int numeroDia = scanner.nextInt();
		switch (numeroDia) {
		case 1: 
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Miércoles");
			break;	
		case 4: 
			System.out.println("Jueves");
			break;	
		case 5: 
			System.out.println("Viernes");
			break;
		case 6: 
			System.out.println("Sábado");
			break;
		case 7: 
			System.out.println("Domingo");
			break;	
		}
		
		//Por buenas prácticas, no olvidar cerrar el método scanner
		
		scanner.close();
	}//método

}//clase
