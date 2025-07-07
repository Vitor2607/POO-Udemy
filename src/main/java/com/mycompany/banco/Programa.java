/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco;

import entities.Conta;
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o  numero da conta:  ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Deseja fazer  um deposito inicial (s/n)?");
        char decisao = sc.next().charAt(0);
        
       
        if (decisao == 's'|| decisao  == 'S') {
            System.out.println("Digite o valor do deposito  inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }else{
            conta = new Conta(numero, titular);
        }

        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println("Digite o valor do deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Atualizacao dos dados da contal: \n" + conta);

        do {
            System.out.println("Digite o valor do saque: ");
            double valorSaque = sc.nextDouble();
            
            if(conta.getSaldo() >= valorSaque + 5 && valorSaque > 0){
                conta.saque(valorSaque);
                break;
            }else{
                System.out.println("Digite um valor acima de 0 e menor ou igual a " + (conta.getSaldo() - 5));
            }
        } while (true);
    
        System.out.println("Atualizacao dos dados da contal: \n" + conta);

        sc.close();

    }
}
