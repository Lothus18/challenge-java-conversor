package conversor;

import javax.swing.JOptionPane;

public class Principal {
	
	static Funcao moeda = new Funcao();
	
	static Funcao temperatura = new Funcao();

	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moedas", "Conversor de Temperatura"}, "Escolha").toString();
		switch (opcoes) {
		case "Conversor de Moedas":
			String input = JOptionPane.showInputDialog("Insira um valor");
			double valorRecebido = Double.parseDouble(input);
			moeda.ConverterMoedas(valorRecebido);
			
		case "Conversor de Temperatura":
			String input2 = JOptionPane.showInputDialog("Insira a temperatura");
			double TemperaturaInserida = Double.parseDouble(input2);
			temperatura.ConverterTemperatura(TemperaturaInserida);	
		}
			
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if(JOptionPane.OK_OPTION == resposta) {
			System.out.println("Escolha a opção afirmativa");	
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	}

}
