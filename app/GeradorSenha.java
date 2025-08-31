package app;

import java.util.Scanner;

public class GeradorSenha {
    public static void main(String[] args){
        Builder builder = new Builder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos caracteres? ");
        int quantCaracter = scanner.nextInt();

        Scanner tipo = new Scanner(System.in);
        System.out.print("Escolha um dos tipos de senha:\n 1 - Somente números \n 2 - Letras e números \n 3 - Letras, números e caracteres especiais \n");
        int caseSenha = tipo.nextInt();

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros = "123456789";
        String especiais = "!@#$%&*";

        String tipoSenha = "";

        switch (caseSenha) {
            case 1 -> {
                tipoSenha = numeros;
            }
            case 2 -> {
                tipoSenha = letras + numeros;
            }
            case 3 -> {
                tipoSenha = letras + numeros + especiais;
            }
            default -> throw new IllegalArgumentException("Opção inválida!");
        }

        String senhaGerada = builder.gerarSenha(tipoSenha, quantCaracter);
        System.out.println("Senha gerada: " + senhaGerada);
    }
}
