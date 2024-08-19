package ejercicios01;

import java.util.Scanner; //Para el ejercicio 3, 4

public class ExercisesHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//EJERCICIOS
//Ejercicio 1: Operadores Lógicos (&& y ||)
//Indicación: Escribe un programa que tome dos valores booleanos a y b y verifique si ambos son true o al menos uno de ellos es true. Imprime un mensaje adecuado para cada caso.
		
		        boolean a = true; 
		        boolean b = false; 

		        if (a && b) {
		            System.out.println("Ambos valores son verdadero");
		        } else if (a || b) {
		            System.out.println("Al menos uno de los valores es verdadero");
		        } else {
		            System.out.println("Ninguno de los valores es verdadero");
		        }
		        
 //Ejercicio 2: Operadores Lógicos (!)
//Indicación: Escribe un programa que tome un valor booleano c e invierta su valor usando el operador !. Imprime el valor original y el invertido.

		      boolean c = true; 

		      // Invertimos el valor de c con !
		      boolean valueInverted = !c;

		      // Imprimir el valor original e invertido
		      System.out.println("Valor original de c: " + c);
		      System.out.println("Valor invertido de c: " + valueInverted);
		        
//Ejercicio 3 : Determinar si un número es positivo, negativo o cero.
// Indicación: Escribe un programa en Java que solicite al usuario ingresar un número entero. Utiliza una estructura if-else para determinar si el número es positivo, negativo o cero. Imprime un mensaje adecuado para cada caso.		      
		      
		      Scanner scanner = new Scanner(System.in);

		      // Solicitar al usuario ingresar un número entero
		      System.out.print("Ingresa un número entero, ya sea positivo o negativo: ");
		        int number = scanner.nextInt();

		      // Usar operador ternario para determinar si es positivo, negativo o cero:
		      String resultado = (number > 0) ? "El número es positivo." : (number < 0) ? "El número es negativo." : "El número es cero.";

		      // Imprimir el resultado
		      System.out.println(resultado);

		       //scanner.close();  

//Ejercicio 4: Sistema de Calificaciones
//Indicación: Escribe un programa en Java que solicite al usuario ingresar una calificación en formato de letra (A, B, C, D, F). Utiliza una estructura switch para determinar el significado de la calificación y muestra un mensaje adecuado para cada caso (A para "Excelente", B para "Bueno", etc.). Si se ingresa una letra diferente, imprime un mensaje indicando que la calificación es inválida.		        
		        
		        Scanner scanner2 = new Scanner(System.in);

		        // Solicitar al usuario ingresar una calificación en formato de letra
		        System.out.print("Ingresa una calificación A, B, C, D, F (en mayúculas): ");
		        char calificacion = scanner.next().charAt(0);

		        // Utilizar switch para determinar el significado de la calificación
		        switch (calificacion) {
		            case 'A':
		          		System.out.println("Excelente");
		                break;
		            case 'B':
		        		System.out.println("Bueno");
		                break;
		            case 'C':
		         		System.out.println("Suficiente");
		                break;
		            case 'D':
		           		System.out.println("Deficiente");
		                break;
		            case 'F':
		      		    System.out.println("Reprobado");
		                break;
		            default:
		                System.out.println("Calificación inválida");
		                break;
		        }

		        //scanner.close();
		        
//Ejercicio 5: Gestión de Notificaciones en una Red Social
//Indicación: Escribe un programa en Java que simule la gestión de notificaciones en una red social. Solicita al usuario ingresar un número del 1 al 5 que representa diferentes tipos de notificaciones. Utiliza una estructura switch para mostrar el mensaje correspondiente a cada tipo de notificación.		        
		        
		        Scanner scanner3 = new Scanner(System.in);

		        // Solicitar al usuario ingresar un número del 1 al 5
		        System.out.println("Gestión de Notificaciones");
		        System.out.println("1 - Nueva solicitud de amistad");
		        System.out.println("2 - Nuevo mensaje");
		        System.out.println("3 - Nueva mención en un comentario");
		        System.out.println("4 - Nueva reacción a una publicación");
		        System.out.println("5 - Nueva actualización de perfil");
		        System.out.print("Selecciona el tipo de notificación (1-5): ");
		        int option = scanner3.nextInt();

		        // Utilizar switch para mostrar el mensaje correspondiente
		        switch (option) {
		            case 1:
		                System.out.println("Tienes una nueva solicitud de amistad.");
		                break;
		            case 2:
		                System.out.println("Tienes un nuevo mensaje.");
		                break;
		            case 3:
		                System.out.println("Has sido mencionado en un comentario.");
		                break;
		            case 4:
		                System.out.println("Alguien ha reaccionado a tu publicación.");
		                break;
		            case 5:
		                System.out.println("Tu perfil ha sido actualizado.");
		                break;
		            default:
		                System.out.println("Opción inválida. Por favor, selecciona un número del 1 al 5.");
		                break;
		        }

		        scanner.close();
		        
		        
		      }//método
	}//clase

