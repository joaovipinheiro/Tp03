package SegundaPart01;

public class CartaoWeb {
    public String email;
    public String nome;

    public  CartaoWeb(String email, String nome) {
        if(isValidEmail(email)) {
            this.email = email;
        } else {
             this.email = "email invalido... (tente novamente)";
        }
        this.nome = nome;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
