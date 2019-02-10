
package projetoclasses;


public class ClasseCarro {
    
    //atributos
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private int numeroMarchas;
    private int anoFabricacao;
    private int anoModelo;
    private boolean motorLigado = false;
    private String numeroChassi = " ";
    //atributo static
    public static boolean possuiFarol = true;
    public static int quantidadepneus = 5;
    
    
    //declarar os construtores aqui
    public ClasseCarro()
    {
        System.out.println("O Objeto foi criado com o construtor padrão");
    }
   //primeira sobrecarga de construtor
    public ClasseCarro(String marca)
    {
        this.marca = marca;
    }
    //segunda sobrecarga de construtor
    public ClasseCarro(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
        
    }
    //terceira sobrecarga de construtor

    public ClasseCarro(String marca, String modelo, String placa, String cor, int numeroMarchas, int anoFabricacao, int anoModelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.numeroMarchas = numeroMarchas;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }
    
    
    //metodos get e set

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }
    
    public boolean getPossuiFarol()
    {
        return this.possuiFarol;
    }
    
    
    
     //métodos get e set
    //numeroChassi
   
    //metodos
//    public void ligarMotor()
//    {
//        if(motorLigado == false)
//            motorLigado = true;
//        else
//            System.out.println("Motor Ligado");
//    }
//    
//    public void desligarMotor()
//    {
//        if(motorLigado == true)
//            motorLigado = false;
//        else
//            System.out.println("Motor Desligado");
//    }
//    public void acelerar()
//    {
//        
//    }
//    public void frear()
//    {
//        
//    }
//    public void aumentarMarcha()
//    {
//        int aumentar = 0;
//        if(aumentar <= numeroMarchas)
//            aumentar++;
//        else
//            diminuirMarcha();
//    }
//    public void diminuirMarcha()
//    {
//        int diminuir = 0;
//        if(diminuir <= numeroMarchas)
//           diminuir--;
//        
//    }
}
