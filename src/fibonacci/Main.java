package fibonacci;

public class Main {

	public static void main(String[] args) {

		System.out.println("SERIE DE FIBONACCI");

		System.out.println("Generada de forma iterativa:");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Fibonacci de " + i + ": " + Fibonacci.iterativoDe(i));
		}

		System.out.println("Generada de forma recursiva:");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Fibonacci de " + i + ": " + Fibonacci.recursivoDe(i));
		}

		System.out.println("Generada de forma matricial:");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Fibonacci de " + i + ": " + Fibonacci.matricialDe(i));
		}
		
		System.out.println("¿Pertenece a la serie de Fibonacci?");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i);
			if (Fibonacci.incluyeA(i)) {
				System.out.println(" SI");
			} else {
				System.out.println(" NO");
			}
		}
	}

}
