package PrimeiraPart01;

import java.util.Scanner;

public class PrimeiraPart01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite alguma frase ou palavra: ");
        String input = scanner.nextLine();

        //a
        int caracteres = input.length();
        System.out.println("a) Número de caracteres: " + caracteres);

        //b
        String maiuscula = input.toUpperCase();
        System.out.println("b) Em maiúsculo: " + maiuscula);

        //c
        int numVogais = contarVogais(input);
        System.out.println("c) Númera de vogais: " + numVogais);

        //d
        boolean comecaInf =  input.toUpperCase().startsWith("INF");
        System.out.println("e) Começa com 'INF'? " + comecaInf);

        //e
        boolean terminaInf =  input.toUpperCase().endsWith("NET");
        System.out.println("e) Termina com 'NET'? " + terminaInf);

        //f
        int numDigitos = contarDigitos(input);
        System.out.println("f) Número de dígitos: " + numDigitos);

        //g
        String doisPrimeiros = obterDoisPrimeiros(input);
        System.out.println("g) Dois primeiros dígitos: " + doisPrimeiros);

        //h
        boolean palindromo = Palindromo(input);
        System.out.println("h) é um palíndromo? " + palindromo);

        scanner.close();
    }

    //metodo - c
    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    //metodo - f
    public static int contarDigitos(String texto) {
        int contador = 0;
        for(int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isDigit(c)) {
                contador++;
            }
        }
        return contador;
    }

    //metodo - g
    public static String obterDoisPrimeiros(String texto) {
        if (texto.length() >= 2) {
            return texto.substring(0, 2);
        } else {
            return "A string não tem dois dígitos.";
        }
    }

    //metodo - h
    public static boolean Palindromo(String texto) {
        texto = texto.toLowerCase();
        int esquerda = 0;
        int direita = texto.length() - 1;
        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita++;
        }
        return true;
    }
}