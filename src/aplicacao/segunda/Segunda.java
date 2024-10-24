package aplicacao.segunda;

import com.sun.source.tree.IfTree;

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

                // Iniciando a coleta da massa.
                System.out.println("Digite a massa do passageiro (entre 0 e 300 kg): ");
                double massaDoPassageiro = scanner.nextDouble();

                // Caso erre a condição vai ficar no loop
                while (massaDoPassageiro < 0 || massaDoPassageiro > 300) {
                    System.out.println("Entrada inválida. Por favor, insira uma massa válida entre 0 e 300 kg.");
                    massaDoPassageiro = scanner.nextInt();
                }

                // Iniciando a coleta da velocidade
                System.out.println("Digite a velocidade do veículo (entre 0 e 1000 km/h):  ");
                double velocidadeDoVeiculo = scanner.nextDouble();

                // Caso erre a condição vai ficar no loop
                while (velocidadeDoVeiculo < 0 || velocidadeDoVeiculo > 1000) {
                    System.out.println("Velocidade inválida. Por favor, insira uma massa válida entre entre 0 e 1000 km/h .");
                    velocidadeDoVeiculo = scanner.nextInt();
                }
                // foi informado a massa x a velocidade para obter o valor em newton
                double N = massaDoPassageiro * velocidadeDoVeiculo;
                System.out.println("Valor total em Newton " + N);

                // foi feito as variedades nas formulas do if e else
                if (N == 0 || N <= 99) {
                    System.out.println("COLISÃO DE BAIXISSIMA INTENSIDADE:");
                    System.out.println("Escala de danos ao boneco: 2 ");
                } else if (N == 100 || N <= 700) {
                    System.out.println("COLISÃO DE BAIXA INTENSIDADE:");
                    System.out.println("Escala de danos ao boneco: 4 ");
                }else if (N == 701 || N <= 1400) {
                    System.out.println("COLISÃO DE INTENSIDADE MODERADA:");
                    System.out.println("Escala de danos ao boneco: 6 ");
                } else if (N == 1401 || N <= 2100) {
                    System.out.println("COLISÃO DE INTENSIDADE ALTA:");
                    System.out.println("Escala de danos ao boneco: 8 ");
                } else {
                    System.out.println("COLISÃO DE INTENSIDADE ALTÍSSIMA:");
                    System.out.println("Escala de danos ao boneco: 10 ");
                }

            } else if (entradaUsuario == 2) { // Caso selecione a opção 2 o teste é finalizado.
                System.out.println("Processo finalizado!");
                programaAtivo = false;

            } else { // caso a opção de inicio seja 3, o valor daria incorreto e o teste é finalizado.
                System.out.println("Valor incorreto!");
                programaAtivo = false;
            }
        }
    }
}



