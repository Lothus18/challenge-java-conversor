package conversor;

import javax.swing.JOptionPane;

public class ConverterTemperatura {
	public void ConverterCelsiusParaFahrenheit(double valor) {
		double temperaturaCelsius = (1.8 * valor) + 32;
		temperaturaCelsius = (double) Math.round(temperaturaCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura equivale a " + temperaturaCelsius + " graus Fahrenheit.");
	}
	
	public void ConverterCelsiusParaKelvin(double valor) {
		double temperaturaCelsius = valor + 273;
		temperaturaCelsius = (double) Math.round(temperaturaCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura equivale a " + temperaturaCelsius + " graus Kelvin.");
	}
	
	public void ConverterFahrenheitParaCelsius(double valor) {
		double temperaturaFahrenheit = (valor - 32) / 1.8;
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura equivale a " + temperaturaFahrenheit + " graus Celsius.");
	}
	
	public void ConverterFahrenheitParaKelvin(double valor) {
		double temperaturaFahrenheit = (((valor - 32) / 1.8) + 273);
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura equivale a " + temperaturaFahrenheit + " graus Kelvin.");
	}
	
	public void ConverterKelvinParaCelsius(double valor) {
		double temperaturaKelvin = valor - 273;
		temperaturaKelvin = (double) Math.round(temperaturaKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura equivale a " + temperaturaKelvin + " graus Celsius.");
	}
	
	public void ConverterKelvinParaFahrenheit(double valor) {
		double temperaturaKelvin = (((valor - 273) * 1.8) + 32);
		temperaturaKelvin = (double) Math.round(temperaturaKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura equivale a " + temperaturaKelvin + " graus Fahrenheit.");
	}
}
