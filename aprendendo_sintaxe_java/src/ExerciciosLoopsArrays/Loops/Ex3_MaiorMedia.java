package ExerciciosLoopsArrays.Loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.print( "Numero: " );
            numero = sc.nextInt();
            soma = soma + numero;
            if (numero > maior){
                maior = numero;
            }
            count = count + 1;
        }while ( count < 5 );

        System.out.println("Maior Número: " + maior);
        System.out.println("Média dos Números: " + ( soma / 5));

    }
}
