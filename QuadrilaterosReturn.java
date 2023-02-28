package ExerciciosMetodos;
//Crie uma aplicação que calcule a area dos quadrilateros notáveis: quadrado. retangulo e trapézio - UTILIZANDO RETURN

public class QuadrilaterosReturn {

	public static double areaQuadrado(double lado) {
		return lado * lado;
	}

	public static double areaRetangulo(double ladoMenor, double ladoMaior) {
		return ladoMenor * ladoMaior;
	}

	public static double areaTrapezio(double baseMenor, double baseMaior, double altura, final double divisor) {
		return ((baseMenor + baseMaior) * altura) / divisor;
	}

}
