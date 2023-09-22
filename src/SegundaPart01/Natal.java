package SegundaPart01;


public class Natal extends CartaoWeb implements CartaoInterface {
    public Natal(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "mensagem para: " + email + "\n" +
                "Parabéns, " + nome + " Feliz Natal.\n" +
                "======================================";
    }
}
