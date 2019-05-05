package classes;

import javax.swing.JOptionPane;

public class ContaEspecial extends Contas{

    int limite;
    int opc;
    double multa;

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void descontar(double valor){
        if(this.saldo < valor){
            if(this.limite + this.saldo >= valor){
                opc = JOptionPane.showConfirmDialog(null, "Continuar com a Operação usando o Cheque Especial?", "Descontar Conta Especial", JOptionPane.INFORMATION_MESSAGE);
                if(opc == 0){
                    double aux = this.getSaldo() - valor;
                    aux = aux + (aux * this.multa / 100);
                    this.depositar(aux);
                    JOptionPane.showMessageDialog(null, "Saque efetuado com Sucesso! \nAtenção: a operação foi concluida "
                            + "usando o Limite da Conta Especial.", "Operaão Saque", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ops! Infelizmente o valor do seu Limite foi atingido;");
            }
        }else{
            this.sacar(valor);
        }
    }

    public void tipoConta(){
        JOptionPane.showMessageDialog(null, "Tipo de conta: Conta Poupança", "Tipo de Conta",JOptionPane.INFORMATION_MESSAGE);
    }

}
