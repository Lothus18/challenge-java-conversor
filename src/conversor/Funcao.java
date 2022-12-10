package conversor;

import javax.swing.JOptionPane;

public class Funcao {
	
	ConverterMoedas moedas = new ConverterMoedas();
	
	public void ConverterMoedas(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha para qual moeda você deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De reais para dólares", "De reais para euros", "De reais para libras", "De reais para ienes", "De reais para wons", "De dólares para reais", "De euro para reais", "De libras para reais", "De ienes para reais", "De wons para reais"}, "Escolha")).toString();
		switch(opcao) {
		case "De reais para dólares":
			moedas.ConverterReaisParaDolar(valorRecebido);
			break;
		case "De reais para euros":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;	
		case "De reais para libras":
			moedas.ConverterReaisParaLibra(valorRecebido);
			break;
		case "De reais para ienes":
			moedas.ConverterReaisParaIene(valorRecebido);
			break;
		case "De reais para wons":
			moedas.ConverterReaisParaWon(valorRecebido);
			break;
		case "De dólares para reais":
			moedas.ConverterReaisParaDolar(valorRecebido);
			break;
		case "De euros para reais":
			moedas.ConverterReaisParaEuro(valorRecebido);
			break;
		case "De libras para reais":
			moedas.ConverterReaisParaLibra(valorRecebido);
			break;
		case "De ienes para reais":
			moedas.ConverterReaisParaIene(valorRecebido);
			break;
		case "De wons para reais":
			moedas.ConverterReaisParaWon(valorRecebido);
			break;
		}
	}
		
	ConverterTemperatura temperatura = new ConverterTemperatura();
		
	public void ConverterTemperatura(double TemperaturaInserida) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha para qual temperatura você deseja converter.", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius para Fahrenheit", "De Celsius para Kelvin", "De Fahrenheit para Celsius", "De Fahrenheit para Kelvin", "De Kelvin para Celsius", "De Kelvin para Fahrenheit"}, "Escolha")).toString();
		switch(opcao) {
		case "De Celsius para Fahrenheit":
			temperatura.ConverterCelsiusParaFahrenheit(TemperaturaInserida);
			break;
		case "De Celsius para Kelvin":
			temperatura.ConverterCelsiusParaKelvin(TemperaturaInserida);
			break;	
		case "De Fahrenheit para Celsius":
			temperatura.ConverterFahrenheitParaCelsius(TemperaturaInserida);
			break;
		case "De Fahrenheit para Kelvin":
			temperatura.ConverterFahrenheitParaKelvin(TemperaturaInserida);
			break;
		case "De Kelvin para Celsius":
			temperatura.ConverterKelvinParaCelsius(TemperaturaInserida);
			break;
		case "De Kelvin para Fahrenheit":
			temperatura.ConverterKelvinParaFahrenheit(TemperaturaInserida);
			break;
		}
	}
}
