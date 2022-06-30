package entities;

/*classe BusinessAccount herda todos os dados e comportamentos da classe account
atrav�s da palavra extends, 
por�m com alguns atributos e m�todos a mais que a classe account
UMA CLASSE ESPECIALIZADA*/

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	//construtor padr�o

	public BusinessAccount() {
		/*super chama o construtor da super classe 
		 * caso seja implementado alguma l�gica.
		 * ou seja serve pra executar a l�gica do construtor 
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

	//implementa��o da opera��o de empr�stimo
	public void loan(double amount) {
		//essa opera��o causa o mesmo efeito do dep�sito
		//entretanto com um teste para saber se esse valor � <= ao limite de empr�stimo
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	//opera��o de saque com super()* 
	//super faz implemnta��o da superclasse descontando mais 2 do saque
		public void withdraw(double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
		
}