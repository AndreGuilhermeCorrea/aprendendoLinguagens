package FirstProject;

import java.util.Scanner;

public class se_senao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.print("Qual a Hora atual? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom Dia!!! ");
		}
		else if (hora <18) {
			System.out.println("Bom Tarde!!! ");
		}
		else {
			System.out.println("Boa Noite!!! ");
		}
			
		
		sc.close();
		
	}

}
