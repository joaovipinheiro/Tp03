package PrimeiraPart03;

import java.util.Scanner;

public class PrimeiraPart03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();

        String  inicial = obterIniciais(nome);

        System.out.println("Essas são as iniciais: " + inicial.toUpperCase());

        scanner.close();
    }

    public static String obterIniciais(String nome) {
        String[] palavras = nome.split(" ");

        StringBuilder inicial = new StringBuilder();

        for (String palavra : palavras) {
            if(!Conector(palavra)) {
                inicial.append(palavra.charAt(0));
            }
        }
        return inicial.toString();
    }

    public static boolean Conector(String palavra) {
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        palavra = palavra.toLowerCase();
        for (String conector : conectores) {
            if(palavra.equals(conector)) {
                return true;
            }
        }
            return false;
        }
    }
