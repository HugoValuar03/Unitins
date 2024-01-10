package trabalhoMaquina;

import java.util.Scanner;

public class MaquinaAtributos {

	private double troco;
	private double soma = 0;
	private int codigoId;
	
	
	
	protected void painel() {
		
		Scanner entradaId = new Scanner(System.in);
		Refrigerantes refri = new Refrigerantes();
		
		while(codigoId < 7) {
			System.out.println("Para sair digite qualquer número maior que 6");
			System.out.println("Digite um valor");
			
			definirRefrigerantes();
			
			System.out.print("Id: ");
			codigoId = entradaId.nextInt();
			
			switch(codigoId) {
			
			case 0:
				refri.setPepsi(soma += 6.0);
				break;
				
			case 1:
				refri.setCoca(soma += 6.0);
				break;
				
			case 2:
				refri.setFantaLaranja(soma += 4.5);
				break;
				
			case 3:
				refri.setFantaUva(soma += 4.5);;
				break;
				
			case 4:
				refri.setGuarana269(soma += 2.5);
				break;
				
			case 5:
				refri.setGuarana350(soma += 3.5);
				break;
				
 			case 6:
				refri.setGuaranaJesus(soma += 2.5);
				break;
			}
		}
		System.out.println("Valor total: R$" + soma);
		if(soma > 0) {
			calculoTroco();
			System.out.println("Volte sempre!");
		}
	}
	
	private void definirRefrigerantes() {
		String[] id = {"Pepsi 350ml - R$6,00","Coca-Cola 350ml - R$6,00", "Fanta Laranja 350ml - R$4,50","Fanta Uva - R$4,50","Guaraná 269ml - R$2,50",
				"Guaraná 350ml - R$3,50", "Guaraná Jesus 269ml - R$2,50" };
		
		for (int i = 0; i < id.length; i++) {
			System.out.println(i + ": " + id[i]);
		}
	}

	private double calculoTroco() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do pagamento: ");
		double valor = entrada.nextDouble();
		troco = valor - soma;
		if(soma == valor) {
			System.out.println("Obrigado pela compra!");
		} else {
			System.out.println("O troco é de R$" + getTroco());			
		}
		
		entrada.close();
		return troco;	
	}

	//está público porque o get e o set tem que ser público
	public double getTroco() {
		return troco;
	}
	
}