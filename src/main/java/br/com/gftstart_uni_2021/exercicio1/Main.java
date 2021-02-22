package br.com.gftstart_uni_2021.exercicio1;

import java.io.*;

import br.com.gftstart_uni_2021.exercicio1.Produto;
import br.com.gftstart_uni_2021.exercicio1.Caixa;

public class Main {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();
        Produto produto1 = new Produto("Banana", 0.99, 3);
        Produto produto2 = new Produto("Energetico", 5.49, 7);
        Produto produto3 = new Produto("Arroz", 20.00, 1);
        Produto produto4 = new Produto("Chocolate", 4.50, 20);
        Produto produto5 = new Produto("Leite", 3.73, 3);
        Produto produto6 = new Produto("Abacaxi", 2.40, 4);


        caixa.calculaValorFinal(7, produto2);
        caixa.calculaValorFinal(1, produto3);
        caixa.calculaValorFinal(20, produto4);
        caixa.calculaValorFinal(3, produto5);
        caixa.calculaValorFinal(4, produto6);

        System.out.println(caixa.calculaValorFinal(3, produto1));
        System.out.println(caixa.calculaValorFinal(7, produto2));
        System.out.println(caixa.calculaValorFinal(1, produto3));
        System.out.println(caixa.calculaValorFinal(20, produto4));
        System.out.println(caixa.calculaValorFinal(3, produto5));
        System.out.println(caixa.calculaValorFinal(4, produto6));
    }

}
