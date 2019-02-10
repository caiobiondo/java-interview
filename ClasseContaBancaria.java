
package projetoclasses;

import java.math.BigDecimal;
import java.util.Date;


public class ClasseContaBancaria {
    
    //atributos
    private String numeroConta;
    private int numeroAgencia;
    private int codigoCliente;
    private BigDecimal saldoCOnta;
    private Date dataAberturaConta;
    
//    Métodos get e set

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public BigDecimal getSaldoCOnta() {
        return saldoCOnta;
    }

    public void setSaldoCOnta(BigDecimal saldoCOnta) {
        this.saldoCOnta = saldoCOnta;
    }

    public Date getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(Date dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }
    //métodos
//    public void dataAberturaConta ()    
//    {
//        
//    }
//    public void sacar()
//    {
//        
//    }
//    public void depositar()
//    {
//        
//    }
//    public void saldoConta()
//    {
//        
//    }
}
