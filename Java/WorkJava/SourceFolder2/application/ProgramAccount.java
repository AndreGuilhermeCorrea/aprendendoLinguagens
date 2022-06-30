package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {

	public static void main(String[] args) {
		
		/*
		//lógica como comentário para aprender abstract*****************
		 * 
		 * aprendendo polimorfismo
		Account x = new Account(0111, "Dunha", 1100.0);
		Account y = new SavingsAccount(0112, "Dunha", 1010.0, 0.01);
		
		x.withdraw(35.0);
		y.withdraw(50.0);
		//polimorfismo recurso que permite variaveis do mesmo tipo (account) mas com comportamentos diferentes
		//conforme os objetos pelos quais elas
		//apontam promovendo uma gama de possibilidades, elegantes e flexíveis
		//com base no método que foi instanciado, essa instanciação é feita no tempo de execução por meio do upcasting
		
		System.out.println("x " + x.getBalance());
		System.out.println("y " + y.getBalance());
		
		*/
		
		//classes abstratas
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(11001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(11002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(11004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(11005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account accClassAbstact : list) {
			sum += accClassAbstact.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account accClassAbstact : list) {
			accClassAbstact.deposit(10.0);
		}
		for (Account accClassAbstact : list) {
			System.out.printf("Updated balance for account %d: %.2f%n",
					accClassAbstact.getNumber(),
					accClassAbstact.getBalance());
		}
		
		
		
		

		Account acc = new BusinessAccount(1011, "Dunha", 110.0, 2000.00);
		// BusinessAccount possui todos os atributos e métodos da classe account
		// por
		// meio de herança
		System.out.println("acc " + acc.getBalance());
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 5000.00);

		// criado a conta
		Account acc1 = new BusinessAccount(1001, "Alex", 10000.0, 6000.00);
		// realizado saque nessa conta para aprender @Override
		acc1.withdraw(300.0);
		System.out.println("acc1 " + acc1.getBalance());

		// UPCASTING

		// PEGAR OBJETO new BusinessAccount(1002, "Maria", 0.0, 5000.00);
		// E ATRIBUI-LO Á UMA VARIAVEL ACCOUNT
		// atribuindo um objeto da subclasse para super classe

		Account acc11 = bacc;
		System.out.println("acc11 " + acc11.getBalance());
		System.out.println("bacc " + bacc.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Joaquim", 1000.0, 500.00);
		//saque
		acc2.withdraw(200.0);
		System.out.println("acc2 " + acc2.getBalance());
		
		// criado a conta
		Account acc3 = new SavingsAccount(1004, "João", 900000.00, 0.10);
		// realizado saque nessa conta para aprender @Override
		acc3.withdraw(600.0);
		System.out.println(acc3.getBalance());

		// DOWNCASTING
		// CONVERSÃO DE OBJETO DE SUPER CLASSE PARA SUB CLASSE
		/*
		 * a variável acc2 é do tipo account, mesmo ela estando instanciado como como
		 * businesaccount o tipo continua sendo account, pois a conversão nao é natural,
		 * para que seja possível a conversão da super classe para subclasse é
		 * necessario o uso de um casting manual, por meio desse businessAccount entre
		 * os parenteses
		 */

		BusinessAccount acc4 = (BusinessAccount) acc2;
		// para portanto utilizar a operação para realizar empréstimo presente na classe
		// businessAccount
		acc4.loan(2000.00);

		/*
		 * BusinessAccount acc5 = (BusinessAccount)acc3 gerará um erro pois o acc3
		 * pertence a classe SavingsAccount para evitar o erro é utilizado um teste if
		 * pela palavra instanceof
		 */

		/*
		 * Se o que estiver na variável acc3 for realmente um objeto que seja instancia
		 * (instanceOf) da classe BusinessAccount aí simo casting será realizado.
		 * podendo realizar o emprestimo
		 */
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(300.00);
			System.out.println("Empréstimo(LOAN)!");
		}

		/*
		 * Se o que estiver na variável acc3 for realmente um objeto que seja instancia
		 * (instanceOf) da classe SavingsAccount aí simo casting será realizado. podendo
		 * realizar o updatebalance
		 */

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}
}