// Gabriel Pereira Alves - 2�DSN
package Exercicios;
import javax.swing.JOptionPane;
public class DescontoSalario {

	public static void main(String[] args) {
		double salario, desconto;
		double salariofinal;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sal�rio: "));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto (em %)"));
		
		desconto = salario * (desconto / 100);
		salariofinal = salario - desconto;
		
		JOptionPane.showMessageDialog(null, "O salario final � de: R$" + salariofinal);
	}

}
