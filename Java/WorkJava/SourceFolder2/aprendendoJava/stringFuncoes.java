package aprendendoJava;

public class stringFuncoes {
		public static void main(String[] args) {
			
			//apenas declara string em variável "original" para poder manipular com as funçoes
			String original = "  ANDRE guilherme Correa  ";
			
			//declarando a string em variável "strinG01" para torna-la minúsculo
			String strinG01 = original.toLowerCase();
			
			//declarando a string em variável "strinG02" para torna-la maiúscula
			String strinG02 = original.toUpperCase();
			
			//declarando a string em variável "strinG03" para remover espaços em branco no inicio e no fim
			String strinG03 = original.trim();
			
			//declarando a string em variável "strinG04" para gerar uma nova string apartir do 8º char em diante
			String strinG04 = original.substring(8);
			
			//declarando a string em variável "strinG05" para recortala apartir do 8º char até a 17ª 
			String strinG05 = original.substring(8, 17);
			
			//declarando a string em variável "strinG06 e 07" para substituir char
			String strinG06 = original.replace('a', '@');
			String strinG07 = original.replace("ANDRE", "Dé");
			
			//declarando a string em variável "primeiraOcorrencia e ultimaOcorrencia" para buscar posição
			int primeiraOcorrencia = original.indexOf("gui");
			int ultimaOcorrencia = original.lastIndexOf("rr");
			
			//______________________________________________________________________
					
			//printa a string normalmente
			System.out.println("Original: ***" + original + "***");
			
			//transforma a string em minúsculo
			System.out.println("toLowerCase: ***" + strinG01 + "***");
			
			//transforma a string em maiúsculo
			System.out.println("toUpperCase: ***" + strinG02 + "***");
			
			System.out.println("trim: ***" + strinG03 + "***");
			System.out.println("substring(8): ***" + strinG04 + "***");
			System.out.println("substring(8, 17): ***" + strinG05 + "***");
			System.out.println("replace('a', '@'): ***" + strinG06 + "***");
			System.out.println("replace('ANDRE', 'Dé'): ***" + strinG07 + "***");
			System.out.println("Index of 'gui': " + primeiraOcorrencia);
			System.out.println("Last index of 'rr': " + ultimaOcorrencia);
			
			//OPERAÇÃO SPLIT
			
			//função que recorta string e torna espaço em branco "no caso" como separador para alocar em vetor
			
			String split01 = "ANDRE GUILHERME CORREA";
			String[] vetor = split01.split(" ");
			String primeiro = vetor[0];
			String segundo = vetor[1];
			String terceiro = vetor[2];
			
			System.out.println(primeiro);
			System.out.println(segundo);
			System.out.println(terceiro);

		}

}