// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class CelsiusParaFarenheit {

	public static void main(String[] args) {
		double celsius = 0; 
		double farenheit = 0;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));
		
		farenheit = celsius * 1.8 + 32;
		
		JOptionPane.showMessageDialog(null, celsius + "°C é igual a " + farenheit + "°F");
	}

}
