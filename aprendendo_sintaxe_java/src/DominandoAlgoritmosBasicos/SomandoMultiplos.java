package DominandoAlgoritmosBasicos;

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int A, N;
        int Result = 0;

        try (Scanner input = new Scanner(System.in)) {
            A = input.nextInt();
            N = input.nextInt();
        }
        // TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        for (int i = 0; i <= N; i = i + A) {
            Result = Result + i;
        }

        System.out.println(Result);
    }
}
