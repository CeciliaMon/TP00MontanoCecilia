package ar.unju.edu.edm;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.unju.edu.edm.Model.Calculadora;

@SpringBootApplication
public class TP00MontañoCeciliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TP00MontañoCeciliaApplication.class, args);
		Scanner leer = new Scanner (System.in);
		int opc;
		Calculadora micalculadora=new Calculadora(8,2);
		do {
			System.out.println("Operaciones");
			System.out.println("1) Sumar:");
			System.out.println("2) Restar:");
			System.out.println("3) Multiplicar:");
			System.out.println("4) Dividir:");
			System.out.println("5) Potencia:");
			System.out.println("6) Raiz:");
			System.out.println("7) Salir:");
			opc = leer.nextInt();
		switch (opc) {
		case 1:
			System.out.println("El resultado de la suma es:"+ micalculadora.suma());
			break;
		case 2:
			System.out.println("El resultado de la resta es:" + micalculadora.resta());
			break;
		case 3:
			System.out.println("El resultado de la multiplicacion es:" + micalculadora.multiplicacion());
			break;
		case 4:
			double division=micalculadora.division();
			if (division == 0) {
				System.out.println("No se puede dividir por 0");
			}
			else {
			System.out.println("El resultado de la division es:" + micalculadora.division());
			}
			break;
		case 5:
			System.out.println("El resultado de la potencia es:" + micalculadora.potencia());
			break;
		case 6:
			System.out.println("El resultado de la raiz es:" + micalculadora.raiz());
			break;
		case 7:
			System.out.println("Finalizacion del Menu");
			break;
			
		}
		}while (opc!=7);
		
	}
		
	}

