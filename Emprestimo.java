package ExerciciosMetodos;
/*Calcule o valor de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam. 
Defina arbitramente as faixas que influenciem nos valores*/

public class Emprestimo {

	public static double getDuasParcelas() {
		return 0.15;
	}

	public static double getTresParcelas() {
		return 0.20;
	}

	public static void calcular(double valor, int parcelas) {

		if (parcelas == 2) {

			double valorFinal = valor + (valor * getDuasParcelas());
			System.out.println("Valor de emprestimo para duas parcelas R$" + valorFinal);
		}

		else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTresParcelas());
			System.out.println("Valor de emprestimo para três parcelas R$" + valorFinal);
		} else {
			System.out.println("Quantidade de parcelas não aceitas");
		}
	}
}
