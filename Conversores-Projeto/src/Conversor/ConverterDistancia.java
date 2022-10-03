package Conversor;

import javax.swing.JOptionPane;

public class ConverterDistancia {

	public void ConverteParaMilha(double valor) {
		double km = valor / 1.609;

		String formatada = String.format(" %.2f", km).replaceAll(",", ".");
		JOptionPane.showMessageDialog(null, valor + " Km equivale a: " + formatada + " Milhas.");
	}

	public void ConverteParaKM(double valor) {
		double milha = valor * 1.609;
		String formatada = String.format(" %.2f", milha).replaceAll(",", ".");
		JOptionPane.showMessageDialog(null, valor + " Milhas equivale a: " + formatada + " Km.");

	}
}
