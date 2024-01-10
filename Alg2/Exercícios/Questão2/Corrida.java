package Exercícios.Questão2;

public class Corrida{
	
	public static void main(String[] args) {
		
		imprimirCarros();
		imprimirMotos(); 
	
	}
	
	public static void imprimirCarros() {
		
		Kwid kwid = new Kwid();
		Versa versa = new Versa();
		HB20S hb = new HB20S();
		SetraAdvance setra = new SetraAdvance();
		
		for(int i = 0; i < 20; i++) {
			
			kwid.acelerar();
			versa.acelerar();
			hb.acelerar();
			setra.acelerar();
			
			if(i == 6 || i == 11 || i == 15) {
				kwid.frear();
				versa.frear();
				hb.frear();
				setra.frear();
			}
			
		}
		
		System.out.println("Corrida dos carros: ");
		System.out.println("Dados do Kwid: " + kwid.cilindrada + " ," + kwid.velocidade + " ," + kwid.peso);
		System.out.println("Dados do Versa: " + versa.cilindrada + " ," + versa.velocidade + " ," + versa.peso);
		System.out.println("Dados do HB20S: " + hb.cilindrada + " ," + hb.velocidade + " ," + hb.peso);
		System.out.println("Dados do Setra Advance: " + setra.cilindrada + " ," + setra.velocidade + " ," + setra.peso);
		System.out.println(" ");
		
	}
	
	public static void imprimirMotos() {
		Cg160 cg = new Cg160();
		Pop110i pop = new Pop110i();
		Factor150 factor = new Factor150();
		Fazer250 fazer = new Fazer250();
		
		for(int i = 0; i < 20; i++) {
			
			cg.acelerar();
			pop.acelerar();
			factor.acelerar();
			fazer.acelerar();
			
			if(i == 6 || i == 11 || i == 15) {
				cg.frear();
				pop.frear();
				factor.frear();
				fazer.frear();
			}
			
		}
		
		System.out.println("Corrida de motos:");
		System.out.println("Dados do CG 160: " + cg.cilindrada + " ," + cg.velocidade + " ," + cg.peso);
		System.out.println("Dados do Pop 110i: " + pop.cilindrada + " ," + pop.velocidade + " ," + pop.peso);
		System.out.println("Dados do Factor 150: " + factor.cilindrada + " ," + factor.velocidade + " ," + factor.peso);
		System.out.println("Dados do Fazer 250: " + fazer.cilindrada + " ," + fazer.velocidade + " ," + fazer.peso);
	}
}
