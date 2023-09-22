package PrimeiraPart04;

import java.util.Random;
class AlgoritmosGeneticos {
    public static String[] recombinacao(String s1, String s2) {
        int pontoDeCorte = s1.length() / 2;
        String filho1 = s1.substring(0, pontoDeCorte) + s2.substring(pontoDeCorte);
        String filho2 = s2.substring(0, pontoDeCorte) + s1.substring(pontoDeCorte);

        return new String[] { filho1, filho2 };
    }

    public static String mutacao(String s) {
        Random random = new Random();
        int posicaoAleatoria = random.nextInt(s.length());
        char nucleo = "ACGT".charAt(random.nextInt(4));

        StringBuilder novaCadeia = new StringBuilder(s);
        novaCadeia.setCharAt(posicaoAleatoria, nucleo);

        return novaCadeia.toString();
    }
}
