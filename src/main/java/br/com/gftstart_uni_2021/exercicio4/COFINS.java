package br.com.gftstart_uni_2021.exercicio4;

public class COFINS implements Imposto {

    public Double calculaImposto(double valor) {
        if (valor > 12000)
            return valor * 0.08;

        return 0.0;
    }
}
