
//pacote da classe
package entidade;

//nome da classe
public class area_triangulo_classe {
	//public permite que os atributos podem ser utilizados em outros arquivos
	//doubles a b c são os atributos do tipo double
	
	public double a;
	public double b;
	public double c;
//esse double abaixo significa o tipo de dado que o método retorna
	//se o método nao retornar nada usa-se void
	//area é o nome do metodo
	//()lista de parametros do metodo nesse caso nao houve necessidade de parametros pois ja se encontravam na classe
	
	public double area() {
		
		//nao a necessidade de declara as variaveis abc pois esses atributos sao pertencentes a classe
		double p = (a + b + c) / 2.0;
		double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return resultado;
		
				
	}
}
