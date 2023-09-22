package PrimeiraPart02;

import java.util.Scanner;

public class PrimeiraPart02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numDigitado = scanner.nextInt();

        String porExtenso = ConversorNumerico.converterExtenso(numDigitado);
        System.out.println("Resultado: " + porExtenso);
        scanner.close();
    }

    public  class ConversorNumerico {

        public static String converterExtenso(int numero) {
            String[] numeros = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "novo"};
            String numStr = Integer.toString(numero);

            String porExtenso = "";
            for (int i = 0; i < numStr.length(); i++) {
                char digito = numStr.charAt(i);

                int valor = Character.getNumericValue(digito);

                porExtenso += numeros[valor];

                if (i < numStr.length() - 1) {
                    porExtenso += ", ";
                }
            }
            return porExtenso;
        }
    }
}