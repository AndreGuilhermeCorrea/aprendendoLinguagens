package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;
import entidade.getter_e_setter_1_2;


public class getter_e_setter_1_1 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com o seu Nome: ");
	System.out.print("Nome: ");
	String nome = sc.nextLine();
	
	System.out.println("Entre com sua Idade: ");
	
	int idade = sc.nextInt();
	
		getter_e_setter_1_2 getter_e_setter_1_2 = new getter_e_setter_1_2(nome, idade);
	
	
	System.out.println("Cidadão: " + getter_e_setter_1_2);
	
	
	System.out.println("Altere a idade do peão: ");
	getter_e_setter_1_2.setIdade(getter_e_setter_1_2.getIdade());
	
	idade = sc.nextInt();
	getter_e_setter_1_2.addIdade(idade);
	
	
	System.out.println("Idade do ser atualizada com sucesso! " + getter_e_setter_1_2.getIdade() + " Anos");
	
	
	
	
	
	
	sc.close();
	
	
	
		
		
		
		

	}

}
