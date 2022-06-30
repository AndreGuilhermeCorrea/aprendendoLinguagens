package Tratamento_Excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("D:\\workSpace\\C�digos\\Java\\WorkJava\\teste de exce��o.txt");
		Scanner sc = null;
		try {
			/*
			 * no momento de instanciar esse scanner se o arquivo
			 * que tiver especificado um caminho que n�o existir ir� portanto 
			 * ser lan�ado uma exce��o de arquivo nao encontrado
			 * caindo portanto no bloco catch.(mostrando uma mensagem)
			*/
			sc = new Scanner(file);
			/*entretanto se o arquivo da instancia��o do scanner existir entrar� no
			 * bloco while. bloco b�sico para percorrer as linhas do arquivo
			 */
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
			/*independente de ter dado certo ou n�o 
			 * � necess�rio fechar o scanner para evitar que o arquivo fique aberto
			 * atrav�s de um teste no bloco finally
			 */
			
		} 
		finally {
			if (sc != null) {
				//fecha o arquivo com sc.close()
				sc.close();
			}
		}
	}
}