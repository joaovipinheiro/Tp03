package SegundaPart02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando um cliente Standard
        List<String> emailStandard = new ArrayList<>();
        emailStandard.add("cliente_standard@example.com");
        ClienteStandard clienteStandard = new ClienteStandard("Cliente Standard", emailStandard,
                "123-45-6789", "Rua da Padaria", "123", "Centro", "Cidade", "12345-678", new BigDecimal("1000"));

        clienteStandard.depositar(new BigDecimal("500"));

        clienteStandard.sacar(new BigDecimal("50"));

        List<String> emailVIP = new ArrayList<>();
        emailVIP.add("cliente_vip@example.com");
        ClienteVIP clienteVIP = new ClienteVIP("Cliente VIP", emailVIP,
                "987-65-4321", "Avenida do Shopping", "456", "Bairro VIP", "Cidade VIP", "98765-432", new BigDecimal("2000"));

        clienteVIP.depositar(new BigDecimal("1000"));

        clienteVIP.sacar(new BigDecimal("75"), true);

        clienteVIP.sacar(new BigDecimal("36"), false);
    }
}
