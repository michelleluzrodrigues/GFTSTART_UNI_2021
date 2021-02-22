package br.com.gftstart_uni_2021.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main( String[] args )
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o intevalo inicial:");
        String num1 = leitor.next();

        System.out.println("Digite o intevalo final:");
        String num2 = leitor.next();

        Integer numero1 = Integer.parseInt(num1);
        Integer numero2 = Integer.parseInt(num2);

        if((numero2 -numero1) > 15){
            System.out.println("Intervalo maior que 15");
        }else{
            for (int i = numero1; i < numero2; i++) {
                System.out.println("Cubo de " + i + ": " + (i * i * i));
            }
        }
    }

}
