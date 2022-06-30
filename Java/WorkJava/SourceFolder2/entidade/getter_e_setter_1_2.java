package entidade;

public class getter_e_setter_1_2 {

	// classe getter_e_setter com os atributos nome e idade
	// nome tipo string
	// idade tipo int
	// esses atributos são precedidos da palavras private ou seja são
	// *********ENCAPSULADOS******* PALAVRA PRIVATE
	// esse palavra nao permite que tais atributos sejam acessados por outra classe

	private String nome;
	private int idade;

	public getter_e_setter_1_2() {

	}

	// para que seja possivel acessar ou alterar os dados dos atributos há a
	// necessidade de criar métodos para tal

	// por padrao o método para ******acessar****** o atributo é o método
	// **********get************ seguido do nome do atributo em camel case
	// como o atributo nome é do tipo string nesse caso o método devera tambem ser
	// do tipo string
	// a implementação desse metodo será para retornar o atributo (detalhe- poderá
	// tambem existir uma lógica adicional se for necessario)

	public getter_e_setter_1_2(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		// a implementação desse metodo será para retornar o atributo (detalhe- poderá
		// tambem existir uma lógica adicional se for necessario
		return nome;
	}
	

	// por padrao o método para ******alterar****** o valor do atributo é o método
	// ****set**** seguido do nome do atributo em camel case
	// esse método como nao retorna nada é um (void) entretanto receberá o valor pro
	// atributo
	public void setNome(String nome) {

		// recebendo portanto esse valor o metodo ira atribuir (****palavra this****)
		// para esse atributo do objeto o valor recebido
		// detalhe- poderá tambem existir uma lógica adicional se for necessario

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
