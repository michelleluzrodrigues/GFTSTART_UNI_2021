package br.com.gftstart_uni_2021.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        String num1 = leitor.next();

        boolean div3 = false;
        boolean div6 = false;
        boolean div7 = false;

        Integer numero1 = Integer.parseInt(num1);

        if (numero1 % 3 == 0) {
            div3 = true;
        }
        if (numero1 % 6 == 0) {
            div6 = true;
        }
        if (numero1 % 7 == 0) {
            div7 = true;
        }

        String resposta = "";

        if (!div3 && !div6 && !div7)
            resposta = "Não é divisilvel por 3, 6 ou 7.";
        else {
            resposta = "Numero Divisivel por:";
            if (div3) {
                resposta = resposta + " 3";
            }
            if (div6) {
                resposta = resposta + " 6";
            }
            if (div7) {
                resposta = resposta + " 7";
            }
        }

        System.out.println(resposta);

    }
}
