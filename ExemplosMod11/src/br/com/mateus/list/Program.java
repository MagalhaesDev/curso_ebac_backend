package br.com.mateus.list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas a serem inseridas:");
        int quantityPeople = sc.nextInt();
        sc.nextLine();

        Set<People> peoples = new HashSet<People>();

        for(int i = 0; i < quantityPeople; i++) {
            System.out.print("Digite o nome da  pessoa: ");
            String name = sc.nextLine();

            System.out.print("Digite o sexo da pessoa (Masculino/Feminino):");
            String sexo = sc.nextLine();

            People people = new People(name,sexo);
            peoples.add(people);
        }

        System.out.println("\nPessoas Femininas:");
        for (People pessoa : peoples) {
            if (pessoa.getSexo().equalsIgnoreCase("Feminino")) {
                System.out.println(pessoa);
            }
        }

        System.out.println("\nPessoas Masculinas:");
        for (People pessoa : peoples) {
            if (pessoa.getSexo().equalsIgnoreCase("Masculino")) {
                System.out.println(pessoa);
            }
        }

        sc.close();
    }
}
