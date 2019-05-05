package classes;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Contas {
    
    double taxaReajuste;

    public double getTaxaReajuste() {
        return taxaReajuste;
    }

    public void setTaxaReajuste(double taxaReajuste) {
        this.taxaReajuste = taxaReajuste;
    }

    public void reajustar(){
        this.depositar(this.getSaldo() * (this.taxaReajuste / 100));
        JOptionPane.showMessageDialog(null, "O Saldo da Conta foi reajusta com Sucesso de acordo com a taxa informada.", 
                "Taxa de Reajuste", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void tipoConta(){
        JOptionPane.showMessageDialog(null, "Tipo de conta: Conta Poupança", "Tipo de Conta",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
