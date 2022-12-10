package conversor;

import javax.swing.JOptionPane;

public class ConverterMoedas {
	public void ConverterReaisParaDolar(double valor) {
		double moedaDolar = valor / 5.23;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " dólares.");
	}
	
	public void ConverterReaisParaEuro(double valor) {
		double moedaEuro = valor / 5.52;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " euros.");
	}
	
	public void ConverterReaisParaLibra(double valor) {
		double moedaLibra = valor / 6.43;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " libras.");
	}
	
	public void ConverterReaisParaIene(double valor) {
		double moedaIene = valor / 0.038;
		moedaIene = (double) Math.round(moedaIene * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaIene + " ienes.");
	}
	
	public void ConverterReaisParaWon(double valor) {
		double moedaWon = valor / 0.0040;
		moedaWon = (double) Math.round(moedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaWon + " wons.");
	}
	
	public void ConverterDolarParaReais(double valor) {
		double moedaDolar = valor * 5.23;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " reais.");
	}
	
	public void ConverterEuroParaReais(double valor) {
		double moedaEuro = valor * 5.52;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " reais.");
	}
	
	public void ConverterLibraParaReais(double valor) {
		double moedaLibra = valor * 6.43;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " reais.");
	}
	
	public void ConverterIeneParaReais(double valor) {
		double moedaIene = valor * 0.038;
		moedaIene = (double) Math.round(moedaIene * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaIene + " reais.");
	}
	
	public void ConverterWonParaReais(double valor) {
		double moedaWon = valor * 0.0040;
		moedaWon = (double) Math.round(moedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaWon + " reais.");
	}
	
	
}
