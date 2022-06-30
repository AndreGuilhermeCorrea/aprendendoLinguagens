package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade_enums.WorkerLevel;
import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Program_2 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		////vari�vel sdf instanciada com o SimpleDateFormat e a mascar� DD/MM/YYYY
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		//vari�vel
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		//variavel worker 
		//instanciado Worker
		//worker receber 
		//department � outro objeto do tipo department
		//trabalhador possui uma composi��o de objetos , portanto necess�rio instanciar um departamento passando.....
		//...o nome digitado fazendo a associa��o do trabalhador com department
		//objeto tipo worker associado com o objeto department atrav�s da composi��o de objetos criados na classe worker 
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		//leitura dos dados do contrato por meio do for
		//o for ser� repetido varias vezes at� que seja instanciado todos os contratos para que seja associado os contratos ao trabalhador
			
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			//vari�vel do tipo date chamada contracDate recebendo o que o usu�rio digitar nesse formato DD/MM/YYYY
			//para receber a data nesse formato necess�rio criar um SimpleDateFormat
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//associado o contrato ao trabalhador 
			///m�todo worker passando o contrato como argumento, fazendo o contrato ser associado ao trabalhador
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		//string importado manualmente
		String monthAndYear = sc.next();
		
		
		//convers�o os 02 caracteres MM mes realizando a convers�o para inteiro e armazenando na variavel month
		//substring(0, 2) indicando o inicio e o fim da onde ser� recortado a string na posi��o 0 e 1, parando na posi��o 2
		//ou seja recorta a string gerando uma substring 
		//parseInt transforma a substring em inteiro
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		
		
		//convers�o os 04 caracteres YYYY mes realizando a convers�o para inteiro e armazenando na variavel year
		//substring(3) indicando  onde ser� recortado a string ou seja na posi��o 03 en diante
		// recorta a string gerando uma substring 
		//parseInt transforma a substring em inteiro
		
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	
		
		
	}

}
