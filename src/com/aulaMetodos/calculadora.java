package com.aulaMetodos;

public class calculadora {

    public static void soma(double numeral, double numeral2) {
        double resultado = numeral+numeral2;
        System.out.println("a soma de " + numeral + "mais" + numeral2 + "é igual " + resultado);
	// write your code here
    }
    public static void subtracao(double numeral, double numeral2) {
        double resultado = numeral-numeral2;
        System.out.println("a soma de " + numeral + "mais" + numeral2 + "é igual " + resultado);

    }
    public static void divisao(double numeral, double numeral2) {
        double resultado = numeral/numeral2;
        System.out.println("a divisao de " + numeral + "mais" + numeral2 + "é igual " + resultado);

    }
    public static void multiplacacao(double numeral, double numeral2) {
        double resultado = numeral*numeral2;
        System.out.println("a multiplicacao de " + numeral + "mais" + numeral2 + "é igual " + resultado);

    }

}