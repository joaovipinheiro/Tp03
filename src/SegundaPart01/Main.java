package SegundaPart01;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<CartaoInterface> cartoes = new LinkedList<>();

        // Criar 5 cartões de diferentes tipos
        cartoes.add(new DiaNamorados("joao0hfodastico@email.com", "João"));
        cartoes.add(new Natal("mariabraga@email.com", "Maria Braga"));
        cartoes.add(new Aniversario("shaolinmatadfordeporco@email.com", "Carlos"));
        cartoes.add(new Pascoa("anadearmasmdsquemulherlinda@email.com", "Ana de Armas"));

        // Percorrer a lista de cartões e imprimir as mensagens
        cartoes.forEach(cartao -> {
            System.out.println(cartao.showMessage());
        });
    }
}

