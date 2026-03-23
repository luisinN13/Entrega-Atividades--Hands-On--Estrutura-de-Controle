package Entrega1;

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
			System.out.println("\nEntrega 1 - Hands On: Estrutura de Controle");
			System.out.println("\n----EXERCÍCIOS----");
			System.out.println("1. EXERCÍCIO 1");
			System.out.println("2. EXERCÍCIO 2");
			System.out.println("3. EXERCÍCIO 3");
			System.out.println("4. EXERCÍCIO 4");
			System.out.println("5. EXERCÍCIO 5");
			System.out.println("6. EXERCÍCIO 6");
			System.out.println("7. EXERCÍCIO 7");
			System.out.println("8. EXERCÍCIO 8");
			System.out.println("9. EXERCÍCIO 9");
			System.out.println("10. EXERCÍCIO 10");
			System.out.println("\n----PARA SAIR----");
			System.out.println("0. SAIR");
			System.out.print("\nEscolha um exercício: ");
			exercicio = sc.nextInt();
		
		
		switch (exercicio)
		{
		case 1: 
			int n1;
			System.out.println("\nExercício 1: Par ou Impar\n");
			System.out.print("Informe um número: ");
		    n1 = sc.nextInt();
		    
		    if (n1 % 2 == 0)
			{
			System.out.println("");
			System.out.println(n1 + " é PAR.");
			}
			else
			{
			System.out.println("");
			System.out.println(n1 + " é IMPAR.");
			}
			break;
			
		case 2:
			int n2;
			int n3;
			
			System.out.println("\nExercício 2: Maior de Dois\n");
			System.out.print("Informe um número: ");
			n2 = sc.nextInt();
			System.out.print("Informe outro número: ");
			n3 = sc.nextInt();
			
			if (n2>n3)
			{
				System.out.print("\n" + n2 + " é maior que " + n3 + ".");
			}
			else if (n2 == n3)
			{
				System.out.print("\n" + n2 + " e " + n3 + " são iguais.");
			}
			else
			{
				System.out.print("\n" + n3 + " é maior que " + n2 + ".");
			}
			break;
			
		case 3:
			System.out.println("\nExercício 3: Calculadora com Menu\n");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1. SOMAR");
			System.out.println("2. SUBSTRAIR");
			System.out.println("3. MULTIPLICAR");
			System.out.println("4. DIVIDIR");
			int opcao = sc.nextInt();
			
			System.out.println("");
			
			System.out.print("Informe um número: ");
			double n4 = sc.nextDouble();
			
			System.out.print("Informe outro número: ");
			double n5 = sc.nextDouble();
			
			double resultado;
			
			switch(opcao)
			{
			case 1:
				resultado = n4 + n5;
				System.out.println("\nA soma dos números é: " + resultado);
				break;
			
			case 2:
				resultado = n4 - n5;
				System.out.println("\nA substração dos números é: " + resultado);
				break;
				
			case 3:
				resultado = n4 * n5;
				System.out.println("\nA multiplicação dos números é: " + resultado);
				break;
					
			case 4:
				if (n5 != 0)
				{
					resultado = n4 / n5;
					System.out.println("\nA divisão dos números é: " + resultado);
				}
				else
				{
					System.out.println("\nNão é possível realizar divisão por 0.");
				}
				break;
				
				default:
					System.out.println("\nOpção inválida.");
			}
			break;
			
		case 4:
			System.out.println("\nExercício 4: Validação de Entrada\n");
			System.out.print("Informe o valor da nota (0 a 100): ");
			double nota = sc.nextDouble();
			
			while (nota < 0 || nota > 100)
			{
				System.out.println("\nNota inválida.\nTente Novamente.");
				System.out.print("Informe um nova nota: ");
				nota = sc.nextDouble();
			}
			System.out.println("\nNota válida registrada: " + nota);
			break;
			
		case 5:
			System.out.println("\nExercício 5: Sentinela\n");
			
			System.out.print("Informe um número (0 para parar): ");
			double n6 = sc.nextDouble();
			
			if (n6 == 0)
			{
				System.out.println("\nOperação finalizada. Nenhum número registrado.");
			}
			else
			{
				double maior = n6;
				double menor = n6;
				
				while (n6 != 0)
				{
					if (n6 > maior)
					{
						maior = n6;
					}
					if (n6 < menor)
					{
						menor = n6;
					}
				
				System.out.print("Informe um número (0 para parar): ");
				n6 = sc.nextDouble();
				}
				
				System.out.println("\nOperação finalizada.");
				System.out.println("Maior número digitado: " + maior);
				System.out.println("Menor número digitado: " + menor);
			}
			break;
			
		case 6:
			System.out.println("\nExercício 6: Simulador de Caixa");

			int selecao = 0;
			double saldo = 1000;
			
			while (selecao != 4)
			{
				System.out.println("\n-----MENU-----");
				System.out.println("1. DEPOSITAR");
				System.out.println("2. SACAR");
				System.out.println("3. VER SALDO");
				System.out.println("4. SAIR");
				System.out.print("Escolha uma das opções: ");
				selecao = sc.nextInt();
				
			switch (selecao)
			{
			case 1:
				System.out.print("\nDeposite um valor: ");
				double deposito = sc.nextDouble();
				
				if (deposito > 0)
				{
					saldo += deposito;
					System.out.println("Valor depositado!");
				}
				else
				{
					System.out.println("Não foi possível realizar o depósito.");
				}
				break;
				
			case 2: 
				System.out.print("\nDigite o valor para saque: ");
				double saque = sc.nextDouble();
				
				if (saque > 0 && saque <= saldo)
				{
					saldo -= saque;
					System.out.println("Saque realizado!");
				}
				else
				{
					System.out.println("Não foi possível realizar o saque.");
				}
				break;
				
			case 3:
				System.out.println("\nSaldo: " + saldo);
				break;
				
			case 4:
				System.out.println("\nSaindo...");
				break;
				
			default:
				System.out.println("Opçao inválida;");
			}	
			}
			System.out.println("\nSaldo final: " + saldo);
			break;
			
		case 7:
			System.out.println("\nExercício 7: Desconto por categoria\n");
			
			System.out.print("Informe o valor da compra: ");
			double valorcompra = sc.nextDouble();
			
			System.out.println("\nCATEGORIAS PARA DESCONTO: ");
			System.out.println("1. Comum");
			System.out.println("2. Premium");
			System.out.println("3. Funcionário");
			System.out.print("informe sua categoria: ");
			int categoria = sc.nextInt();
			
			double desconto = 0;
			
			switch (categoria)
			{
			case 1:
				desconto = 0.05;
				break;
				
			case 2:
				desconto = 0.10;
				break;
				
			case 3:
				desconto = 0.15;
				break;
				
			default:
				System.out.println("\nCategoria inválida.");
				continue;
			}
			
			double ValorDesconto = valorcompra * desconto;
			System.out.println("\nDesconto: " + ValorDesconto);
			
			double valorfinal = valorcompra - ValorDesconto;
			System.out.println("Valor Final: " + valorfinal);
			
			break;
			
		case 8:
			System.out.println("\nExercício 8: Contagem de Valores");
			
			int positivo = 0;
			int negativo = 0;
			int zeros = 0;
			
			for (int i = 1; i <= 10; i++)
			{
				System.out.print("\nInforme um número: ");
				int n7 = sc.nextInt();
				
				if (n7 > 0)
					positivo++;
				
				else if (n7 < 0)
					negativo++;
				
				else
					zeros++;
				
				System.out.println("Positivos: " + positivo);
				System.out.println("Negativos: " + negativo);
				System.out.println("Zeros: " + zeros);
			}
			break;
			
		case 9:
			System.out.println("\nExercício 9: Soma de 1 até N");
			
			System.out.print("\nInforme um número: ");
			int N = sc.nextInt();
			
			int soma = 0;
			
			for (int i = 1; i <= N; i++)
			{
				soma += i;
			}
			System.out.println("A soma de 1 até " + N + " é: " + soma);	
			break;
			
		case 10:
			System.out.println("Exercício 10: Contagem regressiva e soma");
			
			System.out.print("\nInforme um número inteiro positivo: ");
			int n8 = sc.nextInt();
			
			System.out.println("\nContagem regressiva: ");
			
			int somar = 0;
			
			for (int i = n8; i >= 1; i--)
			{
				System.out.println(i);	
				somar += i;
			}
			System.out.print("\nA soma de 1 até " + n8 + " é: " + somar);
			break;
			
		case 0:
			System.out.println("\nOperação finalizada.\nSaindo...");
			System.out.println("\nALUNO: Luis Felipe Oliveira Machado.\nRA: 42320328.");
			break;
			
		default:
			System.out.println("\nOpção inválida.\nEscolha uma das opções disponíveis.");
			break;				
			
		}
	    }

		sc.close();
	}
}

