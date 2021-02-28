// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class AnoNascimento {

	public static void main(String[] args) {
		int ano, idade, nascimento;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		
		nascimento = ano - idade;
		
		JOptionPane.showMessageDialog(null, "Você nasceu em " + nascimento);
	}

}
