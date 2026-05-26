/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cecil
 */
import java.util.Scanner;
import pessoa.Pessoa;
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        p.calculaIMC();

        System.out.println("\nNome: " + p.getNome() + " " + p.getSobrenome());
        System.out.println("IMC: " + p.getImc());
        System.out.println("Classificação: " + p.informaObesidade());
}
}
