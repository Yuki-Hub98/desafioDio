/*Essa class ficou abstrata para que eu não precise ficar instanciando
conta toda hora e foram criadas class filho contaPoupanca e contaCorrente
para isso.*/

public abstract class conta implements iConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    //Gerando agência e número.
    public conta(cliente cliente){
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
       this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, iConta contaDestino) {
        this.sacar(valor);//Está sacando, pegando o dinheiro da conta corrente
        contaDestino.depositar(valor);// O dinheiro da conta corrente vai para conta poupança.
    }
    

    protected void imprimirStatusConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
