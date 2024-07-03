public class Conta {
    String agencia;
    Double Saldo;
    String nomeCliente;

    public void Saque(Double valorDoSaque){
        if(valorDoSaque > Saldo){
            System.out.println(" Saldo insuficiente!!! " + Saldo);
        }
        else{
            Saldo = Saldo - valorDoSaque;
        }
    }
    public void Depositar(int valorDoDeposito){
        Saldo += valorDoDeposito;
        System.out.println(" Deposito feito com Sucesso!!! Saldo Restante : " + Saldo);
    }
}
