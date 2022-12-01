package entities;

import java.util.Date;
import java.util.Random;

public class AnaliseTemperatura {

	private double temperatura;

	public AnaliseTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	 public void temperaturaSensor() {
	        int[] vet;
	        Random r = new Random();
	        Date date = new Date();
	        int auxil = 0;
	        vet = new int[48];
	        for (int i = 0; i < vet.length; i++) {
	            vet[i] = r.nextInt(70);
	        }
	        for (int i = 0; i <= vet.length; i++) {
	            for (int j = 0; j < vet.length - 1; j++)
	                if (vet[j] >= vet[j + 1]) {
	                    auxil = vet[j];
	                    vet[j] = vet[j + 1];
	                    vet[j + 1] = auxil;
	                }
	        }
	        System.out.println(" -------------------------- ANÁLISE DO SENSOR: TEMPERATURA --------------------------");
	        for (int j = 0; j < vet.length; j++) {
	            date = new Date(date.getTime() + 30 * 60 * 1000);
	            System.out.printf("TEMPERATURA: " + vet[j] + "°C");
	            System.out.printf(" - Horário da medição da temperatura: " + date);
	            System.out.println("");
	        }
	    }
}
