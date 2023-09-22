package SegundaPart01;

public class DiaNamorados extends CartaoWeb implements CartaoInterface {
    public DiaNamorados(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "mensagem para: " + email + "\n" +
                "Parabéns, " + nome + " pelo Dia dos Namorados.\n" +
                "======================================";
    }
}
