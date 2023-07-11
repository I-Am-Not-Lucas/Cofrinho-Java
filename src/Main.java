import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
		boolean status = false;
		
		//loop para gerar os menu ate o usuario digitar 0
		
		while (!status){
			System.out.println("[1] Adicionar Moeda\n"
					+ "[2] Remover Moeda\n"
					+ "[3] Listar Moeda\n"
					+ "[4] Calcular total convertido para real\n"
					+ "[0] Encerrar");
			int escolha;
			escolha = new Scanner(System.in).nextInt();
			
			switch(escolha) {
			case 0:
				status = true;
				System.out.println("Programa desligado");
				break;
			case 1:
				System.out.println("Escolha moeda");
				System.out.println("[1] Euro");
				System.out.println("[2] Dolar");
				System.out.println("[3] Real");
				
				Scanner scanner = new Scanner(System.in);
				int qualMoeda = scanner.nextInt();
				
				
				System.out.println("Digite o valor: ");
				double valor = scanner.nextDouble();
				
				if(qualMoeda == 1) {
					cofrinho.adicionar(new Euro(valor));
				}else if(qualMoeda == 2) {
					cofrinho.adicionar(new Dolar(valor));
				}else if(qualMoeda == 3) {
					cofrinho.adicionar(new Real(valor));
				}
				else {
					System.out.println("Algo deu errado");
				}
				
				
				break;
			case 2:
				System.out.println("Escolha moeda");
				System.out.println("[1] Euro");
				System.out.println("[2] Dolar");
				System.out.println("[3] Real");
				
				Scanner scanner2 = new Scanner(System.in);
				int qualMoeda2 = scanner2.nextInt();
				
				
				System.out.println("Digite o valor: ");
				double valor2 = scanner2.nextDouble();
				
				if(qualMoeda2 == 1) {
					cofrinho.remover(new Euro(valor2));
				}else if(qualMoeda2 == 2) {
					cofrinho.remover(new Dolar(valor2));
				}else if(qualMoeda2 == 3) {
					cofrinho.remover(new Real(valor2));
				}
				else {
					System.out.println("Algo deu errado");
				}
				break;
			case 3:
				cofrinho.listagemMoedas();
				break;
			case 4:
				double totalConvertido = cofrinho.totalConvertido();
				System.out.println("total: " + totalConvertido + " reais.");
				break;
			default:
				System.out.println("Algo deu errado");
				System.out.println(escolha);
				break;
			
			}
			
			
			
		}
	
	  }
	}			
