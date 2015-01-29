import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int resposta;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("O seu animal pode voar?");
		System.out.println("1 para Sim ou 0 Não");
		resposta = scan.nextInt();
		
		if (resposta == 1) {
			System.out.println("Será que ele tem penas?");
			System.out.println("1 para Sim ou 0 Não");
			resposta = scan.nextInt();
			if (resposta == 1) {
				System.out.println("Será que começa com a letra 'A'?");
				System.out.println("1 para Sim ou 0 Não");
				resposta = scan.nextInt();
				if (resposta == 1)
					System.out.println("O animal que você está pensando é a Andorinha");
				else
					System.out.println("O animal que você está pensando é o Papagaio");	
			} else
				System.out.println("O animal que você está pensando é o Pavão");;
		} else {
			System.out.println("Será que, vive na água?");
			System.out.println("1 para Sim ou 0 Não");
			resposta = scan.nextInt();
			if (resposta == 1){
				System.out.println("Será que começa com um 'B'?");
				System.out.println("1 para Sim ou 0 Não");
				resposta = scan.nextInt();
				if (resposta == 1)
					System.out.println("O animal que você está pensando é a Baleia");
				else
					System.out.println("O animal que você está pensando é o Peixe");
			} else {
				System.out.println("Será que ele rasteja?");
				System.out.println("1 para Sim ou 0 Não");
				resposta = scan.nextInt();
					if (resposta == 1){
						System.out.println("Será que começa com um 'L'?");
						System.out.println("1 para Sim ou 0 Não");
						resposta = scan.nextInt();
						if (resposta == 1)
							System.out.println("O animal que você está pensando é o Lagarto");
						else
							System.out.println("O animal que você está pensando é o Camaleão");
					} else {
						System.out.println("Ele cava buracos?");
						System.out.println("1 para Sim ou 0 Não");
						resposta = scan.nextInt();
					}
					if (resposta == 1){
						System.out.println("Ele é bem pequeno?");
						System.out.println("1 para Sim ou 0 Não");
						resposta = scan.nextInt();
						if (resposta == 1)
							System.out.println("O animal que você está pensando é a Topeira");
						else
							System.out.println("O animal que você está pensando é o Urso");
					} else {
						System.out.println("Será que ele se pendura em árvores?");
						System.out.println("1 para Sim ou 0 Não");
						resposta = scan.nextInt();
						if (resposta == 1)
							System.out.println("O animal que você está pensando é o Macaco");
						else
							System.out.println("O animal que você está pensando é o Cachorro");
						}
					}
			}
		}
}