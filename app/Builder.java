package app;

import java.util.Random;

public class Builder {
    public String tipoSenha;

    private Random random = new Random();

    public String gerarSenha(String tipoSenha, int quantCaracter) {
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < quantCaracter; i++) {
            int index = random.nextInt(tipoSenha.length());
            senha.append(tipoSenha.charAt(index));
        }

        return senha.toString();
    }
}
