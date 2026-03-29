package Entrega2;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		int exercicio = -1;
		
		while (exercicio != 0)
		{
			System.out.println("\n----------------------//----------------------");
			System.out.println("\nEntrega 2 - Hands On: Estrutura de Controle II");
			System.out.println("\n----EXERCÍCIOS----");
			System.out.println("\n1. EXERCÍCIO 1");
			System.out.println("2. EXERCÍCIO 2");
			System.out.println("3. EXERCÍCIO 3");
			System.out.println("4. EXERCÍCIO 4");
			System.out.println("\n----PARA SAIR----");
			System.out.println("\n0. SAIR");
			System.out.print("\nDigite o número do exercício: ");
			exercicio = sc.nextInt();
			
			switch (exercicio)
			{
			case 1:
				System.out.println( "\nExercício 1:");
				System.out.println( "\n +\"\"\"\"\"+ ");
				System.out.println( "[| o o |]" );
				System.out.println( " |  ^  | ");
				System.out.println( " | '-' | ");
				System.out.println( " +-----+ ");
				break;
				
			case 2:
				System.out.println("\nExercício 2:");
				
				double x1 = Math.toRadians (25);
				double y1 = Math.toRadians (35);
				double x2 = Math.toRadians (35.5);
				double y2 = Math.toRadians (25.5);
				double raio = 6371.01;
				
				double d = raio * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
				
			    System.out.println("\nA distància da entre esses pontos é: " + d + " km.");
			    break;			    
				
			case 3:
				System.out.println("\nExercício 3:");
				System.out.print("\nDigite uma palavra ou frase: ");
				sc.nextLine(); // <-- Descarta o Enter que sobrou
				String texto = sc.nextLine();
				
				int letras = 0;
				int espaco = 0;
				int numero = 0;
				int caracter = 0;
				
				for (int i = 0; i < texto.length(); i++)
				{
					char c = texto.charAt(i);
					
					if (Character.isLetter(c))
					{
						letras++;
					}
					else if (Character.isDigit(c))
					{
						numero++;
					}
					else if (c == ' ')
					{
						espaco++;
					}
					else
					{
						caracter++;
					}
					}
				System.out.println("\nLetras: " + letras);
				System.out.println("Números: " + numero);
				System.out.println("Espaços: " + espaco);
				System.out.println("Caracteres Especiais: " + caracter);
				break;
				
			case 4:
				System.out.println("\nExercício 4:");
				
				int tentativas = 0;
				boolean acertou = false;
				
				while (tentativas < 3 && !acertou)
				{				
				System.out.println("\n----ALTERNATIVAS----");
				System.out.println("\nA. A função if permite executar um código somente se uma condição lógica for verdadeira.");
				System.out.println("B. A função if permite executar um código somente se uma condição lógica for falsa.");
				System.out.println("C. A função while não é uma estrutura de repetição.");
				System.out.println("D. Quando vamos fazer uma case, na função switch, é necessário usar condições e não valores fixos.");
				System.out.println("E. O comando switch pode ser usado com variáveis tipo double.");
				System.out.print("\nQual alternativa está correta? ");
				String resposta = sc.next();
				
				switch (resposta)
				{
				case "A" , "a":
					System.out.println("\nResposta Correta!");
				    acertou = true;
					break;
					
				case "B" , "b":
				case "C" , "c":
				case "D" , "d":
				case "E" , "e":
					tentativas++;
				
				if (tentativas < 3)
				{
					System.out.println("\nRespota incorreta! Tente novamente.");
				}
				else
				{
				System.out.println("\nResposta incorreta nas 3 tentativas.");
				}
				break;
				
				default:
					System.out.println("Opção Inválida.");
				}
				
				System.out.println("\nTentativas: " + tentativas + "/3");
				}
				break;
				
			case 0:
				System.out.println("\nOperação finalizada.\nSaindo...\n"
						         + "\nALUNO: Luis Felipe Oliveira Machado"
						         + "\nRA: 42320328");
				break;
				
			default:
				System.out.println("\nOpção inválida.\nEscolha uma das opções disponíveis.");
				break;						
			}
		}
		sc.close();
	}
}