/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

import java.util.Scanner;

/**
 *
 * @author 326128395
 */
public class Aluno {

    String nome;
    int idade;
    int coragem;
    int inteligencia;
    int ambicao;
    int lealdade;
    String casa;

    void exibirInformacoes() {
        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Ambicao: " + ambicao);
        System.out.println("Lealdade: " + lealdade);
        System.out.println("Casa escolhida: " + casa);
    }

    void calcularCasa() {

        int grifinoria = (2 * coragem) + lealdade;
        int sonserina = (2 * ambicao) + inteligencia;
        int corvinal = (2 * inteligencia) + coragem;
        int lufalufa = (2 * lealdade) + coragem;

        int maior = grifinoria;
        casa = "Grifinoria";

        if (sonserina > maior) {
            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {
            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {
            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String resposta = "s";

        while (resposta.equalsIgnoreCase("s")) {

            Aluno a = new Aluno();

            System.out.println("Digite o nome do aluno:");
            a.nome = sc.nextLine();

            System.out.println("Digite a idade:");
            a.idade = sc.nextInt();

            System.out.println("Digite a coragem:");
            a.coragem = sc.nextInt();

            System.out.println("Digite a inteligencia:");
            a.inteligencia = sc.nextInt();

            System.out.println("Digite a ambicao:");
            a.ambicao = sc.nextInt();

            System.out.println("Digite a lealdade:");
            a.lealdade = sc.nextInt();

            sc.nextLine();

            a.calcularCasa();

            a.exibirInformacoes();

            System.out.println("\nDeseja cadastrar outro aluno? (s/n)");
            resposta = sc.nextLine();
        }

        System.out.println("Programa encerrado!");
    }
}
