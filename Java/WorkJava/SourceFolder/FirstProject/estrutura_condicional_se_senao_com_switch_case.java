package FirstProject;
import java.util.Scanner;

public class estrutura_condicional_se_senao_com_switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o dia que deseja retornar? ");
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Valor inv�lido";
			break;
		}

		System.out.println("O dia da Semana �: " + dia);

		sc.close();

	}

}
