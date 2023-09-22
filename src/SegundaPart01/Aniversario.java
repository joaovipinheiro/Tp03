package SegundaPart01;


public class Aniversario extends CartaoWeb implements CartaoInterface {
    public Aniversario(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "mensagem para: " + email + "\n" +
                "Parabéns, " + nome + " Feliz Aniversário.\n" +
                "======================================";
    }
}
