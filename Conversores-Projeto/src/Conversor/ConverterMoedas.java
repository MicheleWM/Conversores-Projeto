package Conversor;

import javax.swing.JOptionPane;

public class ConverterMoedas {
	public void ReaisParaDolares(double valor) {
		double dolar = valor / 5.06;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Reais(R$) equivale a: " + dolar + " Doláres(US$).");
	}

	public void ReaisParaEuros(double valor) {
		double euros = valor / 5.05;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Reais(R$) equivale a: " + euros + " Euros(€).");
	}

	public void ReaisParaLibras(double valor) {
		double libras = valor * 0.17;
		libras = (double) Math.round(libras * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Reais(R$) equivale a: " + libras + " Libras Esterinas(£).");
	}

	public void ReaisParaPesoA(double valor) {
		double pesoA = valor * 27.27;
		pesoA = (double) Math.round(pesoA * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Reais(R$) equivale a: " + pesoA + " Pesos Argentino($).");
	}

	public void ReaisParaPesoC(double valor) {
		double pesoC = valor * 178.35;
		pesoC = (double) Math.round(pesoC * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Reais(R$) equivale a: " + pesoC + " Peso Chileno($).");
	}

	
	public void DolaresParaReais(double valor) {
		double dolar = valor * 5.06;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Dólares(US$) equivale a: " + dolar + " Reais(R$).");
	}

	public void EurosParaReais(double valor) {
		double euros = valor * 5.05;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Euros(€) equivale a: " + euros + " Reais(R$).");
	}

	public void LibrasParaReais(double valor) {
		double libras = valor * 5.95;
		libras = (double) Math.round(libras * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Libras Esterinas(£) equivale a: " + libras + " Reais(R$).");
	}

	public void PesoAParaReais(double valor) {
		double pesoA = valor / 27.27;
		pesoA = (double) Math.round(pesoA * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Peso Argentino($) equivale a: " + pesoA + " Reais(R$).");
	}

	public void PesoCParaReais(double valor) {
		double pesoC = valor / 178.35;
		pesoC = (double) Math.round(pesoC * 100d) / 100;
		JOptionPane.showMessageDialog(null, valor + " Peso Chileno($) equivale a: " + pesoC + " Reais(R$).");
	}
}