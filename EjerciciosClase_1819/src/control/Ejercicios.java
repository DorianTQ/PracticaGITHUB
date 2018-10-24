package control;
import java.util.Random;
public class Ejercicios {
	// --------------- 04/10/2018 ACTIVIDAD: BUSCAR EN LA API
	// -------------------------------
	public void pruebasAPI() {
		/*
		 * 1. imprime por consola el valor de 2^3 - Usa la clase estática Math y
		 * su método pow (Cuando es estático no hace falta el new)
		 * 
		 * 2. Imprime un valor aleatorio entre 1 y 100 - Usa la clase
		 * java.util.Random y el método rnd 3. En la cadena
		 * "LAS PALMAS DE GRAN CANARIA", imprime "GRAN" -Usa el método substring
		 * de la clase java.lang.String
		 */

		// 1.
		System.out.println("1. " + Math.pow(2, 3));

		// 2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));

		// 3.
		System.out.println("3. "
				+ "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}

	// ACTIVIDAD: Mostrar por consola los números comprendidos entre dos
	// enteros, a y b

	// 1Parte método:. prototipo o cabecera
	public void listaIntervaloEnteros(int primero, int ultimo) {
		// 2Parte método: cuerpo o implementación del método
		/*
		 * int i=primero; while(i < ultimo) System.out.println(++i); i++; i=i+1;
		 */
		for (int j = primero; j <= ultimo; j++)
			System.out.println(j++);

		// true /false
		boolean condicion = true;
		if (condicion) {
			// en caso de verdadero
		} else {
			// la otra opción, falso
		}

	}

	// ---------------------- ACTIVIDAD
	// ----------------------------------------------------- 10/10/2018
	/*
	 * Dado una “cadena” (String) devolver el valor en forma de número entero
	 * correspondiente. Ejempo String: “ab95f1”
	 */

	// String cadena ="ab95f1";
	/*
	 * public static int converString(String cadena) { int numeros =
	 * Integer.parseInt(cadena); return numeros; }
	 */

	// ---------------------- ACTIVIDAD : Serie Fibonacci
	// --------------------------------------- 11/10/2018

	public static void serieFibonacci(int cuantos) {
		int num1 = 0;
		int num2 = 1;
		int total = 1;

		System.out.print(num1 + " ," + num2);
		for (int i = 1; i < cuantos; i++) {
			total = num1 + num2;
			System.out.print(" ," + total);
			num1 = num2;
			num2 = total;
		}
	}

	// ---------------------- ACTIVIDAD : Factorial (1.-Deberes
	// Casa)-------------------------------- 11/10/2018

	public static void factorial(int numFact) {
		int num1 = 1;
		if (numFact == 0 | numFact == 1) {
			System.out.println("El factorial de " + "'" + numFact + "'"
					+ " es :  1");
		} else {
			for (int i = 2; i <= numFact; i++) {
				num1 = num1 * i;
			}
			System.out.println("El factorial de " + "'" + numFact + "'"
					+ " es :" + num1);
		}
	}

	// ---------------------- ACTIVIDAD : Devolver el número menor de tres
	// (2.-Deberes Casa)----------- 11/10/2018

	public int calNumMenor(int x, int y, int z) {
		if (x < y)
			if (x < z)
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else
			return z;

	}
	public int calNumMenor(int x, int y, int z, int w) {
		
		int a = 0;
		{
		
		if (x <= y && x <= z && x <= w)
			a = x;
			else
				if (y <= x && y <= z && y <= w)
					a = y;
				else
					if (z <= x && z <= y && z <= w)
						a = z;
					else
						if (w <= x && w <= y && w <= z)
							a = w;
		return a;
		}
	}
		// --------------------- ACTIVIDAD : imprime por consola "n" números aleatorios entre 1 y 100
		// ----------- 17/10/2018
	public void imprimeAleatorios (int n) //n, cuantos numeros
	{	Random rnd = new Random();
		int numero=0;
		for(int i=0; i < n; i++) {
			numero = 1 + rnd.nextInt(100);
			System.out.println(i+1 + ".-" + numero);
		}
	}
	
		// ---------------------- ACTIVIDAD : generaListaAleatorios con numero inferior y superior.
		// ---------------------- 17/10/2018
	public void imprimeAleatorios (int n, int inferior, int superior) //n, cuantos numeros
	{	Random rnd = new Random();
		int numero=0;
		for(int i=0; i < n; i++) {
			numero = inferior+ rnd.nextInt(superior-inferior+1);
			System.out.println(i+1 + ".-" + numero);
		}
	}
	
	// ---------------------- ACTIVIDAD : generaListaAleatorios con numero inferior y superior en [Array]
	// ---------------------- 18/10/2018
	public int [] generaListaAleatorios(int n, int inferior, int superior)
	{	
		int[] resultado = new int[n];//Declaración en la Tabla de Simbolos.
		Random rnd = new Random();
		for(int i=0; i < n; i++) 
			resultado [i] = inferior+ rnd.nextInt(superior-inferior+1);
			return resultado;
	}
	// ---------------------- ACTIVIDAD : generaEstadisticaAparicion con Array
	// ---------------------- 18/10/2018
	public int[] generaEstadisticaAparicion (int n, int inferior, int superior) 
	{
		int[] resultado = new int[superior - inferior + 1];//Declaración en la Tabla de Simbolos.
		Random rnd = new Random();
		for(int i=0; i < n; i++) 
		{
			int numero = inferior+ rnd.nextInt(superior-inferior+1);
			resultado [numero-1]++;
		}
		return resultado;
	}
	public static void main(String[] args) 
	{	

		//------------------------------------------------------------------------------------------------------------------------------------------------
		/*
		//generalListaAleatorios con Array
		Ejercicios ejercicios = new Ejercicios ();
		int [] listaAleatorios = ejercicios.generaListaAleatorios(5, 1, 6);
		System.out.println(listaAleatorios); //Imprime caracteres referentes a su dirección (supongo).
		*/
		//------------------------------------------------------------------------------------------------------------------------------------------------
		//Llamando un método creando objeto.
		
		//Ejercicios ejercicios = new Ejercicios ();
		
		/*int menor = ejercicios.calNumMenor(12, 23, 45);
		System.out.println("El menor es:"+menor);*/
		
		//------------------------------------------------------------------------------------------------------------------------------------------------
		//Muestra de llamada calNumMenor siendo "Static"

		/*int menor=Ejercicios.calNumMenor(123, 321, 213, 231);
		System.out.println("El menor es:"+menor);*/
		
		//------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Muestra de imprimeAleatorios
		//ejercicios.imprimeAleatorios(5);
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		// Muestra de calNumMenor
		
		/*int a = 38452, b = 554556, c = 655445, d = 144800;
		System.out.println("el menor es : " + ejercicios.calNumMenor(a,b,c,d));
		System.out.println("Fin del programa");*/
	}
}
