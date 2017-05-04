package miPack;

public class Fibonacci {

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
