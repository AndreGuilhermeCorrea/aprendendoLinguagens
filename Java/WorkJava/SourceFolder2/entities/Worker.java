package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entidade_enums.WorkerLevel;

//**********************COMPOSIÇÃO DE OBJETOD*************************



//classe worker com 02 associaçoes (COM VARIOS HOURCONTRACT E 01 DEPARTMENT) 
public class Worker {

	//ATRIBUTOS:
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	
	
	//ASSOCIAÇOES:
	//01 DEPARTMENT
	//department(em minúsculo representa atributo)
	private Department department;
	
	
	////ASSOCIAÇOES:
	//COMO ESSE 
	//LEMBRAR QUE A LISTA DEVE SER OBRIGATORIAMENTE SER INSTANCIADA
	//ARRAYLIST NA DECLARAÇÃO DO ATRIBUTO
	//NAO INSERIR O CONSTRUTOR QUE SEJA LISTA 
	//VÁRIOS*****(representado como lista) contracts por issso esta associado como list
	//contracts é o nome da lista
	private List<HourContract> contracts = new ArrayList<>();
	
	
	//CONSTRUTOR PADRÃO VAZIO
	public Worker() {
	}
	
	
	//CONSTRUTOR COM ARGUMENTOS
	
	
	//NAO INSERIR O CONSTRUTOR QUE SEJA LISTA (CONTRACTS QUE DEVE SER INSTANCIADA COM NEW ARRAYLIST NA DECLARAÇÃO DO ATRIBUTO)
	////////

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	
	
	///////MÉTODOS DA CLASSE IMPLEMENTADOS
	
	///////02 MÉTODOS PARA FAZER E DESFAZER A ASSOCIAÇÃO DO CONTRATO AO TRABALHADOR
	//contracts como argumento, método para adicionar contrato associado ao wotrker trabalhador
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	//contracts como argumento, método para remover o contrato associado ao wotrker trabalhador
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	 //OPERAÇÃO DECLARADA QUE CALCULA (INCOME) O QUANTO O FUNCIONÁRIO GANHOU
	//baseado no ano e no mes
	public double income(int year, int month) {
		
		//VARIAVEL LOCAL DOUBLE RECEBENDO O baseSalary
		double sum = baseSalary;
		//percorrer os contratos relativos ao mes e ao ano 
		// lembrando que o contrato tb tem operação valor total, essa operação retornara o valor total do contrato
		
		//DECLARACAO PARA IMPORTAR O CALENDÁRIO NO CONTRATO C
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			
			//PARA CADA CONTRATO C IRA SETAR* 
			//DATA DO CONTRATO DEFINIDA COMO DATA DO CALENDARIO
			cal.setTime(c.getDate());
			
			//REPRESENTAR O ANO DO CONTRATO C
			int c_year = cal.get(Calendar.YEAR);
			//REPRESENTAR O MES DO CONTRATO C
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			//CONDIÇÃO SE O CONTRATO FOR DESSE MES E ANO O VALOR TOTAL ENTRERÁ NA SOMA
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}