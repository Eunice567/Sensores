package entities;

import java.util.Date;
import java.util.Random;

public class AnaliseCarbonico {

	private double gasCarbonico;

	public AnaliseCarbonico(double gasCarbonico) {
		this.gasCarbonico = gasCarbonico;
	}

	public double getGasCarbonico() {
		return gasCarbonico;
	}

	public void setGasCarbonico(double gasCarbonico) {
		this.gasCarbonico = gasCarbonico;
	}
	
	public void gasCarbonicoSensor() {
        int[] vet;
        Random r = new Random();
        Date date = new Date();
        int auxil = 0;
        vet = new int[48];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(30);
        }
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] >= vet[j + 1]) {
                    auxil = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = auxil;
                }
        }
        System.out.println(" ---------------- ANÁLISE DO SENSOR: GÁS CARBONICO ----------------");
        for (int j = 0; j < vet.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.printf("GÁS CARBONICO: " + vet[j] + " CO²");
            System.out.printf(" - HORÁRIO DA MEDIÇÃO DO GÁS CARBÔNICO: " + date);
            System.out.println("");
        }
	}
}
