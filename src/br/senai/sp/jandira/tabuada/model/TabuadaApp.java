package br.senai.sp.jandira.tabuada.model;

import java.util.Scanner;

public class TabuadaApp {
    public int multiplicando;
    public int multipladorInicial;
    public int multiplicadorFinal;
    public String[] tabuada;



    public void coletarDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Multiplicando: ");
        multiplicando = leitor.nextInt();

        System.out.println("Multiplicador Inicial: ");
        multipladorInicial = leitor.nextInt();

        System.out.println("Multiplicador Final: ");
        multiplicadorFinal = leitor.nextInt();

        calcularTabuada();

    }

    public void calcularTabuada(){
        int apoio = 0;
        if (multiplicadorFinal < multipladorInicial){
            apoio = multiplicadorFinal;
            multiplicadorFinal = multipladorInicial;
            multipladorInicial = apoio;

        }
        int tamanho = multiplicadorFinal - multipladorInicial + 1;
        tabuada = new String[tamanho];

        int i =0;
        while (i < tamanho){
            int produto = multiplicando * multipladorInicial;
            tabuada[i] = multiplicando + " X " + multipladorInicial + "=" + produto;
            multipladorInicial = multipladorInicial + 1;
            i = i + 1;
        }

        exibirTabuada();
        }
        public void exibirTabuada(){


            int i = 0 ;
            while (i < tabuada.length){
                System.out.println(tabuada[i]);
                i++;
            }
        }

}


