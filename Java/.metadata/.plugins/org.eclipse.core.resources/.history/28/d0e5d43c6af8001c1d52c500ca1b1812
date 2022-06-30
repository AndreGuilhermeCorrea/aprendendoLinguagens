package entities;

/*classe BusinessAccount herda todos os dados e comportamentos da classe account
através da palavra extends, 
porém com alguns atributos e métodos a mais que a classe account
UMA CLASSE ESPECIALIZADA*/

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	//construtor padrão

	public BusinessAccount() {
		/*super chama o construtor da super classe 
		 * caso seja implementado alguma lógica.
		 * ou seja serve pra executar a lógica do construtor 
		 * da superclasse ou classe base
		 */
		super();
	}
	/*construtor com argumentos derivado da superclasse account
	 *  reaproveitando o construtor com argumentos da super classe account*/
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//super chama o construtor da super classe
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	//implementação da operação de empréstimo
	public void loan(double amount) {
		//essa operação causa o mesmo efeito do depósito
		//entretanto com um teste para saber se esse valor é <= ao limite de empréstimo
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	//operação de saque com super()* 
	//super faz implemntação da superclasse descontando mais 2 do saque
		public void withdraw(double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
		
}