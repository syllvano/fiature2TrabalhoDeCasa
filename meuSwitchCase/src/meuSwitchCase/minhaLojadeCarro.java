package meuSwitchCase;

import java.util.Scanner;



public class minhaLojadeCarro {

	

	private static final int Ferrari = 0;

	public static void main(String[] args) {
	
		
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("!!!! sejam bem vindo a loja auto center carros!!!!");
	System.out.println("     Av das nacoes unidas Nº2589 Sp");
	System.out.println("     Atendimento das 8:00h ate as 18:00");
	System.out.println("");
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	System.out.println(" cliente:");
    String cliente= scanner.nextLine();
    
	
	switch (cliente){
	case "Silvano Rodrigues" :{
	}
	
	
	System.out.println("telefone de contato:");
	
	String telefone = scanner.nextLine();

    System.out.println("endereco do cliente:");
    
	String endereco = scanner.nextLine();
	System.out.println("agencia bancaria:");
	System.out.println("corretista");
	String banco = scanner.nextLine();
	
	

	System.out.println("saldo em conta");
    String saldo = scanner.nextLine();
    System.out.println(" R$ 2,000,000,00");
    String saldo1 = scanner.nextLine();
    
	Scanner scanner1 = new Scanner (System.in);
	System.out.println("");
	System.out.println("-Aqui temos varios modelos de carro disponiveis.");
	System.out.println("");
	System.out.println("-aceitamos tods a formas de pagamento,dinheiro cartao e financiamento bancario.");
	System.out.println("");
	System.out.println("-tem alguma preferencia de marca e modelo?");
	System.out.println("");
	System.out.println("-vô esta te apresentando todos os modelos e valore de cada um deles.");
	System.out.println("                     $$$$$$$$$$$$$$$$$$$$");
	System.out.println("");
	System.out.println(" Temos essa *ferrari* 2023 toda luxuosa por apenas R$ 2,000,000,00.");
	System.out.println(" 10% de desconto avista R$1,800,000,00");
	System.out.println(" tambem dividimos em ate 12x de R$ 167,000,00");
	System.out.println("");
	System.out.println("#########################################################");
	System.out.println("");
	System.out.println(" Aqui temos *BMW* mais um modelo de luxo valor R$ 1,500,000,00.");
	System.out.println(" Condicoes de pagamento 20x R$ 75,000,00 no cartao");
	System.out.println("");
	System.out.println("#########################################################");
	System.out.println("");
	System.out.println(" Carro *Hyundai Tucson* valor R$ 160,000,00");
	System.out.println(" Modelo com 5 anos de garantia");
	System.out.println(" um SUV mais confortavel da categoria");
	System.out.println(" ");
	System.out.println("#########################################################");
	System.out.println("");
	System.out.println("#########################################################");
	System.out.println("");
	System.out.println(" Aqui tambem tem um lindo *Honda Civic* valor R$ 150,000,00");
	System.out.println(" con excelente taxas de juros no cartao");
	System.out.println(" a vista com 10% de desconto mais brinde (bancos em couro)");
	System.out.println("");
	System.out.println(" &&&&&&&&&&&&&& Ala de carros mais populates &&&&&&&&&&&&");
	System.out.println("");
	System.out.println(" carro *GOL* geracao 5 2023 por R$ 80,000,00");
	System.out.println(" vale a penas conferir esse lindo veiculo");
	System.out.println(" a vista no cartao e no financiamento bancario");
	System.out.println("");
	System.out.println("#########################################################");
	System.out.println("");
	System.out.println(" Novo *Ford Fiesta* 2023 valor R$ 85,000,00 ");
	System.out.println(" O carro mais vendido da categoria com taxa 0%");
	System.out.println(" financie agora em ate 60 meses");
	System.out.println("");
	System.out.println("#########################################################");
	System.out.println("");
	System.out.println(" *Ford Ka*com valor abaixo da tabele valor R$ 75,000,000");
	System.out.println(" um carro de pequeno porte cabe em qualquer garagem");
	System.out.println(" carro com taxa de 0,99% ao mes");
	System.out.println("");
	System.out.println(" ########################################################");
	System.out.println("");
    System.out.println(" carro *Chevrolet Corsa* usado ano 2008 valir 23,000,00");
    System.out.println(" pegamos o seu carro na troca com boa avaliacao");
    System.out.println(" taxa 0% para toda linha da Chevrolet");
    System.out.println("");
    System.out.println("#########################################################");
    System.out.println("");
    System.out.println(" Lindo *Chevrolet Celta* usado ano 2007 valor 17,000,00");
    System.out.println(" taxa 0% pra toda linha Chevrolet com ipi reduzido");
    System.out.println(" aqui tem toca com troco");
    
    System.out.println("");
    System.out.println("escolha um modelo de sua preferencia");
    
    String carro  = scanner.next();
    
    
    
    
	carro comprarealizada;
	
	switch(carro) {
    
    case "Ferrari":
    
    comprarealizada = new carro ("ferrari");
    System.out.println("carro total luxo");
    break;
    
    case "BMW":
    	
    comprarealizada = new carro ("BMW");
    System.out.println(" BMW COMPACTO PRA QUEM VER CONFORTAL PRA QUEM ANDA");
    System.out.println(" Efetuar compra");
    System.out.println("");
    System.out.println("forma de pagamento");
    break;
    
    case "Hyundai Tucson":
    comprarealizada = new carro ("Hyundai Tucson");
    System.out.println("o SUV mais lindo da categoria");
    break;
    
    case" Honda civic":
    
    comprarealizada = new carro ("Honda civic");
    System.out.println("um sedan muito espacoso");
    break;
    
    case "GOL":
    	
    comprarealizada = new carro("GOL");
    System.out.println("O popular mais vendido do ano");
    break;
    
    case "Ford fiesta":
    	
    comprarealizada = new carro ("Ford fiesta");
    System.out.println("carro de preco,praso e qualidade");
    break;
    
    case "Ford ka":
    	
    comprarealizada = new carro (" Ford ka");
    System.out.println("pequeno no tamanho menor ainda no preco");
    break;
    
    case "Chevrolet corsa":
    	
    comprarealizada = new carro ("Chevrolet corsa");
    System.out.println("um carro usado de conservacao impecavel");
    break;
    
    case "Chevrolet celta":
    
    comprarealizada = new carro ("Chevrolet celta");
    System.out.println("este é um usado com preco bom e garantia");
    break;
    
    default:
    
    System.out.println("Nao teremos carros referente a esse modelo");
    break;
    
	}
	String carro1 = scanner.next();
	
   switch (carro1) {
    
    case "pix":
    comprarealizada = new carro ("cartao");
    System.out.println("uma otima forma de pagamento");
    break;
  
    
    case "cartao-debito":
    comprarealizada = new carro("cartao");
    System.out.println("melhor opcao");
    break;
   }
  
   
   String comprar = scanner.nextLine();
   System.out.println("validacao da compra");
   Scanner scanner2 = new Scanner(System.in);
   
   System.out.println("");
   System.out.println("silvano R da Silva");
   System.out.println("cedula de ro 1333333 e cpf 023333333");
   System.out.println("Rua 6 Cruz das Almas BA Brasil");
   System.out.println("");
   System.out.println("carro vendido");
   System.out.println("UM LUXUOSO $$$ BMW $$$");
   System.out.println("VALOR da BMW R$1,500,000,00");
   System.out.println("Data da venda 19/06/2023");
   System.out.println("agencia bancaria 'Banco do brasil'");
   System.out.println("Saldo em conta R$ 2000,000,00");
   
   String valor = scanner.next();
   System.out.println("valor da BMW RS 1,500,000,00");
   System.out.println("");
   
   Scanner scanner5 = new Scanner(System.in);
   String pagar = scanner.next();
   System.out.println("compra efetuada com sucesso");
   System.out.println("");
   
   
   String saldo2 = scanner.next();
   System.out.println("saldo atual em conta R$ 500,000,00");
   System.out.println("");
	
   Scanner scanner3= new Scanner(System.in);
   String revisar = scanner2.next();
   System.out.println("");
   System.out.println(" uma linda BMW");
   System.out.println(" END da entrega");
   System.out.println(" Cep 44380000");
   System.out.println(" Rua 6 Lt 14 Cruz da Almas ba Brasil");
   System.out.println("");
   
   Scanner scanner4 = new Scanner(System.in);
   String fim = scanner1.next();
   System.out.println("fim da operacao");
   
	 
	 
	 }

   
    
	}
    
    

    
}
   
	
	


	
	
	


