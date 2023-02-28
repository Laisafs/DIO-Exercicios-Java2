package ExerciciosMetodos;

public class Main {

	public static void main(String[] args) {

		System.out.println("Exercicio Calculadora");
		Calculadora.soma(20, 55);
		Calculadora.subtracao(60, 27);
		Calculadora.multiplicacao(5, 3.5);
		Calculadora.divisao(7, 2.5);

		System.out.println(" ");

		System.out.println("Exercicio Mensagem");
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(13);
		Mensagem.obterMensagem(1);

		System.out.println(" ");

		System.out.println("Exercicio Empréstimo");
		Emprestimo.calcular(55.00, 3);

		System.out.println(" ");

		System.out.println("Exercicio Calculo dos Quadriláteros - UTILIZANDO SOBRECARGA");
		Quadrilateros.calcularArea(5);
		Quadrilateros.calcularArea(15, 30);
		Quadrilateros.calcularArea(20, 40, 60, 2);

		System.out.println(" ");

		System.out.println("Exercicio Calculo dos Quadriláteros - UTILIZANDO RETURN");
		double quadrado = QuadrilaterosReturn.areaQuadrado(10);
		System.out.println("A área do quadrado: " + quadrado);
		double retangulo = QuadrilaterosReturn.areaRetangulo(20, 40);
		System.out.println("A área do retangul: " + retangulo);
		double trapezio = QuadrilaterosReturn.areaTrapezio(30, 50, 70, 2);
		System.out.println("A área de trapézio: " + trapezio);

	}

}
