
package aprendendoJava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_nasc_signo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String primeiroNome, segundoNome;
		int idadeDia, idadeMes, idadeAno;

		System.out.println("Esta é a minha primeira experiencia com java Eclipse e GitHub!!!");
		System.out.println();
		System.out.println("Para darmos início precisamos te conhecer melhor!");

		System.out.println("Digite o seu primeiro nome: ");
		primeiroNome = sc.nextLine();

		System.out.println("Digite seu sobrenome: ");
		segundoNome = sc.nextLine();

		System.out.println("olá! " + primeiroNome + " " + segundoNome);

		System.out.println("Agora digite o dia do seu Nascimento: ");

		idadeDia = sc.nextInt();

		if (idadeDia >= 01 && idadeDia <= 31) {
			System.out.println("Digite o mês do seu Nascimento: ");

		} else {
			System.out.println("Dia inválido!!!");
		}

		idadeMes = sc.nextInt();

		if (idadeMes >= 01 && idadeMes <= 12) {
			System.out.println("Digite o ano do seu Nascimento: ");

		} else {
			System.out.println("Mes inválido!!!");
		}

		idadeAno = sc.nextInt();

		if (idadeAno >= 1800 && idadeAno <= 2050) {

			// data de nascimento
			String dataDeNascimento = (idadeDia + "/" + idadeMes + "/" + idadeAno);

			System.out.println("Data de Nascimento: " + dataDeNascimento);
		} else {
			System.out.println("O valor informado não é válido!!!");
		}

		String idadeMesNascimento;
		switch (idadeMes) {
		case 1:
			idadeMesNascimento = "Janeiro";
			break;
		case 2:
			idadeMesNascimento = "Fevereiro";
			break;
		case 3:
			idadeMesNascimento = "Março";
			break;
		case 4:
			idadeMesNascimento = "Abril";
			break;
		case 5:
			idadeMesNascimento = "Maio";
			break;
		case 6:
			idadeMesNascimento = "Junho";
			break;
		case 7:
			idadeMesNascimento = "Julho";
			break;
		case 8:
			idadeMesNascimento = "Agosto";
			break;
		case 9:
			idadeMesNascimento = "Setembro";
			break;
		case 10:
			idadeMesNascimento = "Outubro";
			break;
		case 11:
			idadeMesNascimento = "Novembro";
			break;
		case 12:
			idadeMesNascimento = "Dezembro";
			break;
		default:
			idadeMesNascimento = "Valor Inválido";
			break;

		}
		System.out.println("Voce nasceu no mes de: " + idadeMesNascimento);

		int idadePeao = calculaIdade(idadeDia, idadeMes, idadeAno);
		exibirIdade(idadePeao);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("Data Atual: " + dtf.format(LocalDateTime.now()));

		int exibirPers = personalidade(idadeMes, idadeDia);
		exibirpersonalidade(exibirPers);

		sc.close();
	}

	public static int calculaIdade(int diaNasc, int mesNasc, int anoNasc) {

		// Data de hoje.
		GregorianCalendar hoje = new GregorianCalendar();
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
		int mesHoje = hoje.get(Calendar.MONTH) + 1;
		int anoHoje = hoje.get(Calendar.YEAR);

		// Idade.
		int idade;

		if (mesNasc < mesHoje || (mesNasc == mesHoje && diaNasc <= diaHoje))
			idade = anoHoje - anoNasc;
		else
			idade = (anoHoje - anoNasc) - 1;

		return (idade);
	}

	public static void exibirIdade(int valor) {
		// o sistema ira apenas imprimir na tela os valor da função maximo
		// e void sem retornar nada apenas imrimir na tela
		System.out.println("A sua idade é: " + valor + " anos!!!");

	}

	public static int personalidade(int mes, int dia) {

		int persona;

		if ((mes == 12 && dia >= 22) || (mes == 01 && dia <= 19))
			persona = 1;

		else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 19))
			persona = 2;

		else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20))

			persona = 3;

		else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20))
			persona = 4;

		else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20))
			persona = 5;

		else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20))
			persona = 6;

		else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21))
			persona = 7;

		else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22))
			persona = 8;

		else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22))
			persona = 9;

		else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22))
			persona = 10;

		else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21))
			persona = 11;

		else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21))
			persona = 12;

		else
			persona = 13;

		return persona;

	}

	public static void exibirpersonalidade(int perrs) {
		// o sistema ira apenas imprimir na tela os valor da função maximo
		// e void sem retornar nada apenas imrimir na tela

		String seusigno, suaQualidade, seuDefeito, seuMedo;

		switch (perrs) {

		case 1:
			seusigno = "Capricórnio";
			suaQualidade = "Persistência";
			seuDefeito = "Preguiça";
			seuMedo = "Imprevistos";
			break;
		case 2:
			seusigno = "Aquario";
			suaQualidade = "Criatividade";
			seuDefeito = "Desatenção";
			seuMedo = "Rotina";
			break;
		case 3:
			seusigno = "Peixes";
			suaQualidade = "Simpatia";
			seuDefeito = "Insegurança";
			seuMedo = "Melâncoloia";
			break;
		case 4:
			seusigno = "Aries";
			suaQualidade = "Determinação";
			seuDefeito = "Impaciência";
			seuMedo = "Paralisia";
			break;
		case 5:
			seusigno = "Touro";
			suaQualidade = "Prestatividade";
			seuDefeito = "Teimosia";
			seuMedo = "Mudança";
			break;
		case 6:
			seusigno = "Gemeos";
			suaQualidade = "Encantar";
			seuDefeito = "Bipolaridade";
			seuMedo = "Silêncio";
			break;
		case 7:
			seusigno = "Cancer";
			suaQualidade = "Carinho";
			seuDefeito = "Carência";
			seuMedo = "Solidão";
			break;
		case 8:
			seusigno = "Leão";
			suaQualidade = "Determinação";
			seuDefeito = "Orgulho";
			seuMedo = "Desprezo";
			break;
		case 9:
			seusigno = "Virgem";
			suaQualidade = "Inteligência";
			seuDefeito = "Pessimismo";
			seuMedo = "Dezordem";
			break;
		case 10:
			seusigno = "Libra";
			suaQualidade = "Diversão";
			seuDefeito = "Indecisão";
			seuMedo = "Confronto";
			break;
		case 11:
			seusigno = "Escorpiao";
			suaQualidade = "Dedicação";
			seuDefeito = "Agressão";
			seuMedo = "Rejeição";
			break;
		case 12:
			seusigno = "Sagitario";
			suaQualidade = "Otimismo";
			seuDefeito = "Impaciência";
			seuMedo = "Tédio";
			break;
		default:
			seusigno = "NULL";
			suaQualidade = "NULL";
			seuDefeito = "NULL";
			seuMedo = "NULL";
			break;
		}

		System.out.println("Seu signo é: " + seusigno);
		System.out.println("Sua maior qualidade é: " + suaQualidade);
		System.out.println("Seu maior defeito é: " + seuDefeito);
		System.out.println("Seu medo é: " + seuMedo);
	}

}
