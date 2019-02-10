
package projetoclasses;

import java.util.Scanner;


public class ProjetoClasses {

    
    public static void main(String[] args) {
        //instanciar é omesmo que referenciar
        //instanciar é criar um objeto
         
        //instanciando um objeto da classe Scanner do Java, já criada
        Scanner entradaDados = new Scanner(System.in);//quando colocamos o system.in na realidade
        //estamos adicionando um comando obrigatorio no construtor
        //Scanner entradaDados é uma variável com o nome entradaDados do tipo objeto Scanner
        // e new Scanner() é o construtor da classe Scanner, é obrigatório iniciar com System.in
//   
// 
//        //instanciar um outro objeto da classe Scanner
//        //o construtor já receberáuma variável com um valor atribuido
//        String frase = "Olá Mundo";
//        Scanner entradaFrase = new Scanner(frase);
//        System.out.println(entradaFrase.nextLine());
//        
//        //instanciar nossas classes criadas e criamos um objeto para cada classe
//        ClasseCarro carro = new ClasseCarro();
//        ClasseCasa casa = new ClasseCasa();
//        ClasseContaBancaria conta = new ClasseContaBancaria();
//        ClasseIptu iptu = new ClasseIptu();
//        ClassePessoa pessoa = new ClassePessoa();
//        ClassePizza pizza = new ClassePizza();
//        ClasseProduto produto = new ClasseProduto();
//        ClasseRobo robo = new ClasseRobo();
//        //criar mais objetos
//        ClasseCarro carro1 = new ClasseCarro();
//        ClasseCasa casa1 = new ClasseCasa();
//        ClasseContaBancaria conta1 = new ClasseContaBancaria();
//        ClasseIptu iptu1 = new ClasseIptu();
//        ClassePessoa pessoa1 = new ClassePessoa();
//        ClassePizza pizza1 = new ClassePizza();
//        ClasseProduto produto1 = new ClasseProduto();
//        ClasseRobo robo1 = new ClasseRobo();
//        
//        ClasseCarro carro2 = new ClasseCarro();
//        ClasseCasa casa2 = new ClasseCasa();
//        ClasseContaBancaria conta2 = new ClasseContaBancaria();
//        ClasseIptu iptu2 = new ClasseIptu();
//        ClassePessoa pessoa2 = new ClassePessoa();
//        ClassePizza pizza2 = new ClassePizza();
//        ClasseProduto produto2 = new ClasseProduto();
//        ClasseRobo robo2 = new ClasseRobo();
//        
//        //atribuimos valores para o método set da ClasseCarro na variável
//        //private marca.
//        carro.setMarca("Fiat");
//        carro1.setMarca("Volkswagen");
//        carro2.setMarca("Chevrolet");
        
        //instanciar um objeto com o construtor padrão
        ClasseCarro carroConstrutor = new ClasseCarro();//sem entrada de dados
        System.out.println("");
        //instanciar um objeto com o construtor primeira sobrecarga
        ClasseCarro carroConstrutor1 = new ClasseCarro("Fiat");
        System.out.println("Primeiro Construtor" + carroConstrutor1.getMarca());
        System.out.println("");
        //instanciar um objeto com o construtor segunda sobrecarga
        ClasseCarro carroConstrutor2 = new ClasseCarro("Fiat", "Palio");
        System.out.println("Segundo Construtor" + carroConstrutor2.getMarca()+ "\n" + carroConstrutor2.getModelo());
        System.out.println("");
        //instancia um objeto com o construtor terceira sobrecarga
        ClasseCarro carroConstrutor3 = new ClasseCarro("Fiat", "Pálio", "EDO-9000", "Verde", 6, 2012, 2013);
        System.out.println("Terceiro Construtor" + carroConstrutor3.getMarca() + carroConstrutor3.getModelo()
        + carroConstrutor3.getPlaca() + carroConstrutor3.getCor() + carroConstrutor3.getNumeroMarchas() 
        + carroConstrutor3.getAnoFabricacao() + carroConstrutor3.getAnoModelo());
        System.out.println("");
        
       //modificar para false a variável static possuiFarol
        ClasseCarro.possuiFarol = false;//classe ClasseCarro
       //modificar a quantidade da variavel static quantidade pneus da classe ClasseCarro e não do objeto
        ClasseCarro.quantidadepneus =4;
        
        System.out.println(carroConstrutor.getPossuiFarol());//objto1
        System.out.println(carroConstrutor1.getPossuiFarol());//objto2
        System.out.println(carroConstrutor2.getPossuiFarol());//objeto3
        System.out.println(carroConstrutor3.getPossuiFarol());//objeto4
        System.out.println("");
        System.out.println(ClasseCarro.quantidadepneus);
        
        
//        ClasseCarro carro = new ClasseCarro();//instância da classe ClasseCarro
//        //criamos um objeto com nome carro
//        carro.setNumeroChassi("1234FV5455");
//        carro.setMarca("Fiat");
//        carro.setModelo("Palio");
//        carro.setPlaca("EDO-7900");
//        
//        System.out.println(carro.getNumeroChassi());
//        System.out.println(carro.getMarca());
//        System.out.println(carro.getModelo());
//        System.out.println(carro.getPlaca());
//        
//        System.out.println("");
//        
//        ClasseCarro carro1 = new ClasseCarro();//instância da classe ClasseCarro
//        //criamos um objeto com nome carro
//        carro1.setNumeroChassi("1234FV5455");
//        carro1.setMarca("VW");
//        carro1.setModelo("Gol");
//        carro1.setPlaca("AWQ-7940");
//        
//        System.out.println(carro1.getNumeroChassi());
//        System.out.println(carro1.getMarca());
//        System.out.println(carro1.getModelo());
//        System.out.println(carro1.getPlaca());
//        
//        
    }
    
    
}
