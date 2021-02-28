// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class ParOuImpar {

	public static void main(String[] args) {
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		
		if(valor % 2 == 0) 
		{
			JOptionPane.showMessageDialog(null, valor + " É Par!");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, valor + " É Impar!");
		}
	}

}
