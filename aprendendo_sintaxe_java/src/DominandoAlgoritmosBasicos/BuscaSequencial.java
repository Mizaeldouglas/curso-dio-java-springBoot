package DominandoAlgoritmosBasicos;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        leitor.close();

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        System.out.println(buscarArray(n, elementos));

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }

    private static  String buscarArray ( int n , int [] elementos){

        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == n){
                return "Achei " + n + " na posicao " + i;
            }
        }
        return "Numero " + n + " nao encontrado! ";
    }
}