package PrimeiraPart04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho das cadeias de DNA: ");
        int tamanhoCadeia = scanner.nextInt();

        String cadeia1 = CadeiaDNA.gerarCadeiaDeDna(tamanhoCadeia);
        String cadeia2 = CadeiaDNA.gerarCadeiaDeDna(tamanhoCadeia);

        String[] filhos = AlgoritmosGeneticos.recombinacao(cadeia1, cadeia2);
        String cadeiaMutada = AlgoritmosGeneticos.mutacao(cadeia1);

        System.out.println("Cadeia n1: " + cadeia1);
        System.out.println("Cadeia n2: " + cadeia2);
        System.out.println("Filhos recombiados: " + filhos[0] + " e " + filhos[1]);
        System.out.println("Cadeia mutada: " + cadeiaMutada);

        scanner.close();

    }
}