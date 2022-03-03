public class contaPoupanca extends conta {

    public contaPoupanca(cliente cliente){
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("******************$$$$$$$******************");
        System.out.println("========== Extrato Conta Poupanca =========");
        super.imprimirStatusConta();
    }
}
