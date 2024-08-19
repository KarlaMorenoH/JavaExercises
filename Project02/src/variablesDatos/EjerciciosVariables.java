package variablesDatos;

public class EjerciciosVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


//Booleans
 boolean esDivertido = true;
 boolean javaEsFacil = false;
 
//Byte
 byte minByte = -128;
 byte masByte = 127;
 
 //char
 char letraA = "A";
 char letraUnicoide = "\u0041";
 
 //short
 short minShort = -32768;
 short maxShort = 32767;
 
 // int
 int edad = 25;
 int salario = 5000;
 
 //long
 long distanciaTierraSol = 149600000000L; //Nota: "L" al final indica un long 
 
 //float
 float pi = 3.14F;//Nota: "F" al final indica un float
 
 //double
 double descuentos = 1.64298;

//Imprimir valores

 System.out.println()
 System.out.println()
 System.out.println()
 System.out.println()
 System.out.println()
 System.out.println()
 System.out.println()

//Conversión de tipo de datos

int numberInteger = 100;
double numberDouble = numberInteger; // conversión implícitade int a double
System.out.println("Conversión implícita: " + numberDouble); //100.0

double otherDouble = 99.99;
int otherInteger = (int) otherDouble; //Conversión explícita de double a int
System.out.println("Conversión explícita: " + otherInteger); //99

//OPERADORES

int suma = 5 + 3;
int resta = 5 - 3;
int multiplicacion = 5 * 3;
int division = 10 / 2;
int divisionPunto = 20.0 / 3.0;
int modulo = 10 % 3;

System.out.println("Suma " + suma);
System.out.println("Resta " + resta);
System.out.println("Multiplicación " + multiplicacion);
System.out.println("División " + division);
System.out.println("División con decimal " + divisionPunto);
System.out.println("Módulo " + modulo);

//OPERADORES COMPARATIVOS

boolean esIgual = (5 == 5);
boolean noEsIgual = (5 != 3);
boolean mayorQue = (5 > 3);
boolean menorQue = (3 < 5);
boolean mayorOIgualQue = (5 >= 3);
boolean menorOIgualQue = (3 <= 5);

System.out.println(" igual a :" + esIgual);
System.out.println(" no es igual a :" + noEsIgual);
System.out.println(" mayor que :" + mayorQue);
System.out.println(" menor que :" + menorQue);
System.out.println(" mayor o igual :" + mayorOIgualQue);
System.out.println(" menor o igual :" + menorOIgualQue);




