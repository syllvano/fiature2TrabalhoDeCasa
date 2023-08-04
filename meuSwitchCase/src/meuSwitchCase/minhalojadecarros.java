package meuSwitchCase;

import java.util.Scanner;

public class minhalojadecarros {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("$$$$ Bem vindo a Loja de carro FlashCode $$$$");
		System.out.println ("@@@@ Aqui tem varios modelos de carros @@@@");
		System.out.println("");
		System.out.println ("BMW,");
		System.out.println ("Honda civic,");
		System.out.println ("Ford fiesta,");
		System.out.println ("Ford ka,");
		System.out.println ("Chevrolet corsa,");
		System.out.println ("Chevrolet celta,");
		System.out.println ("Hyundai tucson,");
		System.out.println ("Wolkswagen gol,");
		System.out.println ("Ferrari");
		System.out.println("Digite o modelo do carro ");
		String Carro = s.next();
				
				switch (Carro) {
				case "BMW":
					System.out.println("carro de luxo valor R$ 500,000,00");
					System.out.println("A vista 5% de desconto R$ 475,000,00");
					System.out.println("no cartao 10x de 50,000,00 sem juros");
					break;
					
				case "Ford.Fiesta":
					System.out.println("carro popular avaliado em R$ 70,000,00");
					System.out.println ("na troca pegamos seu usado valor ate 20,000,00");
					break;
					
				case "Honda.civic":
					System.out.println("carro intermediario valor R$ 140,000,00");
					System.out.println("financiamos com taxa 0%");
					System.out.println("recebemo o seu usado como entrada");
					break;
					
				case "Ford.ka":
					System.out.println("carro basico preco R$ 60,000,00");
					System.out.println("Aqui fazemos troca com troco");
				    System.out.println("boa avaliacao do seu usado");
					break;
					
				case "Chavrolet.corsa":
					System.out.println("carro usado valor R$18,000,00");
					System.out.println("semi novo segundo dono");
					System.out.println("garantia da loja 90 dias");
					break;
					
				case "Chevrolet.celta":
					System.out.println("carro bem conservado R$12,000,00");
					System.out.println("celta completo AR , vidro eletrico trava eletrica");
					System.out.println("documantacao em dia , lincenciado 2023");
					break;
					
				case "wolkswagen.Gol":
					System.out.println("carro todo revisado 2018 valor R$25,000,00");
					System.out.println("ja leva lincenciado e com tanque cheio");
					System.out.println("financiamento em ate 48x com taxa de 0,99 ao mes");
					
				case"Hyundai.Tucson":
					System.out.println("carro SUV grande porte valor R$160,000,00");
					System.out.println("toda linha 2023 com taxa 0%");
					System.out.println("dividimos em todos os cartoes");
					break;
					
				case"Ferrari":
					System.out.println("carro muito luxuoso 2023 valor2,000,000,00");
					System.out.println("tenha esse luxo em sua garagem");
					System.out.println("esse é o carro que despensa comentario");
					break;
				default:
					System.out.println("opcao invalida");
					break;
				}
;		
		
		
		
		
		
	}

}
