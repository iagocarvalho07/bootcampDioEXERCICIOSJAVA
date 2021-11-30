package AulaEstruturaDeRepetiçãoArraysEmJava;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class javaArraysex001 {
    public static void main(String[] args) {
        int [] vetor = {1, 0, -5, 50, 15, 8, 4};


        System.out.println("vetor: ");
        int count =0;

        while(count < (vetor.length-1)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor inverso: ");
        for (int i = (vetor.length-1); i >= 0; i-- ){
            System.out.print(vetor[i] + " ");
        }
    }
}
