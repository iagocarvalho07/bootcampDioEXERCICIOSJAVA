package AulaEstruturaDeRepetiçãoArraysEmJava;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
import java.util.Scanner;

public class javaex006 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Descubra o fatorial");
        int fatorial = scanner.nextInt();
        int multplicacao = 1;

        System.out.print(fatorial +"! =");
        for (int i = fatorial; i >=1; i--){
            multplicacao = multplicacao*i;
        }
        System.out.println(multplicacao);
    }
}