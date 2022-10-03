package Conversor;

import javax.swing.JOptionPane;

public class IniciarConversorDistancia {
	public void iniciar(String escolheDistancia, String tipoDistancia[]) {
		ConverterDistancia cd = new ConverterDistancia();
		String input = null;
		double valor;

		do {
			if (escolheDistancia == tipoDistancia[0]) {
				input = JOptionPane.showInputDialog(null, " Digite um valor em Km para ser convertido em Milhas ");
				if (input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cd.ConverteParaMilha(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}

			} else if (escolheDistancia == tipoDistancia[1]) {
				input = JOptionPane.showInputDialog(null, " Digite um valor em Milhas para ser convertido em Km ");
				if (input.matches("(?:\\.|[0-9])*")) {
					valor = Double.parseDouble(input);
					cd.ConverteParaKM(valor);
				} else {
					JOptionPane.showMessageDialog(null, "Digite apenas números com ponto(.)");
				}
			}

		} while (!input.matches("(?:\\.|,|[0-9])*"));
	}
}
