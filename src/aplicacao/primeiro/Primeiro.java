package aplicacao.primeiro;

import java.util.Scanner;

public class Primeiro {

    public void excutarProjeto() {

        Scanner scanner = new Scanner(System.in);

        boolean programaAtivo = true;

        while (programaAtivo) {

            System.out.println("1 - continuar | 2-encerrar");
            int entradaUsuario = scanner.nextInt();

            if (entradaUsuario == 2) {
                System.out.println("Processo finalizado!");

                programaAtivo = false;

                break;
            }


            System.out.println("Digite a massa do passageiro: ");

            Integer massaDoPassageiro = -1;


            if (massaDoPassageiro >= 0 && massaDoPassageiro <= 300) {
                System.out.println();
            } else
                System.out.println("Entrada inválida. Por favor, insira uma massa valida.");

        }
    }
}















