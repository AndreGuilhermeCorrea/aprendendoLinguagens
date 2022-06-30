package entidade;

public class getter_e_setter_1_2 {

	// classe getter_e_setter com os atributos nome e idade
	// nome tipo string
	// idade tipo int
	// esses atributos s�o precedidos da palavras private ou seja s�o
	// *********ENCAPSULADOS******* PALAVRA PRIVATE
	// esse palavra nao permite que tais atributos sejam acessados por outra classe

	private String nome;
	private int idade;

	public getter_e_setter_1_2() {

	}

	// para que seja possivel acessar ou alterar os dados dos atributos h� a
	// necessidade de criar m�todos para tal

	// por padrao o m�todo para ******acessar****** o atributo � o m�todo
	// **********get************ seguido do nome do atributo em camel case
	// como o atributo nome � do tipo string nesse caso o m�todo devera tambem ser
	// do tipo string
	// a implementa��o desse metodo ser� para retornar o atributo (detalhe- poder�
	// tambem existir uma l�gica adicional se for necessario)

	public getter_e_setter_1_2(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		// a implementa��o desse metodo ser� para retornar o atributo (detalhe- poder�
		// tambem existir uma l�gica adicional se for necessario
		return nome;
	}
	

	// por padrao o m�todo para ******alterar****** o valor do atributo � o m�todo
	// ****set**** seguido do nome do atributo em camel case
	// esse m�todo como nao retorna nada � um (void) entretanto receber� o valor pro
	// atributo
	public void setNome(String nome) {

		// recebendo portanto esse valor o metodo ira atribuir (****palavra this****)
		// para esse atributo do objeto o valor recebido
		// detalhe- poder� tambem existir uma l�gica adicional se for necessario

		this.nome = nome;
	}
	
	public void addIdade(int idade) {
		this.idade += idade;
	}

	public int getIdade() {
		return idade;
	}
	

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String toString() {
		return nome
				+ " "
				+ idade
				+" Anos";
	}

}
