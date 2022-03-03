public class Main {

    public static void main(String[] args) {
        cliente wellyson = new cliente();
        wellyson.setNome("Wellyson Yago Monteiro da Silva");
        iConta corrente = new contaCorrente(wellyson);
        iConta poupanca = new contaPoupanca(wellyson);

        corrente.depositar(100);
        corrente.transferir(50,poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
