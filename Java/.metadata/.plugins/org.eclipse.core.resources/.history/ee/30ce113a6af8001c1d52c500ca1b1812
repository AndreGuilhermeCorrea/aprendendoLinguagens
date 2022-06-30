package entities;
//implementação da classe account GENÉRICA*******
public abstract class Account {

	private Integer number;//Numero da conta
	private String holder;
	protected Double balance;//Saldo da conta
	
	//construtor padrão antes do construtor com argumentos

	public Account() {
	}
	
	//construtor com argumentos

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	//get Number
	public Integer getNumber() {
		return number;
	}
	//set Number

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	//get Saldo da conta

	public Double getBalance() {
		return balance;
	}
	
	//operação de saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	//operacao de depósito

	public void deposit(double amount) {
		balance += amount;
	}
}