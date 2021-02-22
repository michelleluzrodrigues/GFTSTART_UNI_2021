package br.com.gftstart_uni_2021.exercicio4;

public class IPI implements Imposto {

    public Double calculaImposto(double valor) {
        if (valor < 25000)
            return valor * 0.05;
        else
            return valor * 0.1;
    }
}
