// Gabriel Pereira Alves - 2°DSN
package Exercicios;
import javax.swing.JOptionPane;
public class MediaNotas {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota:"));
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media < 5) 
		{
			JOptionPane.showMessageDialog(null, "REPROVADO!");
		}
		if(media >= 5 && media < 6) 
		{
			JOptionPane.showMessageDialog(null, "EM RECUPERAÇÃO!");
		}
		if(media >= 6) 
		{
			JOptionPane.showMessageDialog(null, "APROVADO!");
		}
	}

}
