package br.lpoo.unieuro.aula8_9;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {

		String valor = JOptionPane
				.showInputDialog("Escolha uma nos valores para a opera��o \n"
						+ "1 - Soma \n" + "2 - Subtra��o \n"
						+ "3 - Multiplica��o \n" + "4 - Divis�o");
		int Valor = Integer.parseInt(valor);
		double a, b, resultado;
		String A, B;

		A = JOptionPane.showInputDialog("Insira o valor 1");
		B = JOptionPane.showInputDialog("Insira o valor 2");
		a = Double.parseDouble(A);
		b = Double.parseDouble(B);

		switch (Valor) {
		case 1:
			resultado = a + b;
			JOptionPane.showMessageDialog(null, "O resultado � " + resultado);
			break;
		case 2:
			resultado = a - b;
			JOptionPane.showMessageDialog(null, "O resultado � " + resultado);
			break;
		case 3:
			resultado = a * b;
			JOptionPane.showMessageDialog(null, "O resultado � " + resultado);
			break;
		case 4:
			if (b != 0) {
				resultado = a / b;
				JOptionPane.showMessageDialog(null, "O resultado � "
						+ resultado);
			} else {
				JOptionPane.showMessageDialog(null, "Imposs�vel divis�o por 0");
			}
			break;
		}

	}

}
