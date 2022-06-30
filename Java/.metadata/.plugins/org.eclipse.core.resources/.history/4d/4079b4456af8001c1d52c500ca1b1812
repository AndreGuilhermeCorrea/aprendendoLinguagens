package entities;

/*classe SavingsAccount herda comportamentos da classe account
através da palavra extends, 
porém com alguns atributos e métodos a mais que a classe account
UMA CLASSE ESPECIALIZADA*/
//public final class SavingsAccount extends Account {
//a palavra final impede que a classe savingsAccount seja herdada

public class SavingsAccount extends Account {
	private Double interestRate;// taxa de juros

	// construtor padrão
	public SavingsAccount() {
		super();
	}

	// construtor COM ARGUMENTOS da classe account
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		// complementado com a taxa de juros
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;

	}

	// operação de saque com override
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
