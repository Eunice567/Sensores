package entities;

import java.util.Date;
import java.util.Random;

public class AnaliseUmidade {

	private double umidade;

	public AnaliseUmidade(double umidade) {
		this.umidade = umidade;
	}

	public double getUmidade() {
		return umidade;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}
	
	public void umidadeSensor() {
        int[] vet;
        Random r = new Random();
        Date date = new Date();
        int auxil = 0;
        vet = new int[48];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(50);

        }
        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
                if (vet[j] <= vet[j + 1]) {
                    auxil = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = auxil;
                }
        }
        System.out.println(" ---------------- ANÁLISE DO SENSOR: UMIDADE ----------------");
        for (int j = 0; j < vet.length; j++) {
            date = new Date(date.getTime() + 30 * 60 * 1000);
            System.out.printf("UMIDADE: " + vet[j] + " g/m³");
            System.out.printf(" - HORÁRIO DA MEDIÇÃO DA UMIDADE: " + date);
            System.out.println("");
        }
    }
}
