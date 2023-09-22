package SegundaPart02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private List<String> email;
    private String seguroSocial;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String zipCode;
    private BigDecimal saldo;

    public Cliente(String nome, List<String> email, String seguroSocial, String logradouro, String numero,
                   String bairro, String cidade, String zipCode, BigDecimal saldo) {
        this.nome = nome;
        this.email = email;
        this.seguroSocial = seguroSocial;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.zipCode = zipCode;
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            saldo = saldo.add(valor);
            System.out.println("Depósito de B$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }
}