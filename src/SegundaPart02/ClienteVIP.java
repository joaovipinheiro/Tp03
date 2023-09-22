package SegundaPart02;

import java.math.BigDecimal;
import java.util.List;

public class ClienteVIP extends Cliente {
    public ClienteVIP(String nome, List<String> email, String seguroSocial, String logradouro, String numero,
                      String bairro, String cidade, String zipCode, BigDecimal saldo) {
        super(nome, email, seguroSocial, logradouro, numero, bairro, cidade, zipCode, saldo);
    }

    public void sacar(BigDecimal valor, boolean usarMenorNota) {
        if (valor.compareTo(BigDecimal.ZERO) > 0 && valor.compareTo(super.getSaldo()) <= 0) {
            if (usarMenorNota) {
                BigDecimal saldoRestante = super.getSaldo().subtract(valor);
                super.setSaldo(saldoRestante);

                System.out.println("Notas entregues:");
                int notas50 = valor.intValue() / 50;
                valor = valor.remainder(BigDecimal.valueOf(50));
                int notas10 = valor.intValue() / 10;
                valor = valor.remainder(BigDecimal.valueOf(10));
                int notas5 = valor.intValue() / 5;
                int notas1 = valor.intValue() % 5;

                System.out.println(notas50 + " de B$50, " + notas10 + " de B$10, " +
                        notas5 + " de B$5 e " + notas1 + " de B$1.");
            } else {
                BigDecimal saldoRestante = super.getSaldo().subtract(valor);
                super.setSaldo(saldoRestante);

                System.out.println("Notas entregues:");
                int notas5 = valor.intValue() / 5;
                int notas1 = valor.intValue() % 5;

                System.out.println("0 de B$50, 0 de B$10, " +
                        notas5 + " de B$5 e " + notas1 + " de B$1.");
            }
        } else {
            System.out.println("Saque inválido. Verifique o valor solicitado.");
        }
    }
}