
package main;

import java.util.Scanner;
import java.util.Calendar;



public class ClasseMain {

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        
        System.out.println("---------------------------");
        System.out.println("-- Digite sua idade: ");
        
        int idade = entrada.nextInt();
        int anoAtual = calendario.get(Calendar.YEAR);
        int anoNascimento = anoAtual - idade;
        
        System.out.println("Você nasceu em: "+ anoNascimento);
        
        
        
        
    }// fim do método main
    
}// fim da ClasseMain
