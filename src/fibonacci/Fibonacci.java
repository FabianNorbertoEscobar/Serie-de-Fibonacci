package fibonacci;

public class Fibonacci {

	/**
	 * Calcula el enésimo término de la serie de Fibonacci. <br>
	 * Implementación recursiva. Complejidad Computacional: O(2^n).
	 * @param n es el índice de la serie de Fibonacci
	 * @return el enésimo término de la serie de Fibonacci
	 * @throws ArithmeticException
	 */
	public static int recursivoDe(int n) throws ArithmeticException {
		if (n < 0) {
			throw new ArithmeticException("La serie de Fibonacci está definida para números naturales");
		} else if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		} else {
			return recursivoDe(n - 1) + recursivoDe(n - 2);
		}
	}

	/**
	 * Calcula el enésimo término de la serie de Fibonacci. <br>
	 * Implementación iterativa. Complejidad Computacional: O(n).
	 * @param n es el índice de la serie de Fibonacci
	 * @return el enésimo término de la serie de Fibonacci
	 * @throws ArithmeticException
	 */
	public static int iterativoDe(int n) throws ArithmeticException {
		if (n < 0) {
			throw new ArithmeticException("La serie de Fibonacci está definida para números naturales");
		} else if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		}

		int primero = 1;
		int segundo = 1;
		int fibonacci = 0;

		while (n > 2) {
			fibonacci = primero + segundo;
			primero = segundo;
			segundo = fibonacci;
			n--;
		}
		return fibonacci;
	}

	/**
	 * Calcula el enésimo término de la serie de Fibonacci. <br>
	 * Implementación matricial. Complejidad Computacional: O(log(n)).
	 * @param n es el índice de la serie de Fibonacci
	 * @return el enésimo término de la serie de Fibonacci
	 * @throws ArithmeticException
	 */
	public static int matricialDe(int n) throws ArithmeticException {
		if (n < 0) {
			throw new ArithmeticException("La serie de Fibonacci está definida para números naturales");
		}
		double[][] fibonacci = { { 1, 1 }, { 1, 0 } };
		MatrizMath matriz = new MatrizMath(2, 2, fibonacci);
		MatrizMath potencia = matriz.potencia(n);
		return (int) potencia.getValor(0, 1);
	}

	/**
	 * Indica si un número pertenece a la serie de Fibonacci.
	 * @param n es el número a buscar
	 * @return true or false
	 */
	public static boolean incluyeA(int n) {
		if (n < 0) {
			return false;
		} else if (n <= 2) {
			return true;
		}

		int primero = 0;
		int segundo = 1;
		int fibonacci = 0;

		do {
			fibonacci = primero + segundo;
			primero = segundo;
			segundo = fibonacci;
		} while (fibonacci < n);
		return fibonacci == n;
	}
}
