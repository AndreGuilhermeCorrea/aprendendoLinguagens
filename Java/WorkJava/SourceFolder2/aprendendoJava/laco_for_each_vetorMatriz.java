
package aprendendoJava;

public class laco_for_each_vetorMatriz {

	public static void main(String[] args) {

		String[] vetor = new String[] { "André", "João", "José" };

		//for normal:    imprimir e e alocar os valores no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}
		
		//for each:    imprimir e e alocar os valores no vetor
		for (String obj : vetor) {
			System.out.println(obj);
			
		}

	}

}
