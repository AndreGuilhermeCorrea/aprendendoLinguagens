package main;

import entities.Funcionario;
import entities.Hora;

public class ControleHora {


    public static void main(String[] args) {

        Hora horaChegada = new Hora(8, 0, 1);
        Hora horaSaida = new Hora(9, 30, 0);
        Funcionario geddyLee = new Funcionario("Geddy Lee", horaChegada, horaSaida);
        
        System.out.println("Hora de chegada: " + horaChegada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.printf("Horas trabalhadas: %.1f\n",geddyLee.getHorasTrabalhadas());
        

    }

}
