package DesafioDeCodigoIntermediarioJavaIA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStreamAPI {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

       
        List<String> listaTransacoes = new ArrayList<>();

    
        for(int i=1; i <=quantidadeTransacoes;i++){
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

           
            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                
                listaTransacoes.add(i+". "+ "Deposito de " + valorTransacao);


            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                
                listaTransacoes.add(i+". "+ "Saque de " + valorTransacao);


            } else {
                
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

      
        for(String transcacoes : listaTransacoes){
            
            System.out.println(transcacoes);
        }

        
        scanner.close();
    }
}

