package SegundaPart01;


public class Pascoa extends CartaoWeb implements CartaoInterface {
    public Pascoa(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "mensagem para: " + email + "\n" +
                "Parabéns, " + nome + " Feliz Páscoa.\n" +
                "======================================";
    }
}
