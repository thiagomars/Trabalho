package classes;

import javax.swing.JOptionPane;

public class Contas {

    String nome;
    int numero;
    double saldo;
    private static MenuPrincipal mp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        JOptionPane.showMessageDialog(null, "Depósito efetuado com Sucesso. Saldo atual: " + this.saldo, 
                "Operação de DEPÓSITO", JOptionPane.INFORMATION_MESSAGE);
    }

    public void sacar(double valor){
        if(valor <= this.getSaldo()){
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque efetuado com Sucesso. Saldo atual: " + this.saldo, 
                    "Operação de SAQUE", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Saldo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void transferir(int conta1, int conta2, double valor){
        if(conta1 == MenuPrincipal.CC.numero && conta2 == MenuPrincipal.CP.numero){
            if(valor <= MenuPrincipal.CC.saldo){
                MenuPrincipal.CC.sacar(valor);
                MenuPrincipal.CP.depositar(valor);
                JOptionPane.showMessageDialog(null, "A Transferência foi Concluída com Sucesso! \n" + MenuPrincipal.CC.numero + " --> " + MenuPrincipal.CP.numero, 
                        "Operação Transferência", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel completar a transação. Saldo insuficiente.", 
                        "Operação TRANFERÊNCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(conta1 == MenuPrincipal.CC.numero && conta2 == MenuPrincipal.CE.numero){
            if(valor <= MenuPrincipal.CC.saldo){
                MenuPrincipal.CC.sacar(valor);
                MenuPrincipal.CE.depositar(valor);
                JOptionPane.showMessageDialog(null, "A Transferência foi Concluída com Sucesso! \n" + MenuPrincipal.CC.numero + " --> " + MenuPrincipal.CE.numero, 
                        "Operação Transferência", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel completar a transação. Saldo insuficiente.", 
                        "Operação TRANFERÊNCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(conta1 == MenuPrincipal.CP.numero && conta2 == MenuPrincipal.CC.numero){
            if(valor <= MenuPrincipal.CP.saldo){
                MenuPrincipal.CP.sacar(valor);
                MenuPrincipal.CC.depositar(valor);
                JOptionPane.showMessageDialog(null, "A Transferência foi Concluída com Sucesso! \n" + MenuPrincipal.CP.numero + " --> " + MenuPrincipal.CC.numero, 
                        "Operação Transferência", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel completar a transação. Saldo insuficiente.", 
                        "Operação TRANFERÊNCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(conta1 == MenuPrincipal.CP.numero && conta2 == MenuPrincipal.CE.numero){
            if(valor <= MenuPrincipal.CP.saldo){
                MenuPrincipal.CP.sacar(valor);
                MenuPrincipal.CE.depositar(valor);
                JOptionPane.showMessageDialog(null, "A Transferência foi Concluída com Sucesso! \n" + MenuPrincipal.CP.numero + " --> " + MenuPrincipal.CE.numero, 
                        "Operação Transferência", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel completar a transação. Saldo insuficiente.", 
                        "Operação TRANFERÊNCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(conta1 == MenuPrincipal.CE.numero && conta2 == MenuPrincipal.CC.numero){
            if(valor <= MenuPrincipal.CE.saldo){
                MenuPrincipal.CE.sacar(valor);
                MenuPrincipal.CC.depositar(valor);
                JOptionPane.showMessageDialog(null, "A Transferência foi Concluída com Sucesso! \n" + MenuPrincipal.CE.numero + " --> " + MenuPrincipal.CC.numero, 
                        "Operação Transferência", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel completar a transação. Saldo insuficiente.", 
                        "Operação TRANFERÊNCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(conta1 == MenuPrincipal.CE.numero && conta2 == MenuPrincipal.CP.numero){
            if(valor <= MenuPrincipal.CE.saldo){
                MenuPrincipal.CE.sacar(valor);
                MenuPrincipal.CP.depositar(valor);
                JOptionPane.showMessageDialog(null, "A Transferência foi Concluída com Sucesso! \n" + MenuPrincipal.CE.numero + " --> " + MenuPrincipal.CP.numero, 
                        "Operação Transferência", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel completar a transação. Saldo insuficiente.", 
                        "Operação TRANFERÊNCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void tipoConta(){
        JOptionPane.showMessageDialog(null, "Tipo de Conta: Conta-Comum", "Tipo de Conta", JOptionPane.INFORMATION_MESSAGE);
    }

}
