package PrimeiraPart04;

import java.util.Scanner;
import java.util.Random;
public class CadeiaDNA {
    public static String gerarCadeiaDeDna(int tamanho) {
        Random random = new Random();
        StringBuilder cadeia = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            char proteina = "ACGT".charAt(random.nextInt(4));
            cadeia.append(proteina);
        }

        return cadeia.toString();
    }
}
