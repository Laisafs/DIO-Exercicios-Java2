package ExerciciosMetodos;
//Crie uma aplicação que calcule a area dos quadrilateros notáveis: quadrado. retangulo e trapézio - UTILIZANDO SOBRECARGA

public class Quadrilateros {

	public static void calcularArea(double lado) {
		double calculo = lado * lado;
		System.out.println(" A área do quadrado é: " + calculo);
	}

	public static void calcularArea(double ladoMenor, double ladoMaior) {
		double calculo = ladoMenor * ladoMaior;
		System.out.println("A área do retângulo é: " + calculo);

	}

	public static void calcularArea(double baseMenor, double baseMaior, double altura, final int divisor) {
		double calculo = ((baseMenor + baseMaior) * altura) / divisor;
		System.out.println("A área do trapézio é: " + calculo);

	}

}
