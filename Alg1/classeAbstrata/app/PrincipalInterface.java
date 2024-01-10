package classeAbstrata.app;

import classeAbstrata.modelo.InterRadio;
import classeAbstrata.modelo.Radio;

public class PrincipalInterface {

	public static void main(String[] args) {
		InterRadio inter = new Radio();
		inter.ligar();
		inter.desligar();
		
		exemplo(new Radio());
	}

	public static void exemplo(InterRadio i) {
		i.desligar();
	}
}
