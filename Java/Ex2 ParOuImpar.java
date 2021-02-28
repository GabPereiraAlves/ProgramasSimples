//Gabriel Pereira Alves - 2°DSN
package teste;
import java.util.Scanner;
public class ParOuImpar 
{

	public static void main(String[] args)
	{
		int numero, resto;
		Scanner in;
		
		System.out.println("Digite um número: ");
		in = new Scanner(System.in);
		numero = in.nextInt();
		
		resto = numero % 2;
		
		if(resto == 1) 
		{
			System.out.println(numero + " É Impar!");
		}else 
		{
			System.out.println(numero + " É Par!");
		}
	}

}
