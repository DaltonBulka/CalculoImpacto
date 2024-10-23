package aplicacao.segunda;

import java.util.Scanner;

public class Segunda {
    public void excutarProjeto() {

        Scanner scanner = new Scanner(System.in);

        boolean programaAtivo = true;

        while (programaAtivo) {

            System.out.println("==================================================================================");
            System.out.println("1 - continuar | 2 - encerrar");
            int entradaUsuario = scanner.nextInt();

            if (entradaUsuario == 1) {

                System.out.println("Digite a massa do passageiro (entre 0 e 300 kg): ");
                int massaDoPassageiro = scanner.nextInt();

                while (massaDoPassageiro < 0 || massaDoPassageiro > 300) {

                    System.out.println("Entrada inválida. Por favor, insira uma massa válida entre 0 e 300 kg.");
                    massaDoPassageiro = scanner.nextInt();
                }
                System.out.println("Digite a velocidade do veículo (entre 0 e 1000 km/h):  ");
                int velocidadeDoVeiculo = scanner.nextInt();
                while (velocidadeDoVeiculo < 0 || velocidadeDoVeiculo > 1000) {

                    System.out.println("Velocidade inválida. Por favor, insira uma massa válida entre entre 0 e 1000 km/h .");
                    velocidadeDoVeiculo = scanner.nextInt();
                }

            } else if (entradaUsuario == 2) {

                System.out.println("Processo finalizado!");
                programaAtivo = false;

            } else {

                System.out.println("Valor incorreto!");
            }
        }
    }
}



