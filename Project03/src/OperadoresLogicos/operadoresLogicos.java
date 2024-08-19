package OperadoresLogicos;

 class operadoresLogicos {

	public static void main(String[] args) {
		// OPERADORES LÓGICOS
		int age = 25;
		boolean HaveLicense;
		boolean boolean1 = HaveLicense = true;
		boolean DoNotHaveLicense;
		boolean boolean2 = DoNotHaveLicense = true;
		 
		//conditional && and !
		
		boolean doNotHaveLicense = false;
		boolean haveLicense = false;
		if (haveLicense && doNotHaveLicense && ! (age <18)) {
			System.out.println("Puede conducir");
		} else {
			System.out.println("No puede conducir ¡Cuidado!");
		}

		//Conditional ||
		boolean esFeriado = false;
		boolean esDiaNormal = true;
		
		if (esFeriado || esDiaNormal) {
			System.out.println("Descansito");
			} else {
			System.out.println("A trabajar");
			}
		
		//Ejemplo de autentificación
		
		boolean usuarioValido = true;
		boolean usuarioNoValido = false;
		
		if(usuarioValido && usuarioNoValido) {
			System.out.println("Bienvenido al sitio web...");
			} else {
				System.out.print("Revise sus datos");
			}
		
	}//método

}//clase
