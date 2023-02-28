package ExerciciosMetodos;

/*Calcule as 4 operações basicas: soma, subtração, multiplicação e divisão 
Sempre dois valores devem sem passados */

public class Calculadora {

	public static void soma(double numero1, double numero2) {

		double resultado = numero1 + numero2;
		System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + resultado);

	}

	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("A subtração de " + numero1 + " - " + numero2 + " = " + resultado);

	}

	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("A multiplicacao de " + numero1 + " * " + numero2 + " = " + resultado);
	}

	public static void divisao(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("A divisão de " + numero1 + " / " + numero2 + " = " + resultado);
	}
}