package firstsense;

import entities.AnaliseCarbonico;
import entities.AnaliseTemperatura;
import entities.AnaliseUmidade;

public class Principal {

	public static void main(String[] args) {
		 	AnaliseTemperatura analiseT = new AnaliseTemperatura(0);
	        analiseT.temperaturaSensor();
	        AnaliseUmidade analiseU  = new AnaliseUmidade(0);
	        analiseU.umidadeSensor();
	        AnaliseCarbonico analiseC = new AnaliseCarbonico(0);
	        analiseC.gasCarbonicoSensor();

	}

}
