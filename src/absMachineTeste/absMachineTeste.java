package absMachineTeste;

/**
 *
 * @author Elliot
 */
import java.util.Scanner;

public class absMachineTeste {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Opções de bebida
        String[] bebidas = { "coca-cola", "Guaraná", "Suco de Uva", "Suco de Laranja" }; // array de bebidas

        System.out.println("**Selecione sua Bebida:**");
        System.out.println("1." + bebidas[0]);
        System.out.println("2." + bebidas[1]);
        System.out.println("3." + bebidas[2]);
        System.out.println("4." + bebidas[3]);
        int sabor = scanner.nextInt();
        String saborEscolhido = bebidas[sabor - 1];

        // Validar sabor
        while (sabor < 1 || sabor > 4) {
            System.out.println("**Sabor Inválido. Selecione novamente:**");
            sabor = scanner.nextInt();
        }

        // Opções de tamanho
        String[] tamanhosRefrigerante = { "300ml", "500ml", "700ml" };
        String[] tamanhosSuco = { "300ml", "500ml" };

        System.out.println("**Selecione o Tamanho:**");

        if (sabor <= 2) {
            // Refrigerante
            System.out.println("1." + tamanhosRefrigerante[0]);
            System.out.println("2." + tamanhosRefrigerante[1]);
            System.out.println("3." + tamanhosRefrigerante[2]);
        } else {
            // Suco
            System.out.println("1." + tamanhosSuco[0]);
            System.out.println("2." + tamanhosSuco[1]);
        }
        int tamanho = scanner.nextInt();
        String tamanhoEscolhido;
        if (sabor <= 2) {
            tamanhoEscolhido = tamanhosRefrigerante[tamanho - 1];
        } else {
            tamanhoEscolhido = tamanhosSuco[tamanho - 1];
        }
        // Validar Tamanho
        while (tamanho < 1 || (tamanho > 3 && sabor <= 2)) {
            System.out.println("**Tamanho Inválido. Selecione Novamente:**");
            tamanho = scanner.nextInt();
        }
        // Definir tipo de copo
        String tipoCopo = "papel";
        if (sabor > 2) {
            tipoCopo = "Plástico";
        }
        // Definir se o usuário quer gelo
        System.out.println("**Deseja adicionar gelo?:**");
        System.out.println("**1. Com gelo**");
        System.out.println("**2. Sem gelo**");
        int escolha = scanner.nextInt();

        String quantidadeEscolhida = "";

        switch (escolha) {
            case 1 -> {
                if (sabor <= 2) {
                    // Bebida é refrigerante (coca-cola ou guaraná)
                    quantidadeEscolhida = "6 Pedras de Gelo";
                } else {
                    // Bebida é suco (suco de uva ou suco de laranja)
                    quantidadeEscolhida = "12 Pedras de Gelo";
                }
            }
            case 2 -> // Sem gelo
                quantidadeEscolhida = "Sem Gelo";
            default -> System.out.println("Opção inválida");
        }

        System.out.println(quantidadeEscolhida);

        // Selecionar tipo de pedido
        String[] tampa = { "Tampa sem furo", "Tampa com furo" };

        System.out.println("**Tipo de pedido:**");
        System.out.println("1. Take Out (sem furo)");
        System.out.println("2. Eat In (com furo)");
        int tipoPedido = scanner.nextInt();
        String tipoTampa = "";

        switch (tipoPedido) {
            case 1 -> // Sem furo
                tipoTampa = tampa[0];
            case 2 -> // Com furo
                tipoTampa = tampa[1];
            default -> System.out.println(tipoTampa);
        }

        // Validar tipo de pedido
        while (tipoPedido < 1 || tipoPedido > 2) {
            System.out.println("**Tipo de pedido inválido. Selecione novamente:**");
            tipoPedido = scanner.nextInt();
            System.out.println();
        }

        // Simular preparação da bebida
        System.out.println("**Preparando sua bebida...**");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        // Imprimir os detalhes da bebida
        System.out.println("**Sabor:** " + saborEscolhido);
        System.out.println("**Tamanho:** " + tamanhoEscolhido);
        System.out.println("**Tipo de Copo:** " + tipoCopo);
        System.out.println("**Quantidade de Gelo?:** " + quantidadeEscolhida);
        System.out.println("**Tipo de Tampa:** " + tipoTampa);

    }
}
