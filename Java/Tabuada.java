//Gabriel Pereira Alves - 2°DSN
package teste;
import java.util.Scanner;
public class Tabuada 
{
	public static void main(String[] args) 
	{
		int tabuada, vezes;
		int resultado = 0;
		Scanner in;
		
		System.out.println("Digite a tabuada desejada: ");
		in = new Scanner(System.in);
		tabuada = in.nextInt();
		
		System.out.println("Digite quantas vezes: ");
		in = new Scanner(System.in);
		vezes = in.nextInt();
		
		for(int i = 0; i < vezes; i++) 
		{
			resultado = resultado + tabuada;
			System.out.println(resultado);
		}
	}

}
