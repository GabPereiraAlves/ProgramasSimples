// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class DivisivelPor6 {

	public static void main(String[] args) {
		int valor1, valor2;
		int resultado = 0;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
		
		for(int i = valor1; i < valor2; i++) 
		{
			if(i % 6 == 0) 
			{
				resultado++;
			}
		}
		JOptionPane.showMessageDialog(null, resultado + " valores entre " + valor1 + " e " + valor2 + " são divisiveis por 6!");
	}

}
