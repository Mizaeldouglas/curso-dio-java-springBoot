package ExerciciosLoopsArrays.Loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumber;
        int number;
        int quantPares = 0, quantidImpares = 0;

        System.out.println("Quantidade de Números: ");
        quantNumber = sc.nextInt();
        int count = 0;
        do {
            System.out.println("Numero : ");
            number = sc.nextInt();
            if (number % 2 == 0 ){
                quantPares++;
            }else {
                quantidImpares++;
            }
            count++;
        }while (count < quantNumber);

        System.out.println("Quantidade Par: " + quantPares );
        System.out.println("Quantidade Impar: " + quantidImpares );


    }
}
